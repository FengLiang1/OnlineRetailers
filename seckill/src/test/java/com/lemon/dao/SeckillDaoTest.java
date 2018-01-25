package com.lemon.dao;


import com.lemon.entity.SecondKill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring_dao.xml"})
public class SeckillDaoTest {

    @Autowired
    private SecondKillDao secondKillDao;

    @Test
    public void testInsert() {
        SecondKill seckill = new SecondKill();
        seckill.setId(UUID.randomUUID().toString());
        seckill.setName("iphone x");
        seckill.setNumber(99);
        seckill.setEndTime(new Date());
        seckill.setStartTime(new Date());
        seckill.setCreateTime(new Date());
        secondKillDao.insert(seckill);
    }
}
