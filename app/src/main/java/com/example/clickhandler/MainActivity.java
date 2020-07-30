package com.example.clickhandler;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnClick;

    ClickPass clickPass;
    TextView tvClick;
    ImageView imClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickPass = new ClickPass(this);

        btnClick = findViewById(R.id.btn);
        tvClick = findViewById(R.id.textView);
        imClick = findViewById(R.id.imageView);

        //Pass with a function Click
        btnClick.setOnClickListener(btn);

        //Pass with a InterFace Click
        tvClick.setOnClickListener(clickPass);
        imClick.setOnClickListener(clickPass);

    }

    private Button.OnClickListener btn = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {

            Toast.makeText(MainActivity.this, "Botton Click", Toast.LENGTH_SHORT).show();
        }
    };


}
