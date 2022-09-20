package com.example.calcularmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calcular_Promedio (View view){


        TextView tv1 = findViewById(R.id.tv_Status);
        EditText et1 = findViewById(R.id.txt_matematicas);
        EditText et2 = findViewById(R.id.txt_quimica);
        EditText et3 = findViewById(R.id.txt_fisica);


        String Matematicas_String = et1.getText().toString();
        String Quimica_String = et2.getText().toString();
        String Fisica_String = et3.getText().toString();


        double matematicas = Double.valueOf(Matematicas_String);
        double quimica = Double.valueOf(Quimica_String);
        double fisica = Double.valueOf(Fisica_String);

        double media = (matematicas+quimica+fisica)/3;

        if(media < 5){
            tv1.setText("El alumno esta suspenso con un: "+media);
        }else if (media >= 5){
            tv1.setText("El alumno esta aprobado con un: "+media);
        }

    }

}