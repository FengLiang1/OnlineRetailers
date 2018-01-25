package com.lemon.service.impl; 

import com.lemon.service.SecondKillService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring_service.xml"})
@Slf4j
public class SecondKillServiceImplTest {
    @Autowired
    private SecondKillService secondKillService;
    @Test
    public void testInsert() throws Exception {
        log.info("aaawefawegfwaegwaegherher");
    } 

} 
