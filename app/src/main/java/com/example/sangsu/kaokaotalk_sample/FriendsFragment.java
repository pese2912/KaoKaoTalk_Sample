package com.example.sangsu.kaokaotalk_sample;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sangsu.kaokaotalk_sample.GlobalVariables;

/**
 * A simple {@link Fragment} subclass.
 */
public class FriendsFragment extends Fragment {

    ListView listView;
    FriendAdapter mAdapter;
    TextView titleView;

    public FriendsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
         // Inflate the layout for this fragment
         View view;
         view=  inflater.inflate(R.layout.fragment_friends, container, false);

        titleView = (TextView)getActivity().findViewById(R.id.toolbar_title);
        titleView.setText(GlobalVariables.FRIENDS_FRAGMENT);

        listView = (ListView)view.findViewById(R.id.friend_listView);
        mAdapter = new FriendAdapter();

        listView.setAdapter(mAdapter);

        initData(); //초기화

        return view;
    }
    public void initData(){

        for(int i =0; i<40; i++){
            Friend p = new Friend();
            p.setName("친구 " + i);
            p.setPhoto(ContextCompat.getDrawable(getContext(), R.mipmap.ic_launcher));
            mAdapter.add(p);
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main, menu);
    }

}
