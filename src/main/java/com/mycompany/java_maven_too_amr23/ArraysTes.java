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
public class ArraysTes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero de posições: ");
        int posicoes = entrada.nextInt();

        int[] dados = new int[posicoes];

        for (int i = 0; i < dados.length; i++) {
            System.out.println("Informe o prox N: ");
            dados[i] = entrada.nextInt();
        }

        System.out.println("Operção ");
        System.out.println("1- listar em ordem ");
        System.out.println("2- listar invertido");
        System.out.println("3- exibir numeros que 5");
        System.out.println("4- exibir até primeiro numero menor que 5");

        int operacao = entrada.nextInt();
        switch (operacao) {
            case 1:
                for (int i = 0; i < dados.length; i++) {
                    System.out.println(dados[i]);
                }
                break;

            case 2:
                for (int i = dados.length - 1; i >= 0; i--) {
                    System.out.println(dados[i]);
                }
                break;

            case 3:
                for (int i = 0; i < dados.length; i++) {
                    if (dados[i] >= 5) {
                        continue;
                    }
                    System.out.println(dados[i]);
                }
                break;

            case 4:
                for (int i = 0; i < dados.length; i++) {
                    if (dados[i] >= 5) {
                        break;
                    }
                    System.out.println(dados[i]);
                }
                break;

            default:
                System.out.println("VAlor invalido");

        }
        entrada.close();
    }
}