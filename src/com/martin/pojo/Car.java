package com.martin.pojo;

public class Car {
    private String name;
    private String num;

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
