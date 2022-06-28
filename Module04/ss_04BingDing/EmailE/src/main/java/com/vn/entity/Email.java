package com.vn.entity;

public class Email {

    private String language;
    private int size;
    private boolean filter;
    private String content;

    public Email(String language, int size, boolean filter, String content) {
        this.language = language;
        this.size = size;
        this.filter = filter;
        this.content = content;
    }

    public Email() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
