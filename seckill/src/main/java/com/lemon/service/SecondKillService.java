package com.lemon.service;

import com.lemon.entity.SecondKill;

import java.util.List;

public interface SecondKillService {
    void insert(SecondKill secondKill);

    List<SecondKill> queryAll();
}
