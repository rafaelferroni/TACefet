package com.example.rafael.supermercado;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.rafael.supermercado.Modelo.Carrinho;
import com.example.rafael.supermercado.Modelo.Produto;
import com.example.rafael.supermercado.RestClient.RestFulClient;

/**
 * Created by rafael on 01/07/16.
 */
public class GravarCarrinho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
    }


    Carrinho c;

    public void gravarCarrinho(View v){


        //Objeto que sera executado em backgrounnd
        AsyncTask taskWsRecuperar = new finalizaCompra();
        taskWsRecuperar.execute();
    }

    class finalizaCompra extends AsyncTask<Object, Void, Void> {


        private RestFulClient cliente = new RestFulClient();



        /** Este metodo eh executado por um Thread que eh controlado pela classe
         *  Quando esta Thread finaliza a execucao, automaticamente o metodo
         *  onPostExecute eh executado
         */
        @Override
        protected  Void doInBackground(Object ... args) {

//            int operacao = (int) args[0];
            cliente.salvarCarrinho(c);
            return null;

        }

        /** Este metodo eh automaticamente executado quando doInBackground() finalizar
         * Neste momento ele irah renderizar o listview com os dados recuperados no webservice
         */
        @Override
        protected void onPostExecute(Void resultado) {

            Toast t = Toast.makeText(GravarCarrinho.this, "Endereço salvo", Toast.LENGTH_LONG);
            t.show();

        }
    }
}
