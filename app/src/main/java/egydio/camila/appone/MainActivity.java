package egydio.camila.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    // habilitando botão (onclick) para usar ele
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            // habilitando o texto, transformando em string, intent (pega o texto e manda pra outra pagina)
            public void onClick(View view) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //localiza o texto
                String textoDigitado = etDigiteAqui.getText().toString();

                Intent i = new Intent(MainActivity.this, NextActivity.class); //leva pro NextActivity o texto guardado no intent
                i.putExtra("texto", textoDigitado); //guarda o texto digitado
                startActivity(i);
            }
        });
    }

}