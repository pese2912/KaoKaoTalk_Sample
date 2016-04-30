package com.example.sangsu.kaokaotalk_sample;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Duedapi on 2016-04-30.
 */
public class SendView extends FrameLayout {


    public SendView(Context context){
        super(context);
        init();
    }
    TextView messageView;

    public void init()
    {
        inflate(getContext(), R.layout.view_send,this);

        messageView =(TextView)findViewById(R.id.chatting_message);
    }

    public void setData(Send send){
        messageView.setText(send.message);

    }

}
