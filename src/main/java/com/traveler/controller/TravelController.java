package com.traveler.controller;

import com.traveler.dao.entity.Marker;
import com.traveler.dao.entity.Travel;
import com.traveler.service.MarkerService;
import com.traveler.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/travel")
public class TravelController {
    @Autowired
    private TravelService travelService;
    @Autowired
    private MarkerService markerService;

    @RequestMapping(value = "/getAll")
    public List<Travel> getAllTravels() {
        return travelService.getAllTravels();
    }

    @RequestMapping(value = "/getById/{travelId}")
    public Travel getTravelById(@PathVariable("travelId") long travelId) {
        return travelService.getTravelById(travelId);
    }

    @RequestMapping(value = "/addTravel", method = RequestMethod.POST)
    public void addTravel(@RequestBody String header) {
        markerService.addMarker(header);
    }

    @RequestMapping(value = "/getAllMarkers", method = RequestMethod.GET)
    public List<Marker> getAllMarkers() {
        return markerService.getAllMarkers();
    }
}
