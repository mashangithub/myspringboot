package com.ljm.cn.model;

/**
 * @author lijms
 * @date 2021/3/7/007 11:32
 */
public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
