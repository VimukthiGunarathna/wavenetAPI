package com.example.waveNetAPI.service;

import com.example.waveNetAPI.models.VoiceMail;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VoiceMailServiceImpl implements VoiceMailService {

    @Override
    public void addVoiceMail(VoiceMail voiceMail) {

    }

    @Override
    public List<VoiceMail> getAllVoiceMails() {
        return null;
    }

    @Override
    public VoiceMail getVoiceMailById(VoiceMail voiceMail) {
        return null;
    }

    @Override
    public void deleteVoiceMail(int voiceMail) {

    }
}
