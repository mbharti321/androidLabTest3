package com.example.fragment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Package;

public class MainActivity extends AppCompatActivity {

    private FrameLayout fragcont;
    private Button b1,b2,b3,b4;
    public static String PACKAGE_NAME;
    String hilltop = "Hill Top";
    String garden = "Garden";
    String villa = "Villa";
    String grand = "Grand Pavilion";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragcont = (FrameLayout)findViewById(R.id.fragment_container);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button1);
        b3 = (Button)findViewById(R.id.button2);
        b4 = (Button)findViewById(R.id.button3);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hilltopid = "hilltop";
                String details = "9.00 Registration\n " +
                        "9.30 Keynote\n" +
                        "10.00 Introduction\n" +
                        "11.00 Hand on Lab\n" +
                        "12.30 Lunch\n" +
                        "3.00 High Tea Networking\n";
                PACKAGE_NAME = getApplicationContext().getPackageName();
                int resID = getResources().getIdentifier(hilltopid , "drawable",PACKAGE_NAME) ;
                openfragment(resID,hilltop,details);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gardenid = "garden";
                String details = "9.00 Registration\n " +
                        "9.30 Keynote\n" +
                        "10.00 Introduction\n" +
                        "11.00 Hand on Lab\n" +
                        "12.30 Lunch\n" +
                        "3.00 High Tea Networking\n";
                PACKAGE_NAME = getApplicationContext().getPackageName();
                int resID = getResources().getIdentifier(gardenid , "drawable",PACKAGE_NAME) ;
                openfragment(resID,garden,details);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hilltopid = "villa";
                String details = "9.00 Registration\n " +
                        "9.30 Keynote\n" +
                        "10.00 Introduction\n" +
                        "11.00 Hand on Lab\n" +
                        "12.30 Lunch\n" +
                        "3.00 High Tea Networking\n";
                PACKAGE_NAME = getApplicationContext().getPackageName();
                int resID = getResources().getIdentifier(hilltopid , "drawable",PACKAGE_NAME) ;
                openfragment(resID,villa,details);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hilltopid = "grand";
                String details = "9.00 Registration\n " +
                        "9.30 Keynote\n" +
                        "10.00 Introduction\n" +
                        "11.00 Hand on Lab\n" +
                        "12.30 Lunch\n" +
                        "3.00 High Tea Networking\n";
                PACKAGE_NAME = getApplicationContext().getPackageName();
                int resID = getResources().getIdentifier(hilltopid , "drawable",PACKAGE_NAME) ;
                openfragment(resID,grand,details);
            }
        });
    }



    private void openfragment(int resID,String txt,String txt2) {
        ImageFragment fragment = ImageFragment.newInstance(resID,txt,txt2);
        FragmentManager  fragmentmanager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentmanager.beginTransaction();
        transaction.addToBackStack(null);
        transaction.add(R.id.fragment_container,fragment,"Image_Fragment").commit();
    }


}
