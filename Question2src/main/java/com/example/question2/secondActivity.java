package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnNext;
    Button btnPrev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnNext=findViewById(R.id.nextscreen);
        btnPrev=findViewById(R.id.prevscreen);

        btnNext.setOnClickListener(this);
        btnPrev.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.nextscreen)
        {
            Intent myIntent = new Intent(secondActivity.this, thirdActivity.class);
            startActivity(myIntent);
        }
        else if(v.getId()==R.id.prevscreen)
        {
            finish();
        }
    }
}
