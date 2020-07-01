package com.lzz.model;

import java.util.Date;

public class Gonggao implements Comparable{
    private String id;
    private Date riqi;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRiqi() {
        return riqi;
    }

    public void setRiqi(Date riqi) {
        this.riqi = riqi;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Gonggao(String id, Date riqi, String content) {
        this.id = id;
        this.riqi = riqi;
        this.content = content;
    }

    public Gonggao() {
    }

    @Override
    public String toString() {
        return "Gonggao{" +
                "id='" + id + '\'' +
                ", riqi=" + riqi +
                ", content='" + content + '\'' +
                '}';
    }

    public int compareTo(Object o) {
        return 0;
    }
}
