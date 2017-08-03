package android.aluno.aula04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView texto1;
    private TextView texto2;
    private boolean ehpeso;
    private static final int peso = 22;
    private static final int resultadook=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clique1(View v){
        texto1 = (TextView) findViewById(R.id.peso);
        ehpeso = true;
        Intent intent =  new Intent(this, Main2Activity.class);
        Bundle bundle = new Bundle();

        bundle.putString("peso",texto1.getText().toString());
        bundle.putBoolean("booleano",ehpeso);

        intent.putExtras(bundle);

        startActivityForResult(intent,peso);
    }


    public void clique2(View v){
        texto2 = (TextView) findViewById(R.id.altura);
        ehpeso = false;
        Intent intent =  new Intent(this, Main2Activity.class);
        Bundle bundle = new Bundle();

        bundle.putString("altura",texto2.getText().toString());
        bundle.putBoolean("booleano",ehpeso);

        intent.putExtras(bundle);

        startActivityForResult(intent,peso);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Bundle bundle = data.getExtras();
        if (requestCode == peso){
            if(resultCode == resultadook){
                if (ehpeso) {
                    texto1.setText(bundle.getString("input"));
                }
                else{
                    texto2.setText(bundle.getString("input"));
                }
            }

        }
    }
}
