package com.example.omgzui.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Girl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "cup必填")
    private String cupSize;

    @Min(value = 18, message = "必须成年")
    @NotNull(message = "age必填")
    @Max(value = 120, message = "你是神仙嘛")
    private Integer age;

    @NotNull(message = "money必填")
    private Double money;

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Girl{" +
//                "id=" + id +
//                ", cupSize='" + cupSize + '\'' +
//                ", age=" + age +
//                ", money=" + money +
//                '}';
//    }
}
