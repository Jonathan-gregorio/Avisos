package com.example.avisos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //agregar TAG para invocarlo en estados de la app
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //en el registro de ejecucion se mostrara la accion realizada
        //Log.i(TAG, "onCreate");
        //Toast.makeText(this,"La aplicacion se ha creado", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "la apluicacion se ha creado ";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT,0,100);
        toast.show();
    }
        @Override
        protected void onStart() {
            super.onStart();
            Log.i(TAG,"onStart");
            Toast.makeText(this, "La aplicacion ha iniciado", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onResume() {
            super.onResume();
            //toas personalizado
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_personalizado_onresume, (ViewGroup) findViewById(R.id.toast_on_resume));
            TextView texto_Toast = (TextView) layout.findViewById(R.id.texto_Toast);
            texto_Toast.setText("la aplicacion se ha recupérado");
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
            //Log.i(TAG, "onResume");
            //Toast.makeText(this, "La aplicacion a se encuentra en ejecucion", Toast.LENGTH_SHORT).show();

            //Context context = getApplicationContext();
            //CharSequence text = "la apluicacion se encuentra en ejecucion ";
            //int duration = Toast.LENGTH_SHORT;
            //Toast toast = Toast.makeText(context, text, duration);
            //toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT,0,100);
            //toast.show();
        }

        @Override
    protected void onPause() {
            super.onPause();
            //Log.i(TAG, "onPause");
            //Toast.makeText(this, "La aplicacion esta en pausa", Toast.LENGTH_SHORT).show();
            Context context = getApplicationContext();
            CharSequence text = "la apluicacion se ha pausado";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT,0,100);
            toast.show();
        }

        @Override
    protected void onStop() {
            super.onStop();
            Log.i(TAG, "onStop");

            //Toast.makeText(this, "La aplicacion se ha detenido", Toast.LENGTH_SHORT).show();

            Context context = getApplicationContext();
            CharSequence text = "la aplicacion se ha detenido";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT,0,100);
            toast.show();

        }

        @Override
    protected void onDestroy() {
            super.onDestroy();
            //Log.i(TAG, "onDestroy");
            //Toast.makeText(this, "La aplicacion ha finalizado", Toast.LENGTH_SHORT).show();
            Context context = getApplicationContext();
            CharSequence text = "la apluicacion se ha destruido";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT,0,100);
            toast.show();
        }



    }
