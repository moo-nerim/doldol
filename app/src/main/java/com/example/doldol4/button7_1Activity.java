package com.example.doldol4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class button7_1Activity extends AppCompatActivity {

    ImageButton a,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button7_1);


        a=(ImageButton)findViewById(R.id.button23);
        a.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v1){
                startActivity(new Intent(button7_1Activity.this,button7Activity.class));
            }
        });


        c=(ImageButton)findViewById(R.id.button25);
        c.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v3){
                startActivity(new Intent(button7_1Activity.this,button7_1_1Activity.class));
            }
        });



    }
}
