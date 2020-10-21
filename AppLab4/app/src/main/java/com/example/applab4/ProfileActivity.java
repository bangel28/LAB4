package com.example.applab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void SetTeamIcon(View view){

        Intent returnIntent = new Intent();
        ImageView selectedImage = (ImageView) view;

        returnIntent.putExtra("imageID", selectedImage.getId());
        setResult(RESULT_OK, returnIntent);

        finish();
    }

    protected void OnActivityResult(int requestCode, int resultCode, Intent data){

        if (resultCode == RESULT_CANCELED){
            return;
        }

        ImageView avatarImage = (ImageView) findViewById(R.id.imageView);

        String drawableName = "ic_logo_00";
        switch(data.getIntExtra("imageID", R.id.imageView2)){

            case R.id.imageView2:
                drawableName = "ic_logo_00";
                break;

            case R.id.imageView3:
                drawableName = "ic_logo_01";
                break;

            case R.id.imageView4:
                drawableName = "ic_logo_02";
                break;

            case R.id.imageView5:
                drawableName = "ic_logo_03";
                break;

            case R.id.imageView6:
                drawableName = "ic_logo_04";
                break;

            case R.id.imageView7:
                drawableName = "ic_logo_05";
                break;

            default:
                drawableName = "ic_logo_00";
                break;
        }

        int resID = getResources().getIdentifier(drawableName, "drawable", getPackageName());
        avatarImage.setImageResource(resID);


    }

}