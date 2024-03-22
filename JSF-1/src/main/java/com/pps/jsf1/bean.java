package com.pps.jsf1;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.view.ViewScoped;

import java.io.Serializable;

@ManagedBean
@ViewScoped
public class bean implements Serializable {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
