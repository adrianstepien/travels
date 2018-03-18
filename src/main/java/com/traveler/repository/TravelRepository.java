package com.traveler.repository;

import com.traveler.dao.entity.Travel;
import org.springframework.data.repository.CrudRepository;

public interface TravelRepository extends CrudRepository<Travel, Long>{
}
