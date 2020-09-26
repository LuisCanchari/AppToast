package edu.cientifica.apptoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int contador = 0;
    TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCount = (TextView)  findViewById(R.id.textView);
    }

    public void mostrarMensaje(View view) {
        Toast toast = Toast.makeText(this, "Bienvenidos a la aplicación", Toast.LENGTH_SHORT);
        toast.show();

    }

    public void incrementarValor(View view) {
        contador++;
        textCount.setText(String.valueOf(contador).toString());
    }
}