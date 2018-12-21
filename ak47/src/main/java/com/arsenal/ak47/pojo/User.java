package com.arsenal.ak47.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Table(name = "user")
public class User {
    private Integer id;
    private String name;
    private Date createTime;
    private Integer status;
}
