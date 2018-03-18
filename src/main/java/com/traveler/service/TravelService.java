package com.traveler.service;

import com.traveler.dao.entity.Travel;
import com.traveler.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement all methods to manage travels
 */
@Service
public class TravelService {
    @Autowired
    private TravelRepository travelRepository;

    public Travel getTravelById(Long travelId) {
        return travelRepository.findById(travelId).get();
    }

    public List<Travel> getAllTravels() {
        List<Travel> listOfTravels = new ArrayList<>();
        for (Travel travel : travelRepository.findAll()) {
            listOfTravels.add(travel);
        }
        return listOfTravels;
    }
}
