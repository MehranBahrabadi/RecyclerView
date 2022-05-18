package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<MyFriend> myFriends;
    public MyAdapter(List<MyFriend> myFriends) {
        this.myFriends = (myFriends == null) ? new ArrayList<>() : myFriends;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.myfriend_list_item , parent , false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(myFriends.get(position));
    }

    @Override
    public int getItemCount() {
        return myFriends.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        AppCompatTextView tvName , tvCity;
        private MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvCity = itemView.findViewById(R.id.tv_city);
        }

        public void bind(MyFriend myFriend){
            tvName.setText(myFriend.getName());
            tvCity.setText(myFriend.getCity());
        }
    }
}
