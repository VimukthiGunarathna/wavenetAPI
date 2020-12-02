package com.example.waveNetAPI.controller;

import com.example.waveNetAPI.service.VoiceMailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VoiceMailController {

    Logger log = LoggerFactory.getLogger(VoiceMailService.class);
    @Autowired
    VoiceMailService service; // Service which will do all the data manipulations
}
