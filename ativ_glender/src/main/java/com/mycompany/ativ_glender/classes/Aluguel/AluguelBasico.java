/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ_glender.classes.Aluguel;

/**
 *
 * @author 1518869
 */
public class AluguelBasico extends Aluguel {
    private int km_max_diario = 100;
    
    public AluguelBasico(){
        super();
    }

    public int getKm_max_diario() {
        return km_max_diario;
    }

    public void setKm_max_diario(int km_max_diario) {
        this.km_max_diario = km_max_diario;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.print("Cliente: " + getNomeCliente() + "\nDias: " + getQuantidadeDias() + "\nValor: " + getValorTotal() + "\nStatus: " + getStatus() + "\nVeiculo: " + getVeiculo_associado().getPlaca() );
    }
    
    @Override
    public boolean possuiSeguroIncluso(){
        return false;
    }
}
