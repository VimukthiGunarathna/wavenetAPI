package com.example.waveNetAPI.service;

import com.example.waveNetAPI.dao.SubscriberDao;
import com.example.waveNetAPI.dao.VoiceMailDao;
import com.example.waveNetAPI.models.VoiceMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VoiceMailServiceImpl implements VoiceMailService {

    @Autowired
    VoiceMailDao voiceMailDao;

    @Override
    public void addVoiceMail(VoiceMail voiceMail) {
        voiceMailDao.save(voiceMail);
    }

    @Override
    public List<VoiceMail> getAllVoiceMails() {
        return voiceMailDao.findAll();
    }

    @Override
    public VoiceMail getVoiceMailById(Integer voiceMail) {
        return voiceMailDao.findById(voiceMail).get();
    }

    @Override
    public void deleteVoiceMail(int voiceMail) {
        voiceMailDao.deleteById(voiceMail);
    }
}
