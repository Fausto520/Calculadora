package com.fausto.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtTotal;
    private EditText txtN1;
    private EditText txtN2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTotal = findViewById(R.id.textTotal);
        txtN1 = findViewById(R.id.textN1);
        txtN2 = findViewById(R.id.textN2);


    }


    public void realizarSuma(View view) {


        if (txtN1.getText().toString().equals("") || txtN2.getText().toString().equals("")) {
            Toast.makeText(this, R.string.vacio, Toast.LENGTH_SHORT).show();
        } else {


            Integer respuesta = Integer.parseInt(txtN1.getText().toString()) + Integer.parseInt(txtN2.getText().toString());
            txtTotal.setText(Integer.toString(respuesta));
        }

    }

    public void realizarResta(View view) {

        Integer respuesta = Integer.parseInt(txtN1.getText().toString()) - Integer.parseInt(txtN2.getText().toString());
        txtTotal.setText(Integer.toString(respuesta));
    }

    public void realizarMultiplicacion(View view) {
        Integer respuesta = Integer.parseInt(txtN1.getText().toString()) * Integer.parseInt(txtN2.getText().toString());
        txtTotal.setText(Integer.toString(respuesta));
    }

    public void realizarDivision(View view) {
        Double respuesta = Double.parseDouble(txtN1.getText().toString()) / Double.parseDouble(txtN2.getText().toString());
        txtTotal.setText(Double.toString(respuesta));

    }



        }
    }
}