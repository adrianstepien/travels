package com.traveler.repository;

import com.traveler.dao.entity.Marker;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MarkerRepository {
    void addMarker(String lat, String lng);
    List<Marker> findAllMarkers();
    void deleteMarkerById(Long markerId);
}
