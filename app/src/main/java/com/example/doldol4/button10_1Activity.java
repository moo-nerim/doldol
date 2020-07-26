package com.example.doldol4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class button10_1Activity extends AppCompatActivity {

    ImageButton a,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button10_1);

        a=(ImageButton)findViewById(R.id.button23);
        a.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v1){
                startActivity(new Intent(button10_1Activity.this,button10Activity.class));
            }
        });


        c=(ImageButton)findViewById(R.id.button25);
        c.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v3){
                startActivity(new Intent(button10_1Activity.this,button10_1_1Activity.class));
            }
        });
    }
}
