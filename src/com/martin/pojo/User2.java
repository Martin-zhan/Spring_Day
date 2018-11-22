package com.martin.pojo;

import org.springframework.beans.factory.annotation.Value;

import java.util.*;

public class User2 {
    private String username;
    private int[] array;
    private List list;
    private Set set;
    private Map map;
    private Properties properties;
    private Car car;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void sayHello() {
        System.out.println(this.username + "hello,Spring");
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Value("#{@list}")
    public void setList(List list) {
        this.list = list;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }



    public User2() {
        System.out.println("加载2");
    }

    @Override
    public String toString() {
        return "User2{" +
                "username='" + username + '\'' +
                ", array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                ", car=" + car +
                '}';
    }
}
