package com.zps.mybatis.model;

public class Movie {
    private Integer id;

    private String name;

    private String date;

    private String local;

    private String tname;

    private String ename;

    private String year;

    private String country;

    private String kind;

    private String language;

    private String word;

    private String showtime;

    private String dbsecore;

    private String longtime;

    private String actor;

    private String star;

    private String introduction;

    private String pigimg;

    private String smallimg;

    private String downloadsrc;

    public Movie(Integer id, String name, String date, String local, String tname, String ename, String year, String country, String kind, String language, String word, String showtime, String dbsecore, String longtime, String actor, String star, String introduction, String pigimg, String smallimg, String downloadsrc) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.local = local;
        this.tname = tname;
        this.ename = ename;
        this.year = year;
        this.country = country;
        this.kind = kind;
        this.language = language;
        this.word = word;
        this.showtime = showtime;
        this.dbsecore = dbsecore;
        this.longtime = longtime;
        this.actor = actor;
        this.star = star;
        this.introduction = introduction;
        this.pigimg = pigimg;
        this.smallimg = smallimg;
        this.downloadsrc = downloadsrc;
    }

    public Movie() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local == null ? null : local.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime == null ? null : showtime.trim();
    }

    public String getDbsecore() {
        return dbsecore;
    }

    public void setDbsecore(String dbsecore) {
        this.dbsecore = dbsecore == null ? null : dbsecore.trim();
    }

    public String getLongtime() {
        return longtime;
    }

    public void setLongtime(String longtime) {
        this.longtime = longtime == null ? null : longtime.trim();
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star == null ? null : star.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getPigimg() {
        return pigimg;
    }

    public void setPigimg(String pigimg) {
        this.pigimg = pigimg == null ? null : pigimg.trim();
    }

    public String getSmallimg() {
        return smallimg;
    }

    public void setSmallimg(String smallimg) {
        this.smallimg = smallimg == null ? null : smallimg.trim();
    }

    public String getDownloadsrc() {
        return downloadsrc;
    }

    public void setDownloadsrc(String downloadsrc) {
        this.downloadsrc = downloadsrc == null ? null : downloadsrc.trim();
    }
}