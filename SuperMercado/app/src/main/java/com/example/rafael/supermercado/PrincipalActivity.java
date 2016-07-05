package com.example.rafael.supermercado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


    }

    public void pesquisaProduto(View view){
        Intent pesquisaProduto = new Intent(PrincipalActivity.this,PesquisaProdutos.class);
        startActivity(pesquisaProduto);
    }

    public void abreCadastroUsuario(View view){
        Intent abreCadastro = new Intent(PrincipalActivity.this,cadastroUsuarioActivity.class);
        startActivity(abreCadastro);
    }

    public void abreLogin(View view){
        Intent abreLogin = new Intent(PrincipalActivity.this,LoginActivity.class);
        startActivity(abreLogin);
    }





}
