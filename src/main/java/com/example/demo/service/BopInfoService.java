package com.example.demo.service;


import com.example.demo.model.bop.BopInfo;
import com.example.demo.repository.BopInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BopInfoService {

    @Autowired
    private BopInfoRepository repository;



    public List<BopInfo> findAllBopInfo(){
        return repository.findAll();
    }
}
