package com.githing.homework.news.view.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.githing.homework.news.R;
import com.githing.homework.news.data.NewsBean;
import com.githing.homework.news.view.activity.WebActivity;

import java.util.List;

/**
 * @author pofeng <pofeng@wacai.com>
 * @date 2018/03/07
 */
public class NewsAdapter extends RecyclerView.Adapter {

    private List<NewsBean> datas;
    private Activity activity;

    public NewsAdapter(Activity activity, List<NewsBean> datas) {
        this.datas = datas;
        this.activity = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final NewsBean newsBean = datas.get(position);
        ((ViewHolder) holder).tvTitle.setText(newsBean.getTitle());
        ((ViewHolder) holder).tvDate.setText(newsBean.getDate());
        Glide.with(activity).load(newsBean.getImgUrl()).into(((ViewHolder) holder).ivPic);
        ((ViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, WebActivity.class);
                intent.putExtra(WebActivity.KEY_URL, newsBean.getUrl());
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPic;
        TextView tvTitle;
        TextView tvDate;

        ViewHolder(View view) {
            super(view);
            ivPic = view.findViewById(R.id.iv_pic);
            tvTitle = view.findViewById(R.id.tv_title);
            tvDate = view.findViewById(R.id.tv_date);
        }
    }
}
