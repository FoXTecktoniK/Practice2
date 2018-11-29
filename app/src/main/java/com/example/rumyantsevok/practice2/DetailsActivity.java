package com.example.rumyantsevok.practice2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initViews();
        setClickListener();
    }

    private void setClickListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = InfoActivity.newIntent(DetailsActivity.this);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        btn = findViewById(R.id.detailsBtn);
    }


}
