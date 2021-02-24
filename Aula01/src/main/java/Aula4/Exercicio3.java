/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4;

import java.util.Scanner;

/**
 *
 * @author davidcuba
 */
public class Exercicio3 {
    int numero;
    
    public void EntradaDados(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um Numero para fazer a tabuada: ");
        numero = input.nextInt();
        
    }
    public void CalculoTabuadaFor(){
       int resultado;
       System.out.println("Calculo da tabuada com For");
       for (int i = 0; i <= 10;){
           resultado = i * numero;
           System.out.println(i + " x " + numero + " = " + resultado);
           i++;
       }
    }
    public void CalculoTabuadaWhile(){
       int resultado, i;
       System.out.println("Calculo da tabuada com While");
       i = 0;
       while (i <= 10){
           resultado = i * numero;
           System.out.println(i + " x " + numero + " = " + resultado);
           i++;
       }
    }
    public static void main (String[] args) {
        Exercicio3 obj = new Exercicio3();
        
        obj.EntradaDados();
        obj.CalculoTabuadaFor();
        obj.CalculoTabuadaWhile();
    }    
}
