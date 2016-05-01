package com.example.sangsu.kaokaotalk_sample;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChattingFragment extends Fragment {

    Toolbar toolbar;
    TextView titleView;
    RecyclerView recyclerView;
    ChattingAdapter mAdapter;

    EditText inputView;
    RadioGroup typeView;



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

        inputView = (EditText)view.findViewById(R.id.edit_input);
        typeView = (RadioGroup)view.findViewById(R.id.group_type);


        recyclerView = (RecyclerView)view.findViewById(R.id.list);

        mAdapter = new ChattingAdapter();
        recyclerView.setAdapter(mAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        // GridLayoutManager layoutManager = new GridLayoutManager(this, 3, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        Button btn = (Button)view.findViewById(R.id.btn_send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = inputView.getText().toString();
                if (!TextUtils.isEmpty(message)) {

                    switch (typeView.getCheckedRadioButtonId()) {

                        case R.id.radio_s:
                            Send send = new Send();
                            send.message = message;

                            mAdapter.add(send);
                            break;

                        case R.id.radio_r:

                            Receive receive = new Receive();
                            receive.message = message;
                            receive.icon = ContextCompat.getDrawable(getContext(), R.mipmap.ic_launcher);

                            mAdapter.add(receive);

                            break;
                        case R.id.radio_d:
                            Date date = new Date();
                            date.message = message;
                            mAdapter.add(date);

                            break;

                    }
                    inputView.setText("");
                }
            }
        });



        return view;
    }



}
