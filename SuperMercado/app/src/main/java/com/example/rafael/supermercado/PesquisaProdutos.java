package com.example.rafael.supermercado;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rafael.supermercado.Adapter.pesquisaAdapter;
import com.example.rafael.supermercado.Modelo.Carrinho;
import com.example.rafael.supermercado.Modelo.Produto;
import com.example.rafael.supermercado.RestClient.RestFulClient;

import java.util.ArrayList;

public class PesquisaProdutos extends AppCompatActivity {

    pesquisaAdapter pAdapter;
    ListView listView;
    String produto;
    Integer quantidade;
    Double preco;
    Produto p;
    Carrinho c;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa_produtos);

        listView = (ListView) findViewById(R.id.lstPesquisaProduto);

        ArrayList<Produto> listProduto = new ArrayList<>();

        pAdapter = new pesquisaAdapter(this,listProduto);
        listView.setAdapter(pAdapter);
    }

    public void buscarWs(View v){
        carregarListaProdutos();
    }

    public void carregarListaProdutos(){
        //Objeto que sera executado em backgrounnd
        AsyncTask taskWsRecuperar = new BuscaProduto();
        taskWsRecuperar.execute();
    }

    class BuscaProduto extends AsyncTask<Object, Void,  ArrayList<Produto>> {


        private RestFulClient cliente = new RestFulClient();


        /** Este metodo eh executado por um Thread que eh controlado pela classe
         *  Quando esta Thread finaliza a execucao, automaticamente o metodo
         *  onPostExecute eh executado
         */
        @Override
        protected  ArrayList<Produto> doInBackground(Object ... args) {

//            int operacao = (int) args[0];
            ArrayList<Produto> list = new ArrayList<Produto>();

            String jsonEnderecos = cliente.recuperarProdutos();
            list = Produto.fromArrayJson(jsonEnderecos);

            return list;

        }

        /** Este metodo eh automaticamente executado quando doInBackground() finalizar
         * Neste momento ele irah renderizar o listview com os dados recuperados no webservice
         */
        protected void onPostExecute(ArrayList<Produto> result) {

            ListView listView = (ListView) findViewById(R.id.lstPesquisaProduto);
            pAdapter.setLista(result);
            listView.setAdapter(pAdapter);

        }
    }

//    public void carrinho(View view){
//        Intent abreCarrinho = new Intent(PesquisaProdutos.this,CarrinhoActivity.class);
//        startActivity(abreCarrinho);
//    }
//
//
//    public void onItemClick(AdapterView<pesquisaAdapter> parent, View view, int position, long id){
//        TextView txtProduto = (TextView) findViewById(R.id.txtNomeProduto);
//        TextView txtPreco = (TextView) findViewById(R.id.txtPreco);
//        EditText txtQtd = (EditText) findViewById(R.id.txtQuantidade);
//
//        produto = txtProduto.getText().toString();
//        preco = Double.valueOf(txtPreco.getText().toString());
//        quantidade = Integer.valueOf(txtQtd.getText().toString());
//
//        p.setNome(produto);
//        p.setPreco(preco);
//        p.setQuantidade(quantidade);
//        c.carrinho.add(p);
//    }


}
