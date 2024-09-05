/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aulaencapsulamento;

/**
 *
 * @author jeann.leite
 */
import java.util.Scanner;

public class CalculadoraImpostoDeRenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite a sua renda anual: R$ ");
        double rendaAnual = scanner.nextDouble();
        
        
        double imposto = calcularImposto(rendaAnual);
        
        System.out.printf("O imposto de renda devido é: R$ %.2f%n", imposto);
    }
    
    public static double calcularImposto(double renda) {
        double imposto = 0.0;
        
        if (renda <= 1903.98) {
            // Faixa isenta
            imposto = 0;
        } else if (renda <= 2826.65) {
            // Faixa de 7,5%
            imposto = (renda - 1903.98) * 0.075;
        } else if (renda <= 3751.05) {
            // Faixa de 15%
            imposto = (renda - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        } else if (renda <= 4664.68) {
            // Faixa de 22,5%
            imposto = (renda - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        } else {
            // Faixa acima de 4664,68
            imposto = (renda - 4664.68) * 0.275 + (4664.68 - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        }
        
        return imposto;
    }
}
