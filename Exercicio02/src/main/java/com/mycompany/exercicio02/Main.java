/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio02;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //Instaciando scanner para ler entrada do user
        
        int multiplicando, iniIntervalo, fimIntervalo;
        int resultado;
        
        System.out.print("Multiplicando: ");
        multiplicando = ler.nextInt();
        System.out.print("Início do Intervalo: ");
        iniIntervalo = ler.nextInt();
        System.out.print("Fim do intervalo: ");
        fimIntervalo = ler.nextInt();
        
        
        
        if (iniIntervalo != fimIntervalo) {
            if (multiplicando > 0 && multiplicando <=5000) {
                if (fimIntervalo - iniIntervalo <= 10 && iniIntervalo < fimIntervalo) {
                    for (int i = iniIntervalo; i <= fimIntervalo; i++) {
                        resultado = multiplicando * i;
                        System.out.println(multiplicando + " x " + i + " = " + resultado);
                    }
                }else{
                    System.out.println("Intervalo não esta correto");}
            }else{
                System.out.println("Multiplicando inválido!");
            }
        }else{
         System.out.println("O início do intervalo deve ser menor que seu fim!");
       }
        
    }
}
