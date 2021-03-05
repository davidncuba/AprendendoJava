/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author davidcuba
 */
public class ClasseExemplo {
    private int numero;
    private String nome;
    
    //método Contrutor
    public ClasseExemplo(){
        
    }
    
    //encapsulamento
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public static void main(String[] args){
        ClasseExemplo exemplo = new ClasseExemplo();
        
        exemplo.setNumero(101);
        exemplo.setNome("David");
        
        System.out.println("Número....: " + exemplo.getNumero());
        System.out.println("Nome....: " + exemplo.getNumero());
    }
}
