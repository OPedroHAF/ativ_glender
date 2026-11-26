/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ_glender.classes.Aluguel;
import com.mycompany.ativ_glender.classes.Veiculo.Veiculo;
/**
 *
 * @author 1518869
 */

public abstract class Aluguel {

    private String nomeCliente;
    private int quantidadeDias;
    private double valorTotal;
    private StatusAluguel status;
    private Veiculo veiculo_associado;
    
    public Aluguel(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {

        this.nomeCliente = nomeCliente;
        this.quantidadeDias = quantidadeDias;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public Veiculo getVeiculo_associado() {
        return veiculo_associado;
    }

    public void setVeiculo_associado(Veiculo veiculo_associado) {
        this.veiculo_associado = veiculo_associado;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusAluguel getStatus() {
        return status;
    }

    public void setStatus(StatusAluguel status) {
        this.status = status;
    }

    public abstract void exibirDetalhes();

    public abstract boolean possuiSeguroIncluso();
    
}
