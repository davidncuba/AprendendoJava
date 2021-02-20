/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3;
import java.util.Scanner;
/**
 *
 * @author davidcuba
 */
public class Aula3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome = "";   
        
        System.out.println("Digite seu nome: ");
        
        nome = input.next();
        
        System.out.printf("\nMeu nome é: %s", nome);
        
        int idade = 0;
        
        System.out.println("\nDigite sua idade");
        
        idade = input.nextInt();
        
        System.out.printf("\nSua idade é: %s", idade);
        
       
    }
}
