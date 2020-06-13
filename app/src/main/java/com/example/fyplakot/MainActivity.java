package com.example.fyplakot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        Button button = findViewById(R.id.getstarted);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomepage();
            }
        });
    }

    public void openHomepage() {
        Intent intent = new Intent(this, HomepageActivity.class);
        startActivity(intent);
    }
}