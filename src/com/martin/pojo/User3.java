package com.martin.pojo;

import java.util.*;

public class User3 {
    private String username;
    private Car car;

    public User3(String username, Car car) {
        this.username = username;
        this.car = car;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void sayHello() {
        System.out.println(this.username + "hello,Spring");
    }

    /*public User3() {
        System.out.println("加载");
    }
*/
    @Override
    public String toString() {
        return "User3{" +
                "username='" + username + '\'' +
                ", car=" + car +
                '}';
    }


}
