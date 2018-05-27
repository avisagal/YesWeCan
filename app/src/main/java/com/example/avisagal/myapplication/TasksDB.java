package com.example.avisagal.myapplication;

import com.google.android.gms.tasks.Tasks;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TasksDB {

    private static final TasksDB ourInstance = new TasksDB();

    public static TasksDB getInstance() {
        return ourInstance;
    }
    // Write a message to the database

    public FirebaseDatabase database;
    public DatabaseReference myRef;

    private TasksDB(){
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("TasksDB");
    }

    public void addTask(Task task){
        myRef.child(task.getUserName()).setValue(task);
    }
}
