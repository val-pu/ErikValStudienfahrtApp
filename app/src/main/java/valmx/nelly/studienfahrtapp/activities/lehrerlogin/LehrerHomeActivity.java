package valmx.nelly.studienfahrtapp.activities.lehrerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import valmx.nelly.studienfahrtapp.R;
import valmx.nelly.studienfahrtapp.activities.lehrerlogin.create.LehrerCreateActivity;

public class LehrerHomeActivity extends AppCompatActivity {
    private Button fButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lehrer_home);

        fButton = findViewById(R.id.button2);
        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LehrerHomeActivity.this, LehrerCreateActivity.class);
                startActivity(intent);
            }
        });

    }






    }








