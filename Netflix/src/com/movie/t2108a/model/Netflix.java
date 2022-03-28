package com.movie.t2108a.model;

public class Netflix {

    private long id;
    final static String CRC = "VND";
    private String title;
    private String categary;
    private String actor;
    private String language;
    private String publishYear;
    private String getPublishCompany;
    private int time;

    public Netflix(long id, String title, String categary, String actor, String language, String publishYear, String getPublishCompany, int time) {
        this.id = id;
        this.title = title;
        this.categary = categary;
        this.actor = actor;
        this.language = language;
        this.publishYear = publishYear;
        this.getPublishCompany = getPublishCompany;
        this.time = time;
        CRC = "USD";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategary() {
        return categary;
    }

    public void setCategary(String categary) {
        this.categary = categary;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getGetPublishCompany() {
        return getPublishCompany;
    }

    public void setGetPublishCompany(String getPublishCompany) {
        this.getPublishCompany = getPublishCompany;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Netflix{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", categary='" + categary + '\'' +
                ", actor='" + actor + '\'' +
                ", language='" + language + '\'' +
                ", publishYear='" + publishYear + '\'' +
                ", getPublishCompany='" + getPublishCompany + '\'' +
                ", time=" + time +
                '}';
    }
}
