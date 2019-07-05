package com.example.mirai.statechangeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class State2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state2);

        Button btn2_3 = (Button)findViewById(R.id.button2to3);
        btn2_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent objIntent = new Intent(getApplicationContext(), State3Activity.class);
                startActivity(objIntent);
            }
        });

        Button btn2_1 = (Button)findViewById(R.id.button2to1);
        btn2_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent objIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(objIntent);
            }
        });
    }
}
