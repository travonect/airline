package com.travonect.api.controller;

import com.travonect.api.model.trip.Trip;
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

    @RequestMapping(method = RequestMethod.GET, value = "/getTripByPnr", consumes = MediaType.TEXT_PLAIN_VALUE)
    public Trip read(@RequestBody String pnr) {
        return tripService.getTripByPnr(pnr);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Trip trip) {
        tripService.update(trip);
    }

    @RequestMapping(value = "/deleteTripByPnr", method = RequestMethod.DELETE, consumes = MediaType.TEXT_PLAIN_VALUE)
    public void delete(@RequestBody String pnr) {
        tripService.deleteTripByPnr(pnr);
    }

}
