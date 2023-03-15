package egydio.camila.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    // criação automatica
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        // mostra o que foi escrito na pagina anterior (Main - Next)
        Intent i = getIntent(); // chama a função criada no main
        String textoDigitado = i.getStringExtra("texto"); //elemento associado a texto no intent
        TextView tvText = findViewById(R.id.tvText);
        tvText.setText(textoDigitado); // set - mostra na tela
    }
}