package com.example.avisagal.myapplication;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MessagesDB {


    private static final MessagesDB ourInstance = new MessagesDB();

    public static MessagesDB getInstance() {
        return ourInstance;
    }
    // Write a message to the database

    public FirebaseDatabase database;
    public DatabaseReference myRef;

    private MessagesDB(){
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("MessagesDB");
    }

    public void addMsg(Message msg){
        myRef.child(msg.getUserName()).setValue(msg);
    }
}
