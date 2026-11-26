/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ_glender.classes.Veiculo;

/**
 *
 * @author 1518869
 */
public class Van extends Veiculo implements Inspecionavel, Avaliavel{
    private int max_passageiros;
    private int nota_avaliacao;
    
    public Van(int max_passageiros){
        super();
        this.max_passageiros = max_passageiros;
    }
    
    public void realizarInspecao(){
    
    }
    
    public void avaliar(int nota){
        this.nota_avaliacao = nota;
    }
}
