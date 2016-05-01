package com.example.sangsu.kaokaotalk_sample;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duedapi on 2016-04-30.
 */
public class ChattingAdapter  extends RecyclerView.Adapter<ChattingViewHolder>  {

    List<ChattingMessage> items = new ArrayList<ChattingMessage>();

    private static final int VIEW_TYPE_COUNT =3;
    private static final int TYPE_SEND = 0;
    private static final int TYPE_RECEIVE = 1;
    private static final int TYPE_DATE = 2;


    public  void add(ChattingMessage item){

        items.add(item);
        Log.i("item", item.toString());
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        ChattingMessage message = items.get(position);
        if(message instanceof Send){
            return TYPE_SEND;
        } else if(message instanceof Receive){
            Log.i("message" , message.toString());
            return TYPE_RECEIVE;
        }
        return TYPE_DATE;
    }


    @Override
    public ChattingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        switch (viewType) {
            case TYPE_SEND: //This would be the header view in my Recycler
                 view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_send, parent, false);
                return new ChattingViewHolder(view,viewType);

            case TYPE_RECEIVE: //This would be the header view in my Recycler

                 view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_receive, parent, false);
                return new ChattingViewHolder(view,viewType);

            case TYPE_DATE: //This would be the header view in my Recycler
                 view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_date, parent, false);
                return new ChattingViewHolder(view,viewType);

        }


        return null;
    }

    @Override
    public void onBindViewHolder(ChattingViewHolder holder, int position) {

        switch (getItemViewType(position)) {
            case TYPE_SEND: //This would be the header view in my Recycler
                holder.setSend((Send)items.get(position));
                return;

          case TYPE_RECEIVE: //This would be the header view in my Recycler

                holder.setReceive((Receive)items.get(position));
               return;
           case TYPE_DATE: //This would be the header view in my Recycler

            holder.setDate((Date)items.get(position));
                return;
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
