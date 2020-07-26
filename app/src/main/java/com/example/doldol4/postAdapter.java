package com.example.doldol4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class postAdapter extends RecyclerView.Adapter<postAdapter.postviewholder> {

    private List<post> datas;

    public postAdapter(List<post> data) {
        this.datas = data;

    }


    @NonNull
    @Override
    public postviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post, parent, false);

        postviewholder viewholder = new postviewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(postviewholder holder, int position) {
        post data = datas.get(position);
        holder.title.setText(data.getTitle());
        holder.contents.setText(data.getContents());
        //holder.bind(data);

    }

    @Override
    public int getItemCount() {

        return (null != datas ? datas.size() : 0);
    }

    class postviewholder extends RecyclerView.ViewHolder {
        private  TextView title;
        private  TextView contents;


        public postviewholder(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.item_post_title);
            contents = (TextView) itemView.findViewById(R.id.item_post_contents);
        }

    }
}
