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
public class IMC {

    public static void IMC(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o peso em KG: ");
        float peso = entrada.nextFloat();

        System.out.println("Entre com a altura em M: ");
        float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("O imc é: " + imc);

    }
    
    public static void main(String[] args) {
        IMC(args);
    }
}
