package com.example.waveNetAPI.service;

import com.example.waveNetAPI.dao.SubscriberDao;
import com.example.waveNetAPI.models.Subscriber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SubscriberServiceImpl implements SubscriberService {

    @Autowired
    SubscriberDao subscriberDao;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberDao.save(subscriber);
    }

    @Override
    public List<Subscriber> getAllSubscribers() {
        return subscriberDao.findAll();
    }

    @Override
    public Subscriber getSubscriberById(Integer subscriber_id) {
        return subscriberDao.findById(subscriber_id).get();
    }

    @Override
    public void deleteSubscriber(int subscriber_id) {
        subscriberDao.deleteById(subscriber_id);
    }
}
