package com.githing.homework.news.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.githing.homework.news.R;
import com.githing.homework.news.data.NewsBean;

import java.util.List;

/**
 * @author pofeng <pofeng@wacai.com>
 * @date 2018/03/07
 */
public class NewsAdapter extends RecyclerView.Adapter {

    private List<NewsBean> datas;
    private Context context;

    public NewsAdapter(Context context, List<NewsBean> datas) {
        this.datas = datas;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        NewsBean newsBean = datas.get(position);
        ((ViewHolder) holder).tvTitle.setText(newsBean.getTitle());
        ((ViewHolder) holder).tvDate.setText(newsBean.getDate());
        Glide.with(context).load(newsBean.getImgUrl()).listener(new RequestListener<String, GlideDrawable>() {
            @Override
            public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                Log.e("newAdapter", e.getMessage(), e);
                return false;
            }

            @Override
            public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                return false;
            }
        }).into(((ViewHolder) holder).ivPic);
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
