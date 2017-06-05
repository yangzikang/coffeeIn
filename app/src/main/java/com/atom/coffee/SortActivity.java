package com.atom.coffee;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

import com.atom.coffee.zipImage.ZipImage;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SortActivity extends Activity {

    @BindView(R.id.imageSort)ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sort);
        ButterKnife.bind(this);
        Bitmap bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.sort, 600, 1000);
        iv.setImageBitmap(bitmap);
    }


}
