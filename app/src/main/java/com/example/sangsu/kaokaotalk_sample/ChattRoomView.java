package com.example.sangsu.kaokaotalk_sample;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Duedapi on 2016-04-30.
 */
public class ChattRoomView extends FrameLayout {

    TextView nameView;
    TextView contentView;
    ImageView photoView;
    ChattRoom chattRoom;


    public ChattRoomView(Context context) {
        this(context, null);
    }

    public ChattRoomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        inflate(context, R.layout.view_chatt_room, this);

        nameView =(TextView)findViewById(R.id.room_name);
        contentView = (TextView)findViewById(R.id.room_content);
        photoView = (ImageView)findViewById(R.id.room_image);

    }

    public void setChattRoom(ChattRoom cr){

        chattRoom = cr;
        nameView.setText(cr.getName());
        contentView.setText(cr.getContent());
        photoView.setImageDrawable(cr.getImage());
    }
}
