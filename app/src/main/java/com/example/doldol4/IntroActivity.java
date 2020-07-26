package com.example.doldol4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntroActivity extends AppCompatActivity {
    Button a, b, c, d, e, f, g, h, i, j, k, l, m, n;
    EditText txt_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Intent intent = getIntent();
        String number = intent.getStringExtra("number");
        txt_next = (EditText) findViewById(R.id.idnext);
        txt_next.setText(number);


        a = (Button) findViewById(R.id.button1);
        a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v1) {
                startActivity(new Intent(IntroActivity.this, button1_1Activity.class));
            }
        });

        b = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                startActivity(new Intent(IntroActivity.this, button2_1Activity.class));
            }
        });

        c = (Button) findViewById(R.id.button3);
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v3) {
                startActivity(new Intent(IntroActivity.this, button3_1Activity.class));
            }
        });

        d = (Button) findViewById(R.id.button4);
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v4) {
                startActivity(new Intent(IntroActivity.this, button4_1Activity.class));
            }
        });

        e = (Button) findViewById(R.id.button5);
        e.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v5) {
                startActivity(new Intent(IntroActivity.this, button5_1Activity.class));
            }
        });

        f = (Button) findViewById(R.id.button6);
        f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v6) {
                startActivity(new Intent(IntroActivity.this, button6_1Activity.class));
            }
        });

        g = (Button) findViewById(R.id.button7);
        g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v7) {
                startActivity(new Intent(IntroActivity.this, button7_1Activity.class));
            }
        });

        h = (Button) findViewById(R.id.button8);
        h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v8) {
                startActivity(new Intent(IntroActivity.this, button8_1Activity.class));
            }
        });

        i = (Button) findViewById(R.id.button9);
        i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v9) {
                startActivity(new Intent(IntroActivity.this, button9_1Activity.class));
            }
        });

        j = (Button) findViewById(R.id.button10);
        j.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v10) {
                startActivity(new Intent(IntroActivity.this, button10_1Activity.class));
            }
        });

        k = (Button) findViewById(R.id.button11);
        k.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v11) {
                startActivity(new Intent(IntroActivity.this, button11_1Activity.class));
            }
        });

        l = (Button) findViewById(R.id.button12);
        l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v12) {
                startActivity(new Intent(IntroActivity.this, button12_1Activity.class));
            }
        });

        m = (Button) findViewById(R.id.button13);
        m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v13) {
                startActivity(new Intent(IntroActivity.this, button13_1Activity.class));
            }
        });

        n = (Button) findViewById(R.id.button14);
        n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v14){
                startActivity(new Intent(IntroActivity.this, main1Activity.class));
            }
        });
    }
}
