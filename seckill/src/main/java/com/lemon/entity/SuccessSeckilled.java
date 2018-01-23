package com.lemon.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SuccessSeckilled {
    private String id;
    private String seckillId;
    private String userPhoneNum;
    private int state;
    private Date createTime;
}
