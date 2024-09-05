/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula4;

/**
 *
 * @author jeann.leite
 */
public class CalculadoraArea {

    // Método para calcular a área de um quadrado
    public double calcularArea(double lado) {
        return lado * lado;
    }

    // Método para calcular a área de um retângulo
    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    // Método para calcular a área de um círculo
    public double calcularArea(double raio, boolean isCirculo) {
        if (isCirculo) {
            return Math.PI * raio * raio;
        }
        throw new IllegalArgumentException("Parâmetro isCirculo deve ser true para calcular a área de um círculo.");
    }

    public static void main(String[] args) {
        CalculadoraArea calc = new CalculadoraArea();

        // Calculando a área do quadrado
        double ladoQuadrado = 5.0;
        System.out.println("Área do quadrado: " + calc.calcularArea(ladoQuadrado));

        // Calculando a área do retângulo
        double larguraRetangulo = 4.0;
        double alturaRetangulo = 6.0;
        System.out.println("Área do retângulo: " + calc.calcularArea(larguraRetangulo, alturaRetangulo));

        // Calculando a área do círculo
        double raioCirculo = 3.0;
        System.out.println("Área do círculo: " + calc.calcularArea(raioCirculo, true));
    }
}

