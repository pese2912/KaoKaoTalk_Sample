package com.example.sangsu.kaokaotalk_sample;


import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FriendsFragment extends Fragment {

    ListView listView;
    FriendAdapter mAdapter;

    public FriendsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         // Inflate the layout for this fragment
         View view;
         view=  inflater.inflate(R.layout.fragment_friends, container, false);
        listView = (ListView)view.findViewById(R.id.friend_listView);
        mAdapter = new FriendAdapter();

        listView.setAdapter(mAdapter);

        initData();

        return view;

    }
    public void initData(){

        for(int i =0; i<40; i++){
            Friend p = new Friend();
            p.setName("item " + i);
            p.setPhoto(ContextCompat.getDrawable(getContext(), R.mipmap.ic_launcher));
            mAdapter.add(p);
        }
    }

}
