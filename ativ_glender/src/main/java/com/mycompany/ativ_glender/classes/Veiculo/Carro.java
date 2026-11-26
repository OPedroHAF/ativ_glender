/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ_glender.classes.Veiculo;

/**
 *
 * @author 1518869
 */
public class Carro extends Veiculo implements Avaliavel {
    private int qtd_portas;
    private int nota_avaliacao;
    
    
    public Carro(int qtd_portas) {
        super();
        this.qtd_portas = qtd_portas;
    }
   
    public void avaliar(int nota){
        this.nota_avaliacao = nota;
    }
    
}
