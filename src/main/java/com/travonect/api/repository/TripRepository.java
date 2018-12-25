package com.travonect.api.repository;

import com.travonect.api.model.trip.Trip;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TripRepository extends MongoRepository<Trip, String> {

    public Trip findOneByTripId(String tripId);
    
    public List<Trip> findByTripIdIn(List<String> tripId);

}
