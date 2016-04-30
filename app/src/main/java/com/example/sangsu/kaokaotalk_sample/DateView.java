package com.example.sangsu.kaokaotalk_sample;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Duedapi on 2016-04-30.
 */
public class DateView extends FrameLayout{

    public DateView(Context context) {
        super(context);
        init();
    }
    TextView messageView;
    private void init(){
        inflate(getContext(),R.layout.view_date, this);
        messageView  =(TextView)findViewById(R.id.chatting_message);
    }

    public void setData(Date date){
        messageView.setText(date.message);

    }

}
