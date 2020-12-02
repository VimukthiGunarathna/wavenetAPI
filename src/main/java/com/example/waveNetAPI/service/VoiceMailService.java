package com.example.waveNetAPI.service;

import com.example.waveNetAPI.models.Subscriber;
import com.example.waveNetAPI.models.VoiceMail;

import java.util.List;

public interface VoiceMailService {
    void addVoiceMail(VoiceMail voiceMail);
    List<VoiceMail> getAllVoiceMails();
    VoiceMail getVoiceMailById(VoiceMail voiceMail);
    void deleteVoiceMail(int voiceMail);
}
