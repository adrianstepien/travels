package com.traveler.service;

import com.traveler.dao.entity.Marker;
import com.traveler.repository.MarkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkerService {
    @Autowired
    private MarkerRepository markerRepository;

    public List<Marker> getAllMarkers() {
        return markerRepository.findAllMarkers();
    }

    public void addMarker(String header) {
        markerRepository.addMarker(parseHeaderToLat(header), parseHeaderToLng(header));
    }

    private String parseHeaderToLat(String header) {
        header = header.replace("{\"lat\":", "");
        header = header.substring(0, header.indexOf(","));
        return header;
    }

    private String parseHeaderToLng(String header) {
        return header.substring(header.indexOf("lng\":")+5, header.indexOf("}"));
    }
}
