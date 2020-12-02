package com.example.waveNetAPI.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VoiceMail {

    enum Status {
        READ,
        UNREAD
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int voicemail_id;
    private int sender_msisdn;
    private int receiver_msisdn;
    private String date_time;
    private Status msg_status;
    private String voicemail_url;

    public VoiceMail() {
    }

    public VoiceMail(int sender_msisdn, int receiver_msisdn, String date_time, Status msg_status, String voicemail_url) {
        this.sender_msisdn = sender_msisdn;
        this.receiver_msisdn = receiver_msisdn;
        this.date_time = date_time;
        this.msg_status = msg_status;
        this.voicemail_url = voicemail_url;
    }

    public VoiceMail(int voicemail_id, int sender_msisdn, int receiver_msisdn, String date_time, Status msg_status, String voicemail_url) {
        this.voicemail_id = voicemail_id;
        this.sender_msisdn = sender_msisdn;
        this.receiver_msisdn = receiver_msisdn;
        this.date_time = date_time;
        this.msg_status = msg_status;
        this.voicemail_url = voicemail_url;
    }

    public int getVoicemail_id() {
        return voicemail_id;
    }

    public void setVoicemail_id(int voicemail_id) {
        this.voicemail_id = voicemail_id;
    }

    public int getSender_msisdn() {
        return sender_msisdn;
    }

    public void setSender_msisdn(int sender_msisdn) {
        this.sender_msisdn = sender_msisdn;
    }

    public int getReceiver_msisdn() {
        return receiver_msisdn;
    }

    public void setReceiver_msisdn(int receiver_msisdn) {
        this.receiver_msisdn = receiver_msisdn;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public Status getMsg_status() {
        return msg_status;
    }

    public void setMsg_status(Status msg_status) {
        this.msg_status = msg_status;
    }

    public String getVoicemail_url() {
        return voicemail_url;
    }

    public void setVoicemail_url(String voicemail_url) {
        this.voicemail_url = voicemail_url;
    }
}
