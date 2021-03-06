package com.arms.bullet.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class User implements Serializable {
    private Integer id;
    private String name;
    private Date createTime;
    private Integer status;
}
