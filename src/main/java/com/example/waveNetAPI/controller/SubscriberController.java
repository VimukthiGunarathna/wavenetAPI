package com.example.waveNetAPI.controller;

import com.example.waveNetAPI.models.Subscriber;
import com.example.waveNetAPI.service.SubscriberService;
import com.example.waveNetAPI.service.VoiceMailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SubscriberController {

    Logger log = LoggerFactory.getLogger(SubscriberService.class);
    @Autowired
    SubscriberService service; // Service which will do all the data manipulations

    // POST CALLS
    @PostMapping("/addSubscriber")
    public ResponseEntity<Subscriber> addSubscriber(@RequestBody Subscriber subscriber){
        try {
            log.info("subscriber",subscriber.toString());
            service.addSubscriber(subscriber);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }

    // GET CALLS
    @GetMapping("/getAllSubscribers")
    public List<Subscriber> getAllSubscribers() {
        return  service.getAllSubscribers();
    }

    @GetMapping("/getSubscriber/{id}")
    public ResponseEntity<Subscriber> getMovie(@PathVariable("id") int id ) {
        try {
            Subscriber subscriber = service.getSubscriberById(id);
            return new ResponseEntity<Subscriber>(subscriber, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<Subscriber>(HttpStatus.NOT_FOUND);
        }
    }

    // DELETE CALLS
    @DeleteMapping("/deleteMSubscriber/{id}")
    public void deleteMovie(@PathVariable("id") int id){
        service.deleteSubscriber(id);
    }
}
