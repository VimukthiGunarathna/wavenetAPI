package com.example.waveNetAPI.dao;

import com.example.waveNetAPI.models.VoiceMail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoiceMailDao extends JpaRepository<VoiceMail,Integer> {
}
