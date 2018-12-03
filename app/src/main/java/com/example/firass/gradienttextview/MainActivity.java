package com.example.firass.gradienttextview;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.gradienttextviewlibrary.FirassGradientTextView;

public class MainActivity extends AppCompatActivity {
    TextView firassGradientTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firassGradientTextView = findViewById(R.id.gradient);
        firassGradientTextView.setText("fahmi jeeeeld");
        firassGradientTextView = new FirassGradientTextView(this,"#00F260","#0575E6",200,0,firassGradientTextView);



    }
}
