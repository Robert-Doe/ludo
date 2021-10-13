package com.robertory.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRoll=findViewById(R.id.btnRoll);
        final TextView txtCount=findViewById(R.id.txtCount);

        btnRoll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Random rand= new Random();
                        txtCount.setText(String.valueOf(rand.nextInt(6)+1));
                    }
                }
        );
    }

    void diceRoll()
    {

    }

}
