package com.hector.ProyectoAndroidG6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.proyectoactivities.R;

public class EmpleadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empleado);
        //activa el soporte para la action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getParametros();
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

    public void getParametros(){
        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("msg");
        int year = extras.getInt("year");
        Toast.makeText(this, msg + " " + year, Toast.LENGTH_SHORT).show();
    }
    public void goToActivityMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}