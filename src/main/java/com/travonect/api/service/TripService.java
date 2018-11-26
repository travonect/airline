package com.travonect.api.service;

import com.travonect.api.model.trip.Trip;
import com.travonect.api.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {

    @Autowired
    TripRepository tripRepository;

    public Trip create(Trip trip) {
        return tripRepository.save(trip);
    }

    public Trip getTripByPnr(String pnr) {
        return tripRepository.findOneByPnr(pnr);
    }

    public Trip update(Trip trip) {
        return tripRepository.save(trip);
    }

    public void deleteTripByPnr(String pnr) {
        tripRepository.delete(this.getTripByPnr(pnr));
    }

}
