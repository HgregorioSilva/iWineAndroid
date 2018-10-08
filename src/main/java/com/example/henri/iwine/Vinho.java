package com.example.henri.iwine;

public class Vinho {

    private String tipo;
    private String marca;
    private String ano;

    public Vinho(String tipo, String marca, String ano){
        this.tipo = tipo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getAno() {
        return this.ano;
    }
}
