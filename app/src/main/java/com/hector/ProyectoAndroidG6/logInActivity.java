package com.hector.ProyectoAndroidG6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.example.proyectoactivities.R;

public class logInActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        //ocultar action bar
        getSupportActionBar().hide();
        tv1 = (TextView) findViewById(R.id.textView3);
        tv1.setText("Recordar Contraseña");
        tv1.setTextColor(Color.BLUE);
    }

}