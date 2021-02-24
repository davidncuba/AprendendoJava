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
public class Exercicio1 {
    int codigo;
    String nome, status;
    float nota1, nota2, nota3, nota4, media;
    
    
    public void EntradaDados(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Código.......: ");
        codigo = input.nextInt();
        
        System.out.println("Digite o Nome do Aluno: ");
        nome = input.next();
        
        System.out.println("Digite a Nota1: ");
        nota1 = input.nextInt();
        
        System.out.println("Digite a Nota2: ");
        nota2 = input.nextInt();
        
        System.out.println("Digite a Nota3: ");
        nota3 = input.nextInt();
        
        System.out.println("Digite a Nota4: ");
        nota4 = input.nextInt();
    }
    
    public void Calculo(){
        
        media = (nota1 + nota2+ nota3 + nota4);
        if(media >= 28){
            status = "Aprovado";
            
        }else{
            status = "Reprovado";
        }
        System.out.print(status);
    }
        
    public static void main (String[] args) {
        Exercicio1 obj = new Exercicio1();
        
        obj.EntradaDados();
        obj.Calculo();
    }    
        
        
    
    
}
