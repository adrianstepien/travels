function initAllMarkers(map, drawnItems) {
    $.ajax({
        type: "GET",
        dataType: "json",
        url: "/travel/getAllMarkers",
        success: function (dataJson) {
            for(i = 0; i<dataJson.length; i++) {
                var marker = L.marker([dataJson[i].lat,dataJson[i].lng]).addTo(map).bindPopup(dataJson[i].lat);
                drawnItems.addLayer(marker);
                marker.on('click', function(event) {
                    new L.Toolbar2.EditToolbar.Popup(event.latlng, {
                        actions: editActions
                    }).addTo(map, marker);
                });
            }
        }
    });
}