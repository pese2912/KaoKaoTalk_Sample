package com.example.sangsu.kaokaotalk_sample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Duedapi on 2016-04-23.
 */
public class FriendView extends FrameLayout {

    TextView nameView;
    ImageView photoView;
    Friend friend;
    public FriendView(Context context) {
        this(context, null);
    }


    public FriendView(Context context, AttributeSet attrs) {
        super(context, attrs);
        
        inflate(context, R.layout.view_friend, this);

        nameView =(TextView)findViewById(R.id.friend_name);
        photoView = (ImageView)findViewById(R.id.friend_image);

    }
    public void setFriend(Friend f){
        friend =f;
        nameView.setText(f.getName());
        photoView.setImageDrawable(f.getPhoto());
    }
}
