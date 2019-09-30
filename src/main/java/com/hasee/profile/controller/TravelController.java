package com.hasee.profile.controller;

import com.hasee.profile.exception.ResourceNotFoundException;
import com.hasee.profile.model.Travel;
import com.hasee.profile.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class TravelController {
    @Autowired
    TravelRepository travelRepository;

    @GetMapping("travel")
    public List<Travel> getAllTravel(){
        return travelRepository.findAll();
    }

    @GetMapping("travel/{id}")
    public Travel getTravel(@PathVariable(name = "id") long id){
        return travelRepository.findById(id) .orElseThrow(()->new ResourceNotFoundException("id","id",id));
    }

    @GetMapping("travel/nickname/{nickname}")
    public Travel getTravelByNickname(@PathVariable(name = "nickname") String nickname) throws Exception {
        return travelRepository.findByNickname(nickname);
    }

    @PostMapping("travel")
    public Travel saveTravel(@RequestBody Travel travel){
        return travelRepository.save(travel);
    }

    @PutMapping("travel/{id}")
    public Travel updateTravel(@PathVariable(name = "id") long id, @RequestBody Travel travel){
        Travel travel1 = travelRepository.findById(id) .orElseThrow(()->new ResourceNotFoundException("id","id",id));
        travel1.setArrivalAirport(travel.getArrivalAirport());
        travel1.setArrivingFlight(travel.getArrivingFlight());
        travel1.setArrivingFrom(travel.getArrivingFrom());
        travel1.setCommercialGood(travel.getCommercialGood());
        travel1.setCurrencyExceedingValue(travel.getCurrencyExceedingValue());
        travel1.setDerivatives(travel.getDerivatives());
        travel1.setDurationOfStay(travel.getDurationOfStay());
        travel1.setFirearms(travel.getFirearms());
        travel1.setNickname(travel.getNickname());
        travel1.setLiveAnimalOrPlant(travel.getLiveAnimalOrPlant());
        return travelRepository.save(travel1);
    }

    @DeleteMapping("travel/{id}")
    public long deleteTravel(@PathVariable(name = "id") long id) throws Exception {
        Travel travel = travelRepository.findById(id) .orElseThrow(() ->new ResourceNotFoundException("id","id",id));
        travelRepository.delete(travel);
        return id;
    }
}
