package com.lemon.service.impl;

import ch.qos.logback.classic.Logger;
import com.lemon.dao.SecondKillDao;
import com.lemon.entity.SecondKill;
import com.lemon.service.SecondKillService;
import lombok.extern.java.Log;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Log
public class SecondKillServiceImpl implements SecondKillService {
    Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SecondKillDao secondKillDao;

    @Transactional
    public void insert(SecondKill secondKill) {
        SecondKill seckill = new SecondKill();
        seckill.setId(UUID.randomUUID().toString());
        seckill.setName("iphone x");
        seckill.setNumber(99);
        seckill.setEndTime(new Date());
        seckill.setStartTime(new Date());
        seckill.setCreateTime(new Date());
        secondKillDao.insert(seckill);
    }

    public List<SecondKill> queryAll() {
        SecondKill secondKill = new SecondKill();
        secondKill.setCreateTime(new Date());
        secondKill.setEndTime(new Date());
        secondKill.setId("11");
        secondKill.setStartTime(new Date());
        List<SecondKill> list = new ArrayList<SecondKill>();
        list.add(secondKill);
        return list;
    }
}
