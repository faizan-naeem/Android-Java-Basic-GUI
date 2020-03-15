package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class thirdActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    Button btn2;
    Button btn3;
    EditText et1,et2,et3,et4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        et1=findViewById(R.id.firstnameedit);
        et2=findViewById(R.id.lastnameedit);
        et3=findViewById(R.id.ageedit);
        et4=findViewById(R.id.qualificationedit);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       if(v.getId()==btn1.getId())
        {
            Context context = getApplicationContext();
            CharSequence text = "Hello " + et1.getText() +" "+ et2.getText() + "\nYour Age is " + et3.getText() + "\nYour Qualification is " + et4.getText();
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else if(v.getId()==btn2.getId())
        {
            finish();
        }
        else if(v.getId()==btn3.getId())
        {
            Intent i = new Intent(thirdActivity.this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        }
    }
}
