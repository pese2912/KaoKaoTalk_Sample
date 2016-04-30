package com.example.sangsu.kaokaotalk_sample;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Duedapi on 2016-04-30.
 */
public class ChattingViewHolder extends RecyclerView.ViewHolder  {

    private static final int TYPE_SEND = 0;
    private static final int TYPE_RECEIVE = 1;
    private static final int TYPE_DATE = 2;


    //These are the general elements in the RecyclerView
    public TextView date_message;

    public ImageView receive_icon;
    public TextView receive_message;

    public TextView send_message;

    public ChattingViewHolder(View itemView, int viewType) {
        super(itemView);
       switch (viewType){
           case TYPE_SEND:
               send_message = (TextView)itemView.findViewById(R.id.chatting_message);
           case TYPE_RECEIVE:
               receive_message = (TextView)itemView.findViewById(R.id.chatting_message);
               receive_icon = (ImageView)itemView.findViewById(R.id.image_icon);

           case TYPE_DATE:
               date_message = (TextView)itemView.findViewById(R.id.chatting_message);
       }
    }

    public void setDate(Date d) {
        date_message.setText(d.message);
    }
    public void setReceive(Receive r) {
        receive_message.setText(r.message);
        receive_icon.setImageDrawable(r.icon);
    }

    public void setSend(Send s) {
        send_message.setText(s.message);
    }



}
