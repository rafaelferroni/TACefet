package com.example.rafael.supermercado.Modelo;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.util.ArrayList;

/**
 * Created by rafael on 29/06/16.
 */
public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static Produto fromjson(String objJson){
        Gson gson = new Gson();
        Produto produto = gson.fromJson(objJson, Produto.class);
        return produto;

    }

    public static ArrayList<Produto> fromArrayJson(String objJson){
        Gson listGson = new Gson();
        ArrayList<Produto> listProdutos = new ArrayList<>();

        JsonParser parser = new JsonParser();
        JsonArray array = parser.parse(objJson).getAsJsonArray();

        int tamanho = array.size();

        for (int i = 0; i < tamanho; i++){
            Produto listProduto = listGson.fromJson(array.get(i),Produto.class);
            listProdutos.add(listProduto);


        }
        return listProdutos;
    }
}
