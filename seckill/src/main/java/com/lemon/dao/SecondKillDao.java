package com.lemon.dao;

import com.lemon.entity.SecondKill;

import java.util.Date;

public interface SecondKillDao {
    void insert(SecondKill secondKill);

    /**
     * 秒杀成功的话秒杀次数减1
     */
    void reduceNumber(long id, Date killTime);

    SecondKill queryById(String id);

    void delete(String id);
}
