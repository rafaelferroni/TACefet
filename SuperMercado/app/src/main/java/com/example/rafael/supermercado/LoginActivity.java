package com.example.rafael.supermercado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Login(View view){

        dadosUsuario login = new dadosUsuario();

        login.setUsuario(findViewById(R.id.txtUsuarioLogin).toString());
        login.setUsuario(findViewById(R.id.txtSenhaLogin).toString());

    }
}
