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
    int alu_codigo;
    int alu_cpf;
    String alu_rg;
    String alu_nome;
    String alu_endereco;
    int alu_numero;
    String alu_complemento;
    String alu_bairro;
    String alu_cidade;
    String alu_estado;
    String alu_telefone;
    String alu_celular;
    String alu_email;
    float alu_salario;
    boolean alu_masculino
    
    public void entradaAluno() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Código.......: ");
        alu_codigo = input.nextInt();
        
        System.out.println("CPF..........: ");
        alu_cpf = input.nextInt();
        
        System.out.println("RG..........: ");
        alu_rg = input.next();
        
        System.out.println("Nome..........: ");
        alu_nome = input.next();
        
        System.out.println("Endereço..........: ");
        alu_endereco = input.next();
        
        System.out.println("Numero..........: ");
        alu_numero = input.nextInt();
        
        System.out.println("Complemento..........: ");
        alu_complemento = input.next();
        
        System.out.println("Bairro..........: ");
        alu_bairro = input.next();
        
        System.out.println("Cidade..........: ");
        alu_cidade = input.next();
        
        System.out.println("Estado..........: ");
        alu_estado = input.next();
        
        System.out.println("Telefone..........: ");
        alu_telefone = input.next();
        
        System.out.println("Celular..........: ");
        alu_celular = input.next();
        
        System.out.println("Email..........: ");
        alu_email = input.next();
        
     
        System.out.println("Você é Homem? (true) or (false) ..........: ");
        alu_masculino = input.nextBoolean();
            
        
    }
    
    public void imprimeAluno(){
        System.out.printf("Código.......: %s ", alu_codigo);
        System.out.printf("\nCPF..........: %s ", alu_cpf);
        System.out.printf("\nRG..........: %s ", alu_rg);
        System.out.printf("\nNome..........: %s ",alu_nome);
        System.out.printf("\nEndereço..........: %s ", alu_endereco);
        System.out.printf("\nNumero..........: %s ", alu_numero);
        System.out.printf("\nComplemento..........: %s ", alu_complemento);
        System.out.printf("\nBairro..........: %s ", alu_bairro);
        System.out.printf("\nCidade..........: %s ", alu_cidade);
        System.out.printf("\nEstado..........: %s ", alu_estado);
        System.out.printf("\nTelefone..........: %s ", alu_telefone);
        System.out.printf("\nCelular..........: %s ", alu_celular);
        System.out.printf("\nEmail..........: %s ", alu_email);
        if(alu_masculino == true){
            System.out.printf("\nVocê é homem ");
        }else{
            System.out.print("\nVocê é Mulher");
        }
        
    }
    public static void main (String[] args) {
        exercicio obj = new exercicio();
        
        obj.entradaAluno();
        obj.imprimeAluno();
    }
         
         
}
