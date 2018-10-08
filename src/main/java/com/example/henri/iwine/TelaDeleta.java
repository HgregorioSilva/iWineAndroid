package com.example.henri.iwine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TelaDeleta extends AppCompatActivity {
    private Button deletarVinho;
    private Button sairLogin;
    private Button voltarEscolha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_deleta);

        sairLogin = (Button) findViewById(R.id.bt_Sair);
        sairLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaDeleta.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        voltarEscolha = (Button) findViewById(R.id.bt_vtEscolha);
        voltarEscolha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaDeleta.this,TelaEscolha.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

