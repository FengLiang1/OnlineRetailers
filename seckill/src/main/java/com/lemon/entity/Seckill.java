package com.lemon.entity;

import lombok.Data;

@Data
public class Seckill {
    private String id;
    private String name;
    private String startTime;
    private String number; // 库存
    private String endTime;
    private String createTime;
}
