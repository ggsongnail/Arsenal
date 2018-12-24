package com.arms.ak47.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Table(name = "user")
public class User implements Serializable {
    @Id
    private Integer id;
    private String name;
    private Date createTime;
    private Integer status;
}
