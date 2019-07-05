package com.example.mirai.statechangeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class State3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state3);

        Button btn3_2 = (Button)findViewById(R.id.button3to2);
        btn3_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent objIntent = new Intent(getApplicationContext(), State2Activity.class);
                startActivity(objIntent);
            }
        });

        Button btn3_1 = (Button)findViewById(R.id.button3to1);
        btn3_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent objIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(objIntent);
            }
        });

    }


}
