package com.hector.ProyectoAndroidG6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.proyectoactivities.R;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        //activa el soporte para la action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /*
    Destruir la app
     */
    public void onBackPress(){
        finish();
    }

    /*
    le da funcionalidad a la fechita de regresar
     */
    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id = menuItem.getItemId();
        if(id == android.R.id.home){
            onBackPress();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}