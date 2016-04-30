package com.example.sangsu.kaokaotalk_sample;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duedapi on 2016-04-23.
 */
public class FriendAdapter extends BaseAdapter{
    List<Friend> items = new ArrayList<Friend>();

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

        FriendView view;
        if (convertView == null) {//뷰없으면 생성
            view = new FriendView(parent.getContext());
        } else { //뷰 재사용
            view = (FriendView) convertView;
        }
        view.setFriend(items.get(position));
        return view;
    }
    public void add(Friend f){
        items.add(f);
        notifyDataSetChanged();//등록된 리스트에게 변경됬다고 알림
    }
    public void remove(Friend f){
        items.remove(f);
        notifyDataSetChanged();
    }
    public void addAll(List<Friend> f){
        this.addAll(f);
        notifyDataSetChanged();
    }

}
