package com.traveler.repository.impl;

import com.traveler.dao.entity.Marker;
import com.traveler.repository.MarkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MarkerRepositoryImpl implements MarkerRepository{
    @Autowired
    private DataSource dataSource;

    public void addMarker(String lat, String lng){
        if (!lat.isEmpty() && !lng.isEmpty()) {
            try {
                Connection connection = dataSource.getConnection();
                PreparedStatement ps = connection.prepareStatement("INSERT INTO MARKER (MARKER_ID, LAT, LNG) VALUES ((SELECT MAX(MARKER_ID)+1 FROM MARKER), ?, ?)");
                ps.setString(1, lat);
                ps.setString(2, lng);
                ps.execute();
            } catch (SQLException sqlException) {
                System.err.print(sqlException);
            }
        }
    }

    public List<Marker> findAllMarkers(){
        List<Marker> listOfMarkers = new ArrayList<>();
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM MARKER");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listOfMarkers.add(new Marker(rs.getLong("marker_id"), rs.getString("lat"), rs.getString("lng")));
            }
        }catch (SQLException sqlException) {
            System.err.print(sqlException);
        }
        return listOfMarkers;
    }

    public void deleteMarkerById(Long markerId){

    }
}
