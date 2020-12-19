package com.example.m_rau.skincancerdetector;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ResourcesActivity extends AppCompatActivity {

    private static final String LINK1 = "https://www.mayoclinic.org/diseases-conditions/skin-cancer/symptoms-causes/syc-20377605";
    private static final String LINK2 = "https://www.webmd.com/melanoma-skin-cancer/ss/skin-cancer-and-skin-lesions-overview";

    private static final String LINK3 = "https://www.skincancer.org/";
    private static final String LINK4 = "https://www.cancer.org/cancer/skin-cancer/skin-cancer-image-gallery.html";
    private static final String LINK5 = "https://www.aad.org/skin-cancer-common-types";




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_resources);

    }

//    public void onClickLink(View view){
////        Intent newIntent = new Intent(this, WebPageActivity.class);
////        newIntent.putExtra("INTENT_EXTRA_WEB",LINK1);
////        startActivity(newIntent,
////                LINK1)
//
//        Intent i = new Intent(Intent.ACTION_VIEW);
//        i.setData(Uri.parse(LINK1));
//        startActivity(i);
//    }

    public void onCLickLink(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(LINK1));
        startActivity(i);
    }
    public void onCLickLink2(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(LINK2));
        startActivity(i);
    }
    public void onCLickLink3(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(LINK3));
        startActivity(i);
    }
    public void onCLickLink4(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(LINK4));
        startActivity(i);
    }
    public void onCLickLink5(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(LINK5));
        startActivity(i);
    }


}

