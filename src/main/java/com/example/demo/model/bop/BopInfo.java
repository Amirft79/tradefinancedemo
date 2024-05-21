package com.example.demo.model.bop;

import com.example.demo.model.shared.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "t_bopinfo")
public class BopInfo extends BaseEntity {

    private String code;
    private String cause;


    @Column(name = "c_code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "c_cause")
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }



}
