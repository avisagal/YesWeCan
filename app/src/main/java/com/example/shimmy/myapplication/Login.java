package com.example.shimmy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView name, password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = (TextView) findViewById(R.id.name);
        password = (TextView) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String answer_name = name.getText().toString();
                String answer_password = password.getText().toString();
                Intent androidsolved_intent1 = new Intent(getApplicationContext(), PersonalHomePage.class);
                startActivity(androidsolved_intent1);
            }
        });

    }
}
