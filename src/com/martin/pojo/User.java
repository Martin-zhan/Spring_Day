package com.martin.pojo;

import java.lang.reflect.Array;
import java.util.*;

public class User{
    private String username;
    private int[] array;
    private List list;
    private Set set;
    private Map map;
    private Properties properties;

    public void setUsername(String username) {
        this.username = username;
    }

    public void sayHello() {
        System.out.println(this.username + "hello,Spring");
    }

    public void setArray(int[] array) {
        this.array = array;
    }

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

    public User() {
        System.out.println("加载");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
