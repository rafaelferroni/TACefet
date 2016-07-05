package com.example.rafael.supermercado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class cadastroUsuarioActivity extends AppCompatActivity {

    EditText nome;
    EditText usuario;
    EditText senha;
    EditText confirmarSenha;
    EditText telefone;
    EditText cpf;
    EditText email;
    EditText confirmarEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

    }

    public void cadastrarUsuario(View view){
        dadosUsuario novoUsuario = new dadosUsuario();

        novoUsuario.setNome(findViewById(R.id.txtNome).toString());
        novoUsuario.setUsuario(findViewById(R.id.txtNomeUsuario).toString());
        novoUsuario.setCpf(findViewById(R.id.txtCpf).toString());
        novoUsuario.setSenha(findViewById(R.id.txtSenhaLogin).toString());
        novoUsuario.setConfirmarSenha(findViewById(R.id.txtConfirmarSenha).toString());
        novoUsuario.setEmail(findViewById(R.id.txtEmail).toString());
        novoUsuario.setConfirmarSenha(findViewById(R.id.txtConfirmarEmail).toString());
        novoUsuario.setTelefone(findViewById(R.id.txtNome).toString());

        //Gravação no banco

        this.finish();
    }
}
