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
public class Exercicio4 {

    String nome, curso, diciplina;
    float nota1, nota2, nota3, nota4;
    int ra;
    boolean nota_correta = false;

    public void somar(float numero1, float numero2) {
        float soma;
        soma =  numero1 + numero2;
        System.out.println(soma);
      
    }

    public static void main(String[] args) {
        Exercicio4 obj = new Exercicio4();
                
        obj.somar(1,3); 
        obj.somar(2,5); 

    }
}
