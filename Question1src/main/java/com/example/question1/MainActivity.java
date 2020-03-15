package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout abc1,abc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abc1 = findViewById(R.id.job1);
        abc2 = findViewById(R.id.job2);

        abc1.setOnClickListener(this);
        abc2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(MainActivity.this,
                secondActivity.class);
        startActivity(myIntent);
    }
}
