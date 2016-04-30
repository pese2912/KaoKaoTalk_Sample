package com.example.sangsu.kaokaotalk_sample;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duedapi on 2016-04-30.
 */
public class ChattRoomAdapter extends BaseAdapter {
    List<ChattRoom> items = new ArrayList<ChattRoom>();

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ChattRoomView chattRoomView;
        if(convertView == null){
            chattRoomView = new ChattRoomView(parent.getContext());
        }
        else
        {
            chattRoomView = (ChattRoomView)convertView;
        }


        chattRoomView.setChattRoom(items.get(position));
        return chattRoomView;
    }

    public void add(ChattRoom cr){
        items.add(cr);
        notifyDataSetChanged();
    }
    public void addAll(List<ChattRoom> cr){
        items.addAll(cr);
        notifyDataSetChanged();
    }
    public void remove(ChattRoom cr){
        items.remove(cr);
        notifyDataSetChanged();
    }
}
