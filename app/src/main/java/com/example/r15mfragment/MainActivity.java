package com.example.r15mfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Boolean isFragmentDisplay = false;
    Button buttonFitur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonFitur = findViewById(R.id.fitur_btn);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        com.example.r15mfragment.FragmentStatis staticFragment = new com.example.r15mfragment.FragmentStatis();
        fragmentTransaction.add(R.id.container,staticFragment).commit();

        buttonFitur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isFragmentDisplay){
                    tampilFragment();
                }
                else {
                    gantiFragment();
                }
            }
        });
    }

    private void tampilFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentDinamis fragmentDinamis = FragmentDinamis.newInstance();
        fragmentTransaction.replace(R.id.container, fragmentDinamis).addToBackStack(null).commit();

        isFragmentDisplay = true;
        buttonFitur.setText("Mantab");
    }

    private void gantiFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentDinamis fragmentDinamis = (FragmentDinamis)fragmentManager.findFragmentById(R.id.container);

        if (fragmentDinamis != null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new com.example.r15mfragment.FragmentStatis()).commit();
        }

        buttonFitur.setText("Lihat Kelebihan");
        isFragmentDisplay = false;

    }
}