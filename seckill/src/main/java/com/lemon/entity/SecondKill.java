package com.lemon.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SecondKill {
    private String id;
    private String name;
    private Date startTime;
    private Integer number; // 库存
    private Date endTime;
    private Date createTime;
}
