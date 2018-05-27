package com.example.avisagal.myapplication;

public class Task {

    public String userName, challange, taskName;
    public int status;

    public Task(String userName, String challange, String taskName, int status) {
        this.userName = userName;
        this.challange = challange;
        this.taskName = taskName;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public String getChallange() {
        return challange;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getStatus() {
        return status;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setChallange(String challange) {
        this.challange = challange;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
