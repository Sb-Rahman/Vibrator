package com.vibrator.vibratorsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Vibrator vibrator;
    Button vibrateButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibrateButton=findViewById(R.id.vibrateyou);
        vibrateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrator= (Vibrator) getSystemService(VIBRATOR_SERVICE);

                if (Build.VERSION.SDK_INT>=26){
                    vibrator.vibrate(VibrationEffect.createOneShot(300, VibrationEffect.DEFAULT_AMPLITUDE));
                }else{
                    vibrator.vibrate(300);
                }
            }
        });



    }
}