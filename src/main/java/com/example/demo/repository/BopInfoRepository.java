package com.example.demo.repository;


import com.example.demo.model.bop.BopInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BopInfoRepository extends JpaRepository<BopInfo,Long> {
}
