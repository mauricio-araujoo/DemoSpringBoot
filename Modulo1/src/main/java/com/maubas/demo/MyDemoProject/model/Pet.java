package com.maubas.demo.MyDemoProject.model;

public class Pet {
    private String nome;
    private String tipo;

    public Pet(String nome, String tipo){
        setNome(nome);
        setTipo(tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}