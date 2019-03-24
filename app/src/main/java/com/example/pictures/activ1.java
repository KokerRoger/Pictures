package com.example.pictures;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class activ1 extends AppCompatActivity {
    ImageView imageView;
    Bitmap bitmap;
    Button button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activ1);
        imageView = findViewById(R.id.image2);
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.image2);
        imageView.setImageBitmap(bitmap);

        button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activ1.this, activ3.class);
                startActivity(intent);
            }
        });
        button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activ1.this, activ2.class);
                startActivity(intent);
            }
        });

    }

}
