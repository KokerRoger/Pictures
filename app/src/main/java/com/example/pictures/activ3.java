package com.example.pictures;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activ3 extends AppCompatActivity {
    ImageView imageView;
    Bitmap bitmap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activ3);

        imageView = findViewById(R.id.image4);
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.image4);
        imageView.setImageBitmap(bitmap);


    }
}
