package com.example.applab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void OnOpenInGoogleMaps(View view){

            EditText teamAddress = (EditText) findViewById(R.id.editTextAddress);

            Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+teamAddress.getText());

            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

            mapIntent.setPackage("com.google.android.apps.maps");

            startActivity(mapIntent);

        }

        public void OnSetAvatarButton(View view){

            Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
            startActivityForResult(intent,0);
        }
    }
