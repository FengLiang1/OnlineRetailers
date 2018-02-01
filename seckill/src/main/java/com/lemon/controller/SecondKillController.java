package com.lemon.controller;

import com.lemon.entity.SecondKill;
import com.lemon.service.SecondKillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//@RestController
@Controller
@RequestMapping("/secondkill")
@Slf4j
public class SecondKillController {

    @Autowired
    private SecondKillService secondKillService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<SecondKill> getList(@PathVariable("id") String id) {
//        log.info(secondKill.toString());
        return secondKillService.queryAll();
    }
}
