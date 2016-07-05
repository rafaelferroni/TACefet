package com.example.rafael.supermercado;

import android.widget.EditText;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * Created by rafael on 28/06/16.
 */
public class dadosUsuario implements Serializable{
    private String nome;
    private String usuario;
    private String senha;
    private String confirmarSenha;
    private String telefone;
    private String cpf;
    private String email;
    private String confirmarEmail;

    public String getConfirmarEmail() {
        return confirmarEmail;
    }

    public void setConfirmarEmail(String confirmarEmail) {
        this.confirmarEmail = confirmarEmail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
