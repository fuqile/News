package com.githing.homework.news.data;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * 新闻对象实体
 *
 * @author pofeng <pofeng@wacai.com>
 * @date 2018/03/07
 */
public class NewsBean implements Serializable {

    @JSONField(name = "title")
    private String title;

    @JSONField(name = "thumbnail_pic_s")
    private String imgUrl;

    @JSONField(name = "date")
    private String date;

    @JSONField(name = "url")
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
