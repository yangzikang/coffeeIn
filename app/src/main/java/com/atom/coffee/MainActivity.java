package com.atom.coffee;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.BitmapTypeRequest;
import com.bumptech.glide.Glide;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ImageView iv = (ImageView)findViewById(R.id.imageView2);
        Glide.with(this).load(R.drawable.main_back).into(iv);


        ImageButton ib1=(ImageButton)findViewById(R.id.imageButton1);
        ImageButton ib2=(ImageButton)findViewById(R.id.imageButton2);
        ImageButton ib3=(ImageButton)findViewById(R.id.imageButton3);
        ImageButton ib4=(ImageButton)findViewById(R.id.imageButton4);
        ImageButton ib5=(ImageButton)findViewById(R.id.imageButton5);
        ImageButton ib6=(ImageButton)findViewById(R.id.imageButton6);

        ImageButton.OnClickListener check=new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                switch(v.getId()){
                    case R.id.imageButton1:
                        Intent IntentCoffeeBean = new Intent(MainActivity.this,CoffeeBean.class);
                        MainActivity.this.startActivity(IntentCoffeeBean);

                        return;
                    case R.id.imageButton2:
                        Intent IntentKinds = new Intent(MainActivity.this,kinds_tab.class);
                        MainActivity.this.startActivity(IntentKinds);
                        return;
                    case R.id.imageButton3:
                        Intent processing_tab = new Intent(MainActivity.this,ProcessActivity.class);
                        MainActivity.this.startActivity(processing_tab);
                        return;
                    case R.id.imageButton4:
                        Intent appliance_tab = new Intent(MainActivity.this,HuActivity.class);
                        MainActivity.this.startActivity(appliance_tab);
                        return;
                    case R.id.imageButton5:
                        Intent history_act= new Intent(MainActivity.this,HistoryActivity.class);
                        MainActivity.this.startActivity(history_act);
                        return;
                    case R.id.imageButton6:
                        Intent intent=new Intent(Intent.ACTION_SEND);
                        intent.setType("image/*");
                        intent.putExtra(Intent.EXTRA_SUBJECT, "Share");
                        intent.putExtra(Intent.EXTRA_TEXT, "I have successfully share my message through my app");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(Intent.createChooser(intent, getTitle()));
                        return;
                }
            }
        };
        ib1.setOnClickListener(check);
        ib2.setOnClickListener(check);
        ib3.setOnClickListener(check);
        ib4.setOnClickListener(check);
        ib5.setOnClickListener(check);
        ib6.setOnClickListener(check);
    }
}
