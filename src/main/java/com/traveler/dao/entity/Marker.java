package com.traveler.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class describe marker on the map
 */
@Entity
@Table(name = "MARKER")
public class Marker {
    @Id
    private Long markerId;
    private String lat;
    private String lng;

    public Marker() {
    }

    public Marker(Long markerId, String lat, String lng) {
        this.markerId = markerId;
        this.lat = lat;
        this.lng = lng;
    }

    public Long getMarkerId() {
        return markerId;
    }

    public void setMarkerId(Long markerId) {
        this.markerId = markerId;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
