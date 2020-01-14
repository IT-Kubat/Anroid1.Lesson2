package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.text_view);

        Intent intent = getIntent();

        if (intent != null) {
            text = intent.getStringExtra("key");

            if (text != null) {
                textView.setText(text);
            } else {
                textView.setText("Text error");
            }
        }

        Button b = findViewById(R.id.return_back);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text += ", hello";
                Intent intent1 = new Intent();
                intent1.putExtra("result _key", text);

                setResult(RESULT_OK, intent1);

                finish();
            }
        });
    }
}
