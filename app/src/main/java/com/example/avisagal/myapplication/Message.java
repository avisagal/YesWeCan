package com.example.avisagal.myapplication;

public class Message {

    public String userName, challange, from, message;

    public Message(String userName, String challange, String from, String message) {
        this.userName = userName;
        this.challange = challange;
        this.from = from;
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getChallange() {
        return challange;
    }

    public void setChallange(String challange) {
        this.challange = challange;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
