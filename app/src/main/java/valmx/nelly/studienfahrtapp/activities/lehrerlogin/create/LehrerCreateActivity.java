package valmx.nelly.studienfahrtapp.activities.lehrerlogin.create;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import valmx.nelly.studienfahrtapp.R;
import valmx.nelly.studienfahrtapp.activities.lehrerlogin.LehrerHomeActivity;

public class LehrerCreateActivity extends AppCompatActivity {

    public EditText etWas;
    public EditText etWo;
    public EditText etSonstiges;
    public EditText etWer;
    private Button bFertig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lehrer_create);
        etWas = findViewById(R.id.editTextWas);
        etWo = findViewById(R.id.editTextWo);
        etSonstiges = findViewById(R.id.editTextSonstiges);
        etWer = findViewById(R.id.editTextWer);
        bFertig = findViewById(R.id.buttonFertig);
        //EditTexts durch richtige Texts ersetzen!!!
        bFertig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LehrerCreateActivity.this, LehrerHomeActivity.class);
                startActivity(intent);
            }
        });

    }
}