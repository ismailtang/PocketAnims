package com.library.animationlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.library.pocketanims.PocketAnims;

public class MainActivity extends AppCompatActivity {

    PocketAnims pocketAnims = new PocketAnims();
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textview);


        pocketAnims.fadein(MainActivity.this, 4000, textView);
    }
}