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
public class exercicio2 {
    int codigo, dependentes;
    String nome, nome_do_pai, mae, telefone;
    float salario_base, per_inss, per_irrf, salario_familia, vale_transporte, valor_assistencia_medica, descontos, salario_liquido;
    
    public void Calculos(){
        descontos = salario_base * (per_inss/100);
        descontos += salario_base * (per_irrf/100);
        salario_liquido = salario_base + valor_assistencia_medica + vale_transporte + salario_familia - descontos;
    }
    
    public void EntradaDados(){
         Scanner input = new Scanner(System.in);
         System.out.println("Código.......: ");
         codigo = input.nextInt();
         
         System.out.println("Nome.......: ");
         nome = input.next();
         
         System.out.println("Nome do Pai.......: ");
         nome_do_pai = input.next();
         
         System.out.println("Nome da Mae.......: ");
         mae = input.next();
        
         System.out.println("Telefone.......: ");
         telefone = input.next();
         
         System.out.println("Digite o Salário Base.......: ");
         salario_base = input.nextFloat();
         
         System.out.println("Valor Salario Familia.......: ");
         salario_familia = input.nextFloat();
         
         System.out.println("Valor Assistencia Médica.......: ");
         valor_assistencia_medica = input.nextFloat();
         
         System.out.println("Valor Vale Transporte.......: ");
         vale_transporte = input.nextFloat();
         
         System.out.println("Percentual INSS.......: ");
         per_inss = input.nextFloat();
         
         System.out.println("Percentual IRRF.......: ");
         per_irrf = input.nextFloat();

    };
    public void ImprimeDados(){
        System.out.printf("\nCodigo.......: %s", codigo);
        System.out.printf("\nNome.......: %s", nome);
        System.out.printf("\nSalário Base.......: %s", salario_base);
        System.out.printf("\nSalário Liquido.......: %s", salario_liquido);
    };
    
    public static void main (String[] args) {
        exercicio2 obj = new exercicio2();
        
        obj.EntradaDados();
        obj.Calculos();
        obj.ImprimeDados();
    };
}
