package com.hector.ProyectoAndroidG6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import com.example.proyectoactivities.R;

public class logInActivity extends AppCompatActivity {
    TextView tv1;
    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        //ocultar action bar
        getSupportActionBar().hide();
        tv1 = (TextView) findViewById(R.id.textView3);
        et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        et2 = (EditText) findViewById(R.id.editTextTextPassword);
//        tv1.setText("Recordar Contraseña");
//        String link = "<a href='https://imaster.academy/course/view.php?id=999&section=3'> Imaster</a>";
        String text = "<a href=''>Recordar Contraseña</a>";
        tv1.setLinkTextColor(Color.BLUE);
        //abre un enlace
//        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        tv1.setText(Html.fromHtml(text));
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Su Contraseña es admin" ,Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void iniciarSecion(View view){
        if(et1.getText().toString().equals("admin") && et2.getText().toString().equals("admin")){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
        }
        if(et1.getText().toString().equals("")){
            Toast.makeText(this, "por favor Ingrese el usuario", Toast.LENGTH_SHORT).show();
            et1.requestFocus();
        }else if(et2.getText().toString().equals("")){
            Toast.makeText(this, "por favor Ingrese la contraseña", Toast.LENGTH_SHORT).show();
            et2.requestFocus();
        }

    }

}