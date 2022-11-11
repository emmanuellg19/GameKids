package com.games.gamekids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button botonMemoria, botonSalir,botonDibujar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonMemoria = (Button) findViewById(R.id.botonMemoria);
        botonSalir = (Button) findViewById(R.id.botonSalir);
        botonDibujar = (Button) findViewById(R.id.botonDibujar);

        botonMemoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jugar();
            }
        });

        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        botonDibujar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dibujar();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void jugar(){
        Intent i = new Intent(this, Rompecabezas.class);
        startActivity(i);
    }

    public void dibujar(){
        Intent i = new Intent(this, Dibujo.class);
        startActivity(i);
    }
}