package com.hector.ProyectoAndroidG6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyectoactivities.R;

public class MainActivity extends AppCompatActivity {

    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.i("Informacion","onCreate");
        txt1 = (TextView) findViewById(R.id.textView);
        txt1.setText("Hola dro");
    }

    /**
     * actividad tiene el foco
     * @param hasFocus
     */
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus){
            Toast.makeText(this, txt1.getTop() + "", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * PERMITE IR A LA ACTIVIDAD 2
     * @param view
     */
    public void goToActivity2(View view){
        Intent intent = new Intent(this, EmpleadoActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //Permite enviar estos parametros a la actividad
        intent.putExtra("msg", "Hola min Tic");
        intent.putExtra("year", 2021);
        startActivity(intent);
    }

    /**
     * Permite que se visualize el menu en esta actividad
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * LE DA LA FUNCIONALIDAD AL MENU
     * @param menuItem
     * @return
     */
    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id = menuItem.getItemId();
        if(id == R.id.mnu_secondActivity){
            Intent intent = new Intent(this, EmpleadoActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("msg", "Hola min Tic");
            intent.putExtra("year", 2021);
            startActivity(intent);
        }else if(id == R.id.mnu_ThreeActivity){
            Intent intent = new Intent(this, ThreeActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /**
     * Mostrar dialogo para cerra la app
     * @param keyCode
     * @param event
     * @return
     */
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode == KeyEvent.KEYCODE_BACK){

            new AlertDialog.Builder(this, R.style.Theme_AppCompat_Dialog_Alert)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Informacion")
                    .setMessage("¿desea salir?")
                    .setNegativeButton("no", null)
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.this.finish();
                        }
                    }).show();
            return true;
        }
        return  super.onKeyDown(keyCode, event);

    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(),"OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("informacion", "OnDestroy");
    }
}