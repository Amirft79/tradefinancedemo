package com.example.demo.controller;


import com.example.demo.model.bop.BopInfo;
import com.example.demo.service.BopInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tradeFinance")
public class Controller {

    @Autowired
    private BopInfoService bopInfoService;


    @GetMapping("/bopinfo")
    public ResponseEntity<List<BopInfo>> findAllBop(){
        return new ResponseEntity<>(bopInfoService.findAllBopInfo(),new HttpHeaders(), HttpStatus.OK);
    }

}
