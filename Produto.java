/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aulaencapsulamento;

/**
 *
 * @author jeann.leite
 */
public class Produto {

   public void exibirinfo(String nome){
       System.out.println("Nome do Produto:" + nome);
   }
   
   public void exibirinfo(String nome, int codigo){
       System.out.println("Nome do Produto:" + nome + ", Codigo" + codigo);
   }
   
   public void exibirinfo(String nome, int codigo, double preço){
       System.out.println("Nome do Produto:" + nome + ",Codigo" + codigo + "Preço: R$" + preço);
   }
    public static void main(String[] args) {      
        Produto prod = new Produto(Computador,153551,40000);
        
        System.out.println("Nome do Produto:" + prod.exibirinfo(Computador));
        System.out.println("Nome,Codigo:" + prod.exibirinfo(Computador, 153551));
        System.out.println("Nome,Codigo,Preço:" + prod.exibirinfo(Computador, 153551, 40000));
    }
    
}
