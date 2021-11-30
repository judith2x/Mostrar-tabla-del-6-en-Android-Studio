package com.example.tablamultiplicar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button botoncalcular, botonlimpiar;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado=(TextView)findViewById(R.id.resultado);
        botoncalcular=(Button)findViewById(R.id.botoncalcular);
        botoncalcular.setOnClickListener(this);
        botonlimpiar=(Button)findViewById(R.id.botonlimpiar);
        botonlimpiar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.botoncalcular:
                resultado.setText(R.string.resultado);
                break;
            case R.id.botonlimpiar:
                resultado.setText("");
                break;
        }
    }
}
