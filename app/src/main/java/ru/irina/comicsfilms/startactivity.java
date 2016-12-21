package ru.irina.comicsfilms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class startactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startactivity);

        View bigLayout = findViewById(R.id.activity_startactivity);
        bigLayout.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(startactivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
