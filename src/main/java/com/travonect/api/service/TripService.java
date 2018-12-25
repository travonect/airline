package com.travonect.api.service;

import com.travonect.api.model.trip.Destination;
import com.travonect.api.model.trip.Source;
import com.travonect.api.model.trip.TravellingInfo;
import com.travonect.api.model.trip.Trip;
import com.travonect.api.model.trip.TripDetails;
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

    public Trip getTripByTripId(String tripId) {
        return tripRepository.findOneByTripId(tripId);
    }

    public Trip update(Trip trip) {
        return tripRepository.save(trip);
    }

    public void deleteTripByTripId(String tripId) {
        tripRepository.delete(this.getTripByTripId(tripId));
    }

    public Trip getTripBySource(Source source) {
        return tripRepository.findAll().stream().filter(trip -> {
            return trip.getTripDetails().getSource().getAirportCode().equalsIgnoreCase(source.getAirportCode())
                    && trip.getTripDetails().getSource().getAirportName().equalsIgnoreCase(source.getAirportName()) && trip.getTripDetails().getSource().getDepartureTime().equals(source.getDepartureTime());
        }).findFirst().orElse(null);
    }

    public Trip getTripByDestination(Destination destination) {
        return tripRepository.findAll().stream().filter(trip -> {
            return trip.getTripDetails().getDestination().getAirportCode().equalsIgnoreCase(destination.getAirportCode())
                    && trip.getTripDetails().getDestination().getAirportName().equalsIgnoreCase(destination.getAirportName()) && trip.getTripDetails().getDestination().getArrivalTime().equals(destination.getArrivalTime());
        }).findFirst().orElse(null);
    }

    public Trip updateTripDetails(String tripId, TripDetails tripDetails) {
        Trip tripByTripId = getTripByTripId(tripId);
        tripByTripId.setTripDetails(tripDetails);
        return tripRepository.save(tripByTripId);
    }

    public Trip updateTravellingInfo(String tripId, TravellingInfo travellingInfo) {
        Trip tripByTripId = getTripByTripId(tripId);
        tripByTripId.setTravellingInfo(travellingInfo);
        return tripRepository.save(tripByTripId);
    }

}
