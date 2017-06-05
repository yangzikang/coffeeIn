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

public class IngredientActivity extends Activity {

    @BindView(R.id.ing)ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_ingredient);

        ButterKnife.bind(this);
        Bitmap bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.ing, 600, 1000);
        iv.setImageBitmap(bitmap);
    }
}
