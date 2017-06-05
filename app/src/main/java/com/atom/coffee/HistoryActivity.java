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

public class HistoryActivity extends Activity {

    @BindView(R.id.history2)ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_history);
        ButterKnife.bind(this);
        Bitmap bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.history2, 600, 1000);
        iv.setImageBitmap(bitmap);
    }
}
