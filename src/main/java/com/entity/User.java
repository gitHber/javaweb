package com.entity;

public class User {
    private int id;
    private String name;
    private String pwd;
    private String sex;
    private String home;
    private String info;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public String getSex() {
        return sex;
    }

    public String getHome() {
        return home;
    }

    public String getInfo() {
        return info;
    }
}
