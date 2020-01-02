package com.qf.entity;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
}
