package com.travonect.api.controller;

import com.travonect.api.model.trip.Destination;
import com.travonect.api.model.trip.Source;
import com.travonect.api.model.trip.TravellingInfo;
import com.travonect.api.model.trip.Trip;
import com.travonect.api.model.trip.TripDetails;
import com.travonect.api.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trip")
public class TripController {

    @Autowired
    TripService tripService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Trip trip) {
        tripService.create(trip);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getTripByTripId", consumes = MediaType.TEXT_PLAIN_VALUE)
    public Trip read(@RequestBody String tripId) {
        return tripService.getTripByTripId(tripId);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Trip trip) {
        tripService.update(trip);
    }

    @RequestMapping(value = "/deleteTripByTripId", method = RequestMethod.DELETE, consumes = MediaType.TEXT_PLAIN_VALUE)
    public void delete(@RequestBody String tripID) {
        tripService.deleteTripByTripId(tripID);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getTripBySource", consumes = MediaType.TEXT_PLAIN_VALUE)
    public Trip read(@RequestBody Source source) {
        return tripService.getTripBySource(source);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getTripByDestination", consumes = MediaType.TEXT_PLAIN_VALUE)
    public Trip read(@RequestBody Destination destination) {
        return tripService.getTripByDestination(destination);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/updateTripDetails", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateTripDetails(@RequestBody String tripId, @RequestBody TripDetails tripDetails) {
        tripService.updateTripDetails(tripId, tripDetails);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/updateTravellingInfo", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateTravellingInfo(@RequestBody String tripId, @RequestBody TravellingInfo travellingInfo) {
        tripService.updateTravellingInfo(tripId, travellingInfo);
    }

}
