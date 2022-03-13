package com.example.app_tablasmultiplicar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    EditText mostrar;
    Spinner numero;
    Button pagina3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mostrar=(EditText) findViewById(R.id.editTextMultiLine2);
        numero=(Spinner) findViewById(R.id.spinner2);
        pagina3=(Button) findViewById(R.id.button3);

        pagina3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina3= new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(pagina3);
            }
        });
    }

    public void calcular(View view){
        String tablas= "";
        String opcion=numero.getSelectedItem().toString();

        int opciones=Integer.parseInt(opcion.toString());
        for (int i =1; i <=10; i++){
            tablas +=String.valueOf(opciones) + "\t * \t" + i + "\t = \t" + (opciones * i)+ "\n";
        }
        mostrar.setText(tablas);
    }
}