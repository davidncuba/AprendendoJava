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
public class Exercicio2 {
    int codigo;
    String nome, status;
    float nota1, nota2, nota3, nota4, media;
   
    
    public void EntradaDados(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Código.......: ");
        codigo = input.nextInt();
        
        System.out.println("Digite o Nome do Aluno: ");
        nome = input.next();
        do{
            System.out.println("Digite a Nota1: ");
            nota1 = input.nextInt();
           if(nota1 > 5){
               System.out.println("Nota tem que ser entre 0 e 5 ");
           }
        }
        while (nota1 > 5);
        
        do{
            System.out.println("Digite a Nota2: ");
            nota2 = input.nextInt();
           if(nota2 > 5){
               System.out.println("Nota tem que ser entre 0 e 5 ");
           }
        }
        while (nota2 > 5);
        
        do{
            System.out.println("Digite a Nota3: ");
            nota3 = input.nextInt();
           if(nota3 > 5){
               System.out.println("Nota tem que ser entre 0 e 5 ");
           }
        }
        while (nota3 > 5);
        
        do{
            System.out.println("Digite a Nota4: ");
            nota4 = input.nextInt();
           if(nota4 > 5){
               System.out.println("Nota tem que ser entre 0 e 5 ");
           }
        }
        while (nota4 > 5);
        
          
    }
   
    public void Calculo(){
        
        media = (nota1 + nota2+ nota3 + nota4) / 4;
//        Média = 0 (“Nota Zero – Péssimo”);
//         Média = 1 (“Nota Um – Ruim”);
//         Média = 2 (“Nota Dois – Regular”);
//         Média = 3 (“Nota Três – Bom”);
//         Média = 4 (“Nota Quatro – Ótimo”);
//         Média = 5 (“Nota Cinco – Excelente”);
        switch ((int) media){
            case 0 : 
                System.out.print("Nota Zero – Péssimo");
                break;
            case 1 :
                System.out.print("Nota Um – Ruim");
                break;
            case 2 :
                System.out.print("Nota Dois – Regular");
                break;
            case 3 :
                System.out.print("Nota Três – Bom");
                break;
            case 4 :
                System.out.print("Nota Quatro – Ótimo");
                break;
            case 5 :
                System.out.print("Nota Quatro – Ótimo");
                break;
    }
    }
        
    public static void main (String[] args) {
        Exercicio2 obj = new Exercicio2();
        
        obj.EntradaDados();
        obj.Calculo();
    }    
       
}
