package com.example.pictures;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class activ2 extends AppCompatActivity {
    ImageView imageView;
    Bitmap bitmap;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activ2);
        imageView = findViewById(R.id.image3);
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.image3);
        imageView.setImageBitmap(bitmap);
        button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activ2.this, activ3.class);
                startActivity(intent);
            }
        });

    }

}
