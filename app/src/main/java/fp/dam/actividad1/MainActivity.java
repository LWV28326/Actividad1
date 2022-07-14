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


public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Primero necesito el botón
        ImageButton botonCrono = (ImageButton) findViewById(R.id.botonCrono);
        //Luego necesito el listener, paso como parametro a un objeto que implemete la interfaz ViewOnClick...
        botonCrono.setOnClickListener(this);
    }


    //Lo que tiene que ocurrir al pulsar el botón, que se abra la activity
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),cronoActivity.class); //Recibe como parametro la activity que recibe la accion
        startActivity(intent);
    }
}