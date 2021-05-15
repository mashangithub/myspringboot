package com.ljm.cn.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author lijms
 * @date 2021/5/5/005 0:50
 */
@ToString
@Data
public class Pet {
    public Pet(String name) {
        this.name = name;
    }

    private String name;
    private Double weight;
}
