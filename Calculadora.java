/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aulaencapsulamento;

/**
 *
 * @author jeann.leite
 */
public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }
    
    public double soma(double a, double b){
        return a + b;
    }
    
    public double soma(int a, double b){
        return a + b;
    }
    
    public double soma(double a, int b){
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println("Soma de 5 e 3 (inteiros): " + calc.soma(5, 3));
        System.out.println("Soma de 5.5 e 3.3:" + calc.soma(5.5, 3.3));
        System.out.println("Soma de 5 e 3.3: " + calc.soma(5, 3.3));
        System.out.println("Soma de 5.5 e 3:" + calc.soma(5.5, 3));
    }
    
}
