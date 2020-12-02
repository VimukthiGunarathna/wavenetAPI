package com.example.waveNetAPI.service;

import com.example.waveNetAPI.models.Subscriber;

import java.util.List;

public interface SubscriberService {
    void addSubscriber(Subscriber subscriber);
    List<Subscriber> getAllSubscribers();
    Subscriber getSubscriberById(Integer subscriber_id);
    void deleteSubscriber(int subscriber_id);
}
