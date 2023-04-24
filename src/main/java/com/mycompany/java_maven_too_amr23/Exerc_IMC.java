/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_maven_too_amr23;
import java.util.Scanner;

/**
 *
 * @author aliss
 */
public class Exerc_IMC {

    public static void calculo(float peso, float altura) {
        double[] pesoIMC = {18.5, 24.9, 29.9, 39.9, 90000};
        String[] classifica = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};
        float IMC = peso / (altura * altura);
        System.out.println("O IMC é: " + IMC);
        
        int i = 0;
        while (IMC > pesoIMC[i]){i++;}
        System.out.println("A classificação é: " + classifica[i]);
    }
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite qual o peso em KG: ");
        float peso = entrada.nextFloat();
        System.out.println("Digite qual a altura em M: ");
        float altura = entrada.nextFloat();
        calculo(peso,altura);
    }
    
    
}
