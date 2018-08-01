<html>
<head>
    <title>Map page</title>
    <link rel="stylesheet" href="../../resources/js/leaflet/leaflet.css" />
    <link rel="stylesheet" href="../../resources/js/leaflet-draw/leaflet.draw.css"/>
    <link rel="stylesheet" href="../../resources/js/leaflet-toolbar/leaflet.toolbar.css"/>
    <link rel="stylesheet" href="../../resources/js/leaflet-draw-toolbar/leaflet.draw-toolbar.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="../../resources/js/leaflet/leaflet-src.js"></script>
    <script src="../../resources/js/leaflet-toolbar/leaflet.toolbar-src.js"></script>
    <script src="../../resources/js/leaflet-draw/leaflet.draw-src.js"></script>
    <script src="../../resources/js/leaflet-draw-toolbar/leaflet.draw-toolbar.js"></script>
    <script src="../../resources/js/marker.js"></script>
</head>
<body >
    <div id="map" style="height: 510px; width: 500px;"></div>
    <script>
        var map = L.map('map').setView([41.7896,-87.5996], 15),
            drawnItems = new L.FeatureGroup().addTo(map),
            editActions = [
                L.Toolbar2.EditAction.Popup.Edit,
                L.Toolbar2.EditAction.Popup.Delete
            ];
        L.tileLayer("http://tile.stamen.com/terrain/{z}/{x}/{y}.jpg", {
            attribution: 'Map tiles by <a href="http://stamen.com">Stamen Design</a>, under <a href="http://creativecommons.org/licenses/by/3.0">CC BY 3.0</a>. Data by <a href="http://openstreetmap.org">OpenStreetMap</a>, under <a href="http://creativecommons.org/licenses/by-sa/3.0">CC BY SA</a>.'
        }).addTo(map);
        new L.Toolbar2.DrawToolbar({
            position: 'topleft',
        }).addTo(map);

        initAllMarkers(map, drawnItems);

        map.on('draw:created', function(evt) {
            var	type = evt.layerType,
                layer = evt.layer;
            drawnItems.addLayer(layer);

            $.ajax({
                type: "POST",
                dataType: "json",
                url: "/travel/addTravel",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(evt.layer._latlng),
                success: function (dataJson) {
                    console.log("dodalem  ");
                }
            });

            layer.on('click', function(event) {
                new L.Toolbar2.EditToolbar.Popup(event.latlng, {
                    actions: editActions
                }).addTo(map, layer);
            });
        });
    </script>
</body>

</html>