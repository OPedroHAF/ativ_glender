/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ativ_glender.classes.Aluguel;
import com.mycompany.ativ_glender.classes.Veiculo.Avaliavel;
/**
 *
 * @author 1518869
 */
public class AluguelExecutivo implements Avaliavel{
    private boolean motorista_particular = true;
    private int nota_avaliacao;
    public AluguelExecutivo() {
        super();
    }

    public boolean isMotorista_particular() {
        return motorista_particular;
    }

    public void setMotorista_particular(boolean motorista_particular) {
        this.motorista_particular = motorista_particular;
    }
    
    @Override
     public void avaliar(int nota){
         this.nota_avaliacao = nota;
     }
}
