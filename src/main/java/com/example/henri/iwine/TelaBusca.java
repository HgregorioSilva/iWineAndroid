package com.example.henri.iwine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class TelaBusca extends AppCompatActivity {
    private Button buscarVinho;
    private Button sairLogin;
    private Button voltarEscolha;

    public TelaBusca() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_busca);

        sairLogin = (Button) findViewById(R.id.bt_Sair);
        sairLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaBusca.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        voltarEscolha = (Button) findViewById(R.id.bt_vtEscolha);
        voltarEscolha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaBusca.this,TelaEscolha.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
