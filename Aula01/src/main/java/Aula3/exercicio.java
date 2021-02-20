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
public class exercicio {
    int codigo;
    int cpf;
    
    public void entradaAluno() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Código.......: ");
        codigo = input.nextInt();
        
        System.out.println("CPF..........: ");
        cpf = input.nextInt();
    }
    
    public void imprimeAluno() 
        System.out.printf("Código.......: %s", codigo);       
        System.out.printf("CPF..........: &s", cpf);
    }
    public static void main (String[] args) {
        exercicio obj = new exercicio();
        
        obj.entradaAluno();
        obj.imprimeAluno();
    }
         
         
}
