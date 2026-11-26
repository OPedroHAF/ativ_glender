/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ_glender.classes.Veiculo;

/**
 *
 * @author 1518869
 */
public abstract class Veiculo {
    private String placa;
    private String modelo;
    private String ano_de_fabricacao;
    private double valor_diaria;
    private double km;
    private StatusVeiculo staus;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno_de_fabricacao() {
        return ano_de_fabricacao;
    }

    public void setAno_de_fabricacao(String ano_de_fabricacao) {
        this.ano_de_fabricacao = ano_de_fabricacao;
    }

    public double getValor_diaria() {
        return valor_diaria;
    }

    public void setValor_diaria(double valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public StatusVeiculo getStaus() {
        return staus;
    }

    public void setStaus(StatusVeiculo staus) {
        this.staus = staus;
    }
    
    
}
