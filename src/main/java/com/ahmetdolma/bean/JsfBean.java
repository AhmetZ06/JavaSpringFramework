package com.ahmetdolma.bean;

import javax.*;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.*;
import lombok.extern.log4j.Log4j2;

@Named(value = "cdiBean")
@RequestScoped
@Getter @Setter


public class JsfBean {
    private String patika;

    public JsfBean(){
        this.patika = "Patika.dev egitimine hosgeldiniz";
    }
}
