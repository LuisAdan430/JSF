package com.pps.jsf1;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
//@ViewScoped
@SessionScoped
//@RequestScoped
public class bean implements Serializable {
    private String texto;

    public bean() {

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


}
