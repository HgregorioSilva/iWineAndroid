package com.example.henri.iwine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TelaEscolha extends AppCompatActivity {
    private Button sairLogin;
    private Button entrarTelaBusca;
    private Button entrarTelaAdiciona;
    private Button entrarTelaDeleta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolha);

        sairLogin = (Button) findViewById(R.id.bt_Sair);
        sairLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaEscolha.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        entrarTelaBusca = (Button) findViewById(R.id.bt_Buscar);
        entrarTelaBusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaEscolha.this,TelaBusca.class);
                startActivity(intent);
                finish();
            }
        });

        entrarTelaAdiciona = (Button) findViewById(R.id.bt_Add);
        entrarTelaAdiciona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaEscolha.this,TelaAdiciona.class);
                startActivity(intent);
                finish();
            }
        });

        entrarTelaDeleta = (Button) findViewById(R.id.bt_Deletar);
        entrarTelaDeleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaEscolha.this,TelaDeleta.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
