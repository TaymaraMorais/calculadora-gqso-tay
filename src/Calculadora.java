/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraapi;

/**
 *
 * @author Taymara
 */
public class Calculadora {
    private double resultado = 0;
    
    public double soma(double valor1, double valor2){
        try{
                this.resultado = valor1 + valor2;
                return this.resultado;
            } catch(NumberException nfe){
                System.err.println("Número inválido!");

            }
        
    }
}
