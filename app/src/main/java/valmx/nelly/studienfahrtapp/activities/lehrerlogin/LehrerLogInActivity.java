package valmx.nelly.studienfahrtapp.activities.lehrerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import valmx.nelly.studienfahrtapp.R;

public class LehrerLogInActivity extends AppCompatActivity {

    EditText ePasswort;
    Button loginButton;

    String sPasswort = "1111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lehrer_log_in_activitie);
        ePasswort = findViewById(R.id.etPasswort);
        loginButton = findViewById(R.id.buttonOK);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inPasswort = ePasswort.getText().toString();
                if (inPasswort.isEmpty()) {
                    Toast.makeText(LehrerLogInActivity.this, "Trage bitte etwas ein!", Toast.LENGTH_SHORT).show();
                } else {

                    if (!validate(sPasswort)) {
                        Toast.makeText(LehrerLogInActivity.this, "Falsches Passwort!", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(LehrerLogInActivity.this, "Richtiges Passwort!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LehrerLogInActivity.this, LehrerHomeActivity.class);
                        startActivity(intent);
                    }

                }
            }
        });
    }

    private boolean validate(String sPasswort) {
        return sPasswort.equals(ePasswort.getText().toString());
    }
}