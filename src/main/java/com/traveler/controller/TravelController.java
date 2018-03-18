package com.traveler.controller;

import com.traveler.dao.entity.Travel;
import com.traveler.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/travel")
public class TravelController {
    @Autowired
    private TravelService travelService;

    @RequestMapping(value = "/getAll")
    public List<Travel> getAllTravels() {
        return travelService.getAllTravels();
    }

    @RequestMapping(value = "/getById/{travelId}")
    public Travel getTravelById(@PathVariable("travelId") long travelId) {
        return travelService.getTravelById(travelId);
    }
}
