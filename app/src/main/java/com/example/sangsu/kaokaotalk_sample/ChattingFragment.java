package com.example.sangsu.kaokaotalk_sample;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
    RecyclerView recyclerView;
    ChattingAdapter mAdapter;

    public ChattingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view;
        view=  inflater.inflate(R.layout.fragment_chatting, container, false);

        titleView = (TextView)getActivity().findViewById(R.id.toolbar_title);
        titleView.setText(GlobalVariables.CHATTING_FRAGMENT);


        recyclerView = (RecyclerView)view.findViewById(R.id.list);
        Log.i("re", recyclerView.toString());
        mAdapter = new ChattingAdapter();
        recyclerView.setAdapter(mAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        // GridLayoutManager layoutManager = new GridLayoutManager(this, 3, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        initData();

        return view;
    }

    private void initData() {
        for (int i = 0; i < 40 ; i++) {
            Send s = new Send();
            s.message ="1";
           mAdapter.add(s);
        }

    }

}
