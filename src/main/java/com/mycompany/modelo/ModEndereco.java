/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author kaua.1880
 */
public class ModEndereco {
    private int id;
    private int id_cidade;
    private String nome_rua;
    private int cep;
    private int numero_residencia;
   
    public ModEndereco() {
    }

    public ModEndereco(int id, int id_cidade, String nome_rua,int cep, int numero_residencia) {
        this.id = id;
        this.id_cidade = id_cidade;
        this.nome_rua = nome_rua;
        this.cep = cep;
        this.numero_residencia = numero_residencia;
    }

    public int getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_rua() {
        return nome_rua;
    }

    public void setNome_rua(String nome_rua) {
        this.nome_rua = nome_rua;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero_residencia() {
        return numero_residencia;
    }

    public void setNumero_residencia(int numero_residencia) {
        this.numero_residencia = numero_residencia;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", id_cidade=" + id_cidade + ", nome_rua=" + nome_rua + ", cep=" + cep + ", numero_residencia=" + numero_residencia + '}';
    }
}

