package com.gyasistory.popularmoviesstage2.data;

import java.io.Serializable;

/**
 * Created by gyasistory on 8/5/15.
 */
public class Review implements Serializable {

    private String id;
    private String author;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

    @Override
    public String toString() {
        return "Author: " + getAuthor() +
                "\n" + getContent();
    }
}
