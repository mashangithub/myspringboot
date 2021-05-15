package com.ljm.cn.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author lijms
 * @date 2021/5/5/005 0:49
 */
//@ConfigurationProperties(prefix = "person")
//@Component
@ToString
@Data
public class Person {

    public Person(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;
}
