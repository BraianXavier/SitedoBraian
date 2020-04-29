package com.braian.models;

public class Evento {
    public String nome;
    public String local;
    public String data;
    public String hora;


    public String getLocal() {
        return local;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
