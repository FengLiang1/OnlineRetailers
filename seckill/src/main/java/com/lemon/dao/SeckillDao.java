package com.lemon.entity.dao;

import com.lemon.entity.Seckill;

import java.util.Date;

public interface SeckillDao {
    void insert(Seckill seckill);

    /**
     * 秒杀成功的话秒杀次数减1
     */
    void reduceNumber(long id, Date killTime);

    Seckill queryById(String id);

    void delete(String id);
}
