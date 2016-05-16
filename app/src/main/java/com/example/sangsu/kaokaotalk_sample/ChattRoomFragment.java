package com.example.sangsu.kaokaotalk_sample;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.Fragment;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChattRoomFragment extends Fragment {

    TextView titleView;
    ListView room_list;
    ChattRoomAdapter mAdapter;


    public ChattRoomFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);

        View view;
        view=  inflater.inflate(R.layout.fragment_chatt_room, container, false);
        titleView = (TextView)getActivity().findViewById(R.id.toolbar_title);
        titleView.setText(GlobalVariables.CHATT_ROOM_FRAGMENT);


        room_list = (ListView)view.findViewById(R.id.room_listView);
        mAdapter = new ChattRoomAdapter();
        room_list.setAdapter(mAdapter);
        initData();

        return view;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_chatting, menu);
    }

    public void initData(){

        for(int i =0; i<40; i++){
            ChattRoom chattRoom = new ChattRoom();
            chattRoom.setName("채팅방 " + i);
            if(i%2==0)
                chattRoom.setContent("hi!");
            else
                chattRoom.setContent("hello!");
            chattRoom.setImage(ContextCompat.getDrawable(getContext(), android.R.drawable.ic_secure));
            mAdapter.add(chattRoom);
        }
    }



}
