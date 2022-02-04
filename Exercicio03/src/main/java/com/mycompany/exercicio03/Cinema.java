/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Cinema extends Filme{
    private String nome;
    private String endereco;
    private Filme filme;
    private Filme list;

    public Cinema(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public void adicionarFilme(Filme f1){
            setTitulo(nome);
    }
    public void removerFilme(Filme f1, String teste){
        System.out.println("Deseja realmente remover o filme " + this.getTitulo() + "S/N?");
        if ("N".equals(teste)) {
            System.out.println("Operação cancelada!");
        }else if("S".equals(teste)){
            System.out.println("Remoção feita");
        }else{
            System.out.println("Opção inválida!");
        }
       
    }
    
    public void listarFilmes(){
        List<Filme> listaFilme = new ArrayList<Filme>();
    }
}
