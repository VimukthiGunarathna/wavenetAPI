package com.example.waveNetAPI.service;

import com.example.waveNetAPI.models.Subscriber;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SubscriberServiceImpl implements SubscriberService {

    @Override
    public void addSubscriber(Subscriber subscriber) {

    }

    @Override
    public List<Subscriber> getAllSubscribers() {
        return null;
    }

    @Override
    public Subscriber getSubscriberById(Subscriber subscriber_id) {
        return null;
    }

    @Override
    public void deleteSubscriber(int subscriber_id) {

    }
}
