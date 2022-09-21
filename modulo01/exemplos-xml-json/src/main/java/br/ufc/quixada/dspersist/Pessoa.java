package br.ufc.quixada.dspersist;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Pessoa {
    @JacksonXmlProperty(isAttribute = true)
    private int id;
    private String nome;

    public Pessoa() {}

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{id: " + this.id + ", nome: " + this.nome + "}";
    }
}