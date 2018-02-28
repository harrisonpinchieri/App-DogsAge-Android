package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button   botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //atribui os ids para as variaveis para ter controle sobre os campos
        caixaTexto = findViewById(R.id.caixaTextoId);
        botaoIdade = findViewById(R.id.botaoIdadeId);
        resultadoIdade = findViewById(R.id.resultadoIdadeId);

        //adiciona um evento de click no botão
        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //recuperar o que foi digitado
               String textoDigitado = caixaTexto.getText().toString();

                if(textoDigitado.isEmpty()) {
                    //String vazia (mensagem de erro)

                    resultadoIdade.setText("Nenhum número Digitado!!");

                }else{
                                        //converte para inteiro a string
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;


                    //vai setar o valor.
                    resultadoIdade.setText("A idade do cachorro em anos umanos é: "+ resultadoFinal + "anos");


               }



            }
        });


    }
}
