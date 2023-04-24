/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_maven_too_amr23;
import java.util.Scanner;

/**
 *
 * @author aliss
 */
public class MainExStr {

    public static void calculo(float peso, float altura) {

        double[] pesoIMC = {18.5, 24.9, 29.9, 39.9, 90000};
        String[] classifica = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};
        float IMC = peso / (altura * altura);
        System.out.println("O IMC é: " + IMC);

        int i = 0;
        while (IMC > pesoIMC[i]) {
            i++;
        }
        System.out.println("A classificação é: " + classifica[i]);

    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String teste = "s";

        while (teste.equals("s") || teste.equals("S")) {
            System.out.println("Deseja calcular IMC? s - Sim // n - não");
            teste = entrada.nextLine();

            if (teste.equals("s") || teste.equals("S")) {
                System.out.println("Digite qual o peso em KG: ");
                float peso = entrada.nextFloat();
                entrada.nextLine();
                System.out.println("Digite qual a altura em M: ");
                float altura = entrada.nextFloat();
                entrada.nextLine();
                calculo(peso, altura);
            }

        }

    }
}



