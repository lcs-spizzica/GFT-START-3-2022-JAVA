/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio04;

/**
 *
 * @author lucas
 */
public class Veiculo {
    
    private String nome;
    private String marca;
    private int capacidadeDoTanque;
    private int litrosNoTanque;

    public Veiculo(String nome, String marca, int capacidadeDoTanque) {
        this.nome = nome;
        this.marca = marca;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.litrosNoTanque = 0;
    }

   

    public Veiculo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public int getlitrosNoTanque() {
        return litrosNoTanque;
    }

    public void setlitrosNoTanque(int litrosNoTanque) {
        this.litrosNoTanque = litrosNoTanque;
    }
    
    public void abastecer(int litrosComprados){
        
        for (int i = this.getlitrosNoTanque(); i <= litrosComprados; i++) {
            setlitrosNoTanque(i);
             System.out.println("Tem no tanque " + this.litrosNoTanque);
             if (this.getlitrosNoTanque() > capacidadeDoTanque) {
                 System.out.println("Litro no tanque " + litrosNoTanque);
                 System.out.println("Tanque encheu!!! excedou " + (this.litrosNoTanque - this.capacidadeDoTanque) + "Litros");
            }else{
                 System.out.println("Litro no tanque " + litrosNoTanque);
             }
           
        }
        float preco = litrosComprados * 7;
        
            System.out.println("Total gasto: " + preco );
        }
        
        
    }

    

