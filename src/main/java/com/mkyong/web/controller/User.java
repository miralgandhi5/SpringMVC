package com.mkyong.web.controller;

/**
 * Created by miral on 7/6/2017.
 */
public class User {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }
}
