/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio03;

/**
 *
 * @author lucas
 */
public class Filme {
    private String titulo;
    private String genero;
    private int duravaoEmMinutos;
    private String horarioSessao;

    public Filme(String titulo, String genero, int duravaoEmMinutos, String horarioSessao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duravaoEmMinutos = duravaoEmMinutos;
        this.horarioSessao = horarioSessao;
    }

    public Filme() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuravaoEmMinutos() {
        return duravaoEmMinutos;
    }

    public void setDuravaoEmMinutos(int duravaoEmMinutos) {
        this.duravaoEmMinutos = duravaoEmMinutos;
    }

    public String getHorarioSessao() {
        return horarioSessao;
    }

    public void setHorarioSessao(String horarioSessao) {
        this.horarioSessao = horarioSessao;
    }
    
    public double calcularDuracaoEmHoras(double filmeHoras){
        
    return (this.duravaoEmMinutos/60);
    }
    
    public void retornarHoraQueAcaba(){
    }
}
