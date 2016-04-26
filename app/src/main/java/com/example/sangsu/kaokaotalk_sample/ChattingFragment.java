package com.example.sangsu.kaokaotalk_sample;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChattingFragment extends Fragment {
    Toolbar toolbar;
    TextView titleView;
    public ChattingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view;
        view=  inflater.inflate(R.layout.fragment_chatt_room, container, false);

        titleView = (TextView)getActivity().findViewById(R.id.toolbar_title);
        titleView.setText(GlobalVariables.CHATTING_FRAGMENT);



        return view;
    }





}
