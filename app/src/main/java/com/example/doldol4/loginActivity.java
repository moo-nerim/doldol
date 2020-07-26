package com.example.doldol4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {
    Button p;
    EditText txt_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        txt_main = (EditText)findViewById(R.id.idText);
        p=(Button)findViewById(R.id.loginbutton);


        p.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v1){
                Intent intent = new Intent(loginActivity.this, IntroActivity.class);
                intent.putExtra("number",txt_main.getText().toString());
                startActivity(intent);
                finish();


            }
        });
    }
}
