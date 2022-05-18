package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<MyFriend> myFriendList;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        prepareData();
        showData();
    }
    private void prepareData() {
        if(myFriendList == null)
            myFriendList = new ArrayList<>();
        else
            myFriendList.clear();
        myFriendList.add(new MyFriend("Mohammad" , "Ferdows"));
        myFriendList.add(new MyFriend("Hossein" , "Tehran"));
        myFriendList.add(new MyFriend("Arman" , "Mashhad"));
        myFriendList.add(new MyFriend("Hamid" , "Isfahan"));
        myFriendList.add(new MyFriend("Sara" , "Tabriz"));
        myFriendList.add(new MyFriend("Taher" , "Kerman"));
        myFriendList.add(new MyFriend("Ali" , "Zanjan"));
        myFriendList.add(new MyFriend("Mina" , "Tehran"));
        myFriendList.add(new MyFriend("Vahid" , "Hamedan"));
        myFriendList.add(new MyFriend("Nima" , "Shiraz"));
        myFriendList.add(new MyFriend("Mohammad" , "Ferdows"));
        myFriendList.add(new MyFriend("Hossein" , "Tehran"));
        myFriendList.add(new MyFriend("Arman" , "Mashhad"));
        myFriendList.add(new MyFriend("Hamid" , "Isfahan"));
        myFriendList.add(new MyFriend("Sara" , "Tabriz"));
        myFriendList.add(new MyFriend("Taher" , "Kerman"));
        myFriendList.add(new MyFriend("Ali" , "Zanjan"));
        myFriendList.add(new MyFriend("Mina" , "Tehran"));
        myFriendList.add(new MyFriend("Vahid" , "Hamedan"));
        myFriendList.add(new MyFriend("Nima" , "Shiraz"));

    }

    private void showData() {
        adapter = new MyAdapter(myFriendList);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false));
       // recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}