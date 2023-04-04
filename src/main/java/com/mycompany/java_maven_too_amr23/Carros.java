/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package br.edu.ifsul.bcc.too.topico3.exercicios;

//import br.edu.ifsul.bcc.too.topico3.Colecoes;
//import br.edu.ifsul.bcc.too.topico3.util.Aluno;
import java.util.ArrayList;
import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author 20212PF.CC0020
 */
public class Carros {

    String nome;
    int modelo;
    String fabricante;
    int chassi;
    float valor;

    Carros(String nome, int modelo, String fabricante, int chassi, float valor) {

        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.chassi = chassi;
        this.valor = valor;

    }

    @Override
    public String toString(){
        
        return chassi + " - " + modelo;
    }
    
    
}
