package com.example.atul.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment1 f1 = new Fragment1();
        fragmentTransaction.add(R.id.linearLayout,f1);
        fragmentTransaction.commit();


        Fragment2 f2 = new Fragment2();
        fragmentTransaction.add(R.id.linearLayout2,f2);
        fragmentTransaction.commit();
    }
}
