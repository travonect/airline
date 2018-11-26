package com.travonect.api.repository;

import com.travonect.api.model.trip.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TripRepository extends MongoRepository<Trip, String> {

    public Trip findOneByPnr(String pnr);

}
