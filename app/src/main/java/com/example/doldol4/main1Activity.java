package com.example.doldol4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class main1Activity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView mpostRecyclerview;
    private FirebaseFirestore mstore = FirebaseFirestore.getInstance();

    private postAdapter madapter;
    private List<post> mdatas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        mpostRecyclerview = (RecyclerView) findViewById(R.id.main_recyclerview);
        mpostRecyclerview.setHasFixedSize(true);
        mpostRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        mdatas = new ArrayList<>();

        madapter=new postAdapter(mdatas);
        mpostRecyclerview.setAdapter(madapter);

        findViewById(R.id.post_edit).setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        startActivity(new Intent(main1Activity.this, postActivity.class));

    }

    @Override
    protected void onStart() {
        super.onStart();

        mstore.collection("dol")
                .addSnapshotListener(new EventListener<QuerySnapshot>() {
                    @Override
                    public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                        if(queryDocumentSnapshots !=null){
                            for(DocumentSnapshot snap : queryDocumentSnapshots.getDocuments()){
                                Map<String , Object> shot = snap.getData();
                                String documentId = String.valueOf(shot.get("id"));
                                String title = String.valueOf(shot.get("title"));
                                String contents = String.valueOf(shot.get("contents"));
                                post dati = new post(documentId,title,contents);
                                mdatas.add(dati);
                            }
                            madapter = new postAdapter(mdatas);
                            mpostRecyclerview.setAdapter(madapter);
                        }
                    }
                });
    }




}

