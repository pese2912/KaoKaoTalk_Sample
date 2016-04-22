package com.example.sangsu.kaokaotalk_sample;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChattRoomFragment extends Fragment {


    public ChattRoomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chatt_room, container, false);
    }


}
