package com.example.waveNetAPI.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Subscriber {

    enum Status {
        LOCKED,
        UNLOCKED
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subscriber_id;
    private int msisdn;
    private int pin;
    private Status acc_status;

    public Subscriber() {
    }

    public Subscriber(int msisdn, int pin, Status acc_status) {
        this.msisdn = msisdn;
        this.pin = pin;
        this.acc_status = acc_status;
    }

    public Subscriber(int subscriber_id, int msisdn, int pin, Status acc_status) {
        this.subscriber_id = subscriber_id;
        this.msisdn = msisdn;
        this.pin = pin;
        this.acc_status = acc_status;
    }

    public int getSubscriber_id() {
        return subscriber_id;
    }

    public void setSubscriber_id(int subscriber_id) {
        this.subscriber_id = subscriber_id;
    }

    public int getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(int msisdn) {
        this.msisdn = msisdn;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Status getAcc_status() {
        return acc_status;
    }

    public void setAcc_status(Status acc_status) {
        this.acc_status = acc_status;
    }
}
