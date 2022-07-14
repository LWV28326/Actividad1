package fp.dam.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

//--------------- VIDEO -4 ---------------------------------------


public class cronoActivity extends AppCompatActivity {

    private Button botonIniciar;
    private Button botonLapso;
    private boolean iniciado;
    private TextView crono;
    private long lapso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crono);
        botonIniciar = (Button) findViewById(R.id.iniciar);
        botonLapso = (Button) findViewById(R.id.reiniciar);
        crono = findViewById(R.id.textCrono);
    }


    //Metodo para mostrar formateado el tiempo
    private void mostrartiempo(){
        synchronized (this){
            crono.setText(String.valueOf(lapso));
        }

    }

    //Estaria el bucle del hilo
    private void cronometrar(){
        iniciado=true;
        long to, t1;
        lapso=0; //Guardo el tiempo transcurrido
        System.nanoTime(); //Precision de nanosegundos
        to = System.currentTimeMillis();//Precision milisegundos
        while(iniciado){
                t1= System.currentTimeMillis();
                synchronized (this){
                    lapso += t1-to; //Obtengo el tiempo desde que comenzo hasta la primera iteraccion;
                }
                to=t1; // Establezco el punto de partida donde comenzó

                 //crono.setText(String.valueOf(lapso)); //Desde aquí no funciona, tendría que ser desde otro hilo de la cola de eventos
                if(lapso>0){
                    //Ejecutar en el hilo de la cola de eventos
                    runOnUiThread(this::mostrartiempo); // --------->>>>>> NO SE ESTÁ CREANDO UN HILO NUEVO
                }
        }
    }

    //Metodo para iniciar el cronometro -- uso un hilo
    public void iniciarParar(View v){
        if(!iniciado){
            //Creo el hilo y lo ejecuto
            new Thread (this::cronometrar).start();
        }
        else{

        }
    }

    public void lapso(View v){

    }
}