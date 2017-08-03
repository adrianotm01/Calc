package android.aluno.aula04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private static final int resultadook = 10;
    private boolean teste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        TextView tx = (TextView) findViewById(R.id.x);
        if (bundle.getBoolean("booleano")) {
            tx.setText("Peso");
            teste= true;
        }
        else {
            tx.setText("Altura");
            teste=false;
        }
    }

    public void alterar(View v){
        EditText testo = (EditText) findViewById(R.id.editText);
        Intent intent = new Intent();
        Bundle bndl = new Bundle();
        bndl.putString("input", testo.getText().toString());
        intent.putExtras(bndl);
        setResult(resultadook,intent);

        finish();
    }

    public void cancelar(View v){
        finish();
    }
}
