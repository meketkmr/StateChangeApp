package com.example.mirai.statechangeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1_2 = (Button)findViewById(R.id.button1to2);
        btn1_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent objIntent = new Intent(getApplicationContext(), State2Activity.class);
                startActivity(objIntent);
            }
        });

        Button btn1_3 = (Button)findViewById(R.id.button1to3);
        btn1_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent objIntent = new Intent(getApplicationContext(), State3Activity.class);
                startActivity(objIntent);
            }
        });
    }

}
