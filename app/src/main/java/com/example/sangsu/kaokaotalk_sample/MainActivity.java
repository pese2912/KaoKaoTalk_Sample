package com.example.sangsu.kaokaotalk_sample;

import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.sangsu.kaokaotalk_sample.GlobalVariables;
public class MainActivity extends AppCompatActivity {

    FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (FragmentTabHost)findViewById(R.id.tabHost);

        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator(GlobalVariables.FRIENDS_FRAGMENT), FriendsFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator(GlobalVariables.CHATT_ROOM_FRAGMENT), ChattRoomFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator(GlobalVariables.CHATTING_FRAGMENT), ChattingFragment.class,null);

    }
}
