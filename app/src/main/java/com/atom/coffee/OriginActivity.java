package com.atom.coffee;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

import com.atom.coffee.zipImage.ZipImage;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OriginActivity extends Activity {

    @BindView(R.id.origin)ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_origin);
        ButterKnife.bind(this);
        Bitmap bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.origin, 600, 1000);
        iv.setImageBitmap(bitmap);



    }
}
