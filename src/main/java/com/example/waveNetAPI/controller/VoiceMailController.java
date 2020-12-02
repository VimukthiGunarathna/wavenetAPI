package com.example.waveNetAPI.controller;

import com.example.waveNetAPI.models.Subscriber;
import com.example.waveNetAPI.models.VoiceMail;
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
public class VoiceMailController {

    Logger log = LoggerFactory.getLogger(VoiceMailService.class);
    @Autowired
    VoiceMailService service; // Service which will do all the data manipulations

    // POST CALLS
    @PostMapping("/addVoiceMail")
    public ResponseEntity<Subscriber> addMovie(@RequestBody VoiceMail voiceMail){
        try {
            log.info("voicemail",voiceMail.toString());
            service.addVoiceMail(voiceMail);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }

    // GET CALLS
    @GetMapping("/getAllMails")
    public List<VoiceMail> getAllMovies() {
        return  service.getAllVoiceMails();
    }

    @GetMapping("/getMailById/{id}")
    public ResponseEntity<VoiceMail> getMailById(@PathVariable("id") int id ) {
        try {
            VoiceMail movie = service.getVoiceMailById(id);
            return new ResponseEntity<VoiceMail>(movie, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<VoiceMail>(HttpStatus.NOT_FOUND);
        }
    }

    // DELETE CALLS
    @DeleteMapping("/deleteVoiceMail/{id}")
    public void deleteMovie(@PathVariable("id") int id){
        service.deleteVoiceMail(id);
    }
}
