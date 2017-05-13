package com.dagger2.zeroscreen.mvp.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.dagger2.zeroscreen.R;

/**
 * Created by hongwei on 2017/5/8.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.PhiViewHolder> {

    List<String> mList = new ArrayList<>();

    LayoutInflater layoutInflater;

    @Inject
    public NewsAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    public void setData(List<String> list) {
        mList = list;
        notifyDataSetChanged();
    }

    @Override
    public PhiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item, null);
        PhiViewHolder holder = new PhiViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(PhiViewHolder holder, int position) {
        holder.textView.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class PhiViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public PhiViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
