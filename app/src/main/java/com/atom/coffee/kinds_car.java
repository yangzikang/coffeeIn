package com.atom.coffee;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

import com.atom.coffee.zipImage.ZipImage;

import butterknife.BindView;
import butterknife.ButterKnife;


public class kinds_car extends Activity {

    @BindView(R.id.kinds_map)ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_kinds_car);

        ButterKnife.bind(this);
        Intent intent = this.getIntent();
        String s = intent.getStringExtra("which");
        Bitmap bitmap = null;
        switch (s){
            case "1":
                bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.coffee1, 600, 1000);
                break;
            case "2":
                bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.coffee2, 600, 1000);
                break;
            case "3":
                bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.coffee3, 600, 1000);
                break;
            case "4":
                bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.coffee4, 600, 1000);
                break;
            case "5":
                bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.coffee5, 600, 1000);
                break;
            case "6":
                bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.coffee6, 600, 1000);
                break;
        }


        iv.setImageBitmap(bitmap);

    }
}
