package com.lemon.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SuccessSecondKilled {
    private String id;
    private String secondKillId;
    private String userPhoneNum;
    private int state;
    private Date createTime;
}
