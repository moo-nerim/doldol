package com.example.doldol4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.util.HashMap;
import java.util.Map;

public class postActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mauth = FirebaseAuth.getInstance();
    private FirebaseFirestore mstore = FirebaseFirestore.getInstance();

    private EditText mtitle, mcontents;
    private String id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        mtitle = findViewById(R.id.post_title_edit);
        mcontents = findViewById(R.id.post_contents_edit);


        findViewById(R.id.post_save_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        id = mstore.collection("dol").document().getId();

        Map<String, Object> data = new HashMap<>();
        data.put("id", id);
        data.put("title", mtitle.getText().toString());
        data.put("contents", mcontents.getText().toString());

        mstore.collection("dol").document(id).set(data);
        startActivity(new Intent(this, main1Activity.class));

    }
}



