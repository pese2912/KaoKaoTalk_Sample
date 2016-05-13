package com.example.sangsu.kaokaotalk_sample;

import android.graphics.Color;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sangsu.kaokaotalk_sample.GlobalVariables;
public class MainActivity extends AppCompatActivity {

    FragmentTabHost tabHost;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (FragmentTabHost)findViewById(R.id.tabHost);

       // setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar = (Toolbar) findViewById(R.id.toolbar); //툴바설정
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
         toolbar.setTitle("");
         setSupportActionBar(toolbar);//액션바와 같게 만들어줌
      //  getSupportActionBar().setCustomView(view, new ActionBar.LayoutParams(Gravity.CENTER));


        tabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator(GlobalVariables.FRIENDS_FRAGMENT), FriendsFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator(GlobalVariables.CHATT_ROOM_FRAGMENT), ChattRoomFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator(GlobalVariables.CHATTING_FRAGMENT), ChattingFragment.class,null);


    }

}
