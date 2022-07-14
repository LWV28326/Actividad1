package fp.dam.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


// --------- VIDEO - 3 -----------------

        //EJERCICO CRONOMETRO
            // - Mirar como cambiar colores y ajustar las imagenes
            // - Centrar el texto

            //Lo que hago en el ejercicio es abrir ventanas con los botones
            // creo dos ventanas vacias
            // Paso a mipmap las imágenes y creo una carpeta font en res para añadir el recurso digital que es
                    //una fuente para cambiarlo al reloj del contador

            //Poner el id adecuado a cada boton


// --------- VIDEO - 4-----------------

            // Opciones diferentes para abrir la activity

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener */{


    //ATRIBUTOS
    ImageButton botonCro;
    ImageButton botonConta;
    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OPCION 1 --- podría usar las varibles anteriores declaradas -- atributos

        //Primero necesito el botón
        ImageButton botonCrono = (ImageButton) findViewById(R.id.botonCrono);
        //Luego necesito el listener, paso como parametro a un objeto que implemete la interfaz ViewOnClick...
        botonCrono.setOnClickListener(this);
        //El otro botón -- uso el mismo objeto
        botonCrono = (ImageButton) findViewById(R.id.botonCont);
        botonCrono.setOnClickListener(this);

        //OPCION 2

        //HACERLO SIN LA VARIABLE IMAGENBUTTON
        ((ImageButton) findViewById(R.id.botonCrono)).setOnClickListener(this);
        ((ImageButton) findViewById(R.id.botonCont)).setOnClickListener(this);
    }


    //Lo que tiene que ocurrir al pulsar el botón, que se abra la activity
    //Con un if miro que botón estoy pulsando
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.botonCrono) {
            Intent intent = new Intent(getApplicationContext(), cronoActivity.class); //Recibe como parametro la activity que recibe la accion
            startActivity(intent);
        } else {
            Intent intent = new Intent(getApplicationContext(), contadorActivity.class); //Recibe como parametro la activity que recibe la accion
            startActivity(intent);
        }

        // CON LA OPCION DE LOS ATRIBUTOS
        /*
        if(v == botonCro){
            Intent intent = new Intent(getApplicationContext(),cronoActivity.class); //Recibe como parametro la activity que recibe la accion
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(getApplicationContext(),contadorActivity.class); //Recibe como parametro la activity que recibe la accion
            startActivity(intent);
        }
         */


        //OPCION 3 REFERENCIAS A METODOS

        //Se asigna el metodo en objeto del XML

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            botonCro = (ImageButton) findViewById(R.id.botonCrono);

            botonConta = (ImageButton) findViewById(R.id.botonCont);
        }


        public void responderPulsacionCrono (View v){
            Intent intent = new Intent(getApplicationContext(), cronoActivity.class); //Recibe como parametro la activity que recibe la accion
            startActivity(intent);
        }

        public void responderPulsacionConta (View v){
            Intent intent = new Intent(getApplicationContext(), contadorActivity.class); //Recibe como parametro la activity que recibe la accion
            startActivity(intent);
        }
    }
