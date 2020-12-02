package com.example.waveNetAPI.dao;

import com.example.waveNetAPI.models.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberDao extends JpaRepository<Subscriber,Integer> {
}
