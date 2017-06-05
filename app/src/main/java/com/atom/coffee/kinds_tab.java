package com.atom.coffee;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class kinds_tab extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_kinds_tab);
        ImageView imageView = (ImageView)findViewById(R.id.imageView3);
        Glide.with(this).load(R.drawable.main_back).into(imageView);

        ImageButton k_esp=(ImageButton)findViewById(R.id.kinds_esp);
        ImageButton k_cap=(ImageButton)findViewById(R.id.kinds_cap);
        ImageButton k_car=(ImageButton)findViewById(R.id.kinds_car);
        ImageButton k_ame=(ImageButton)findViewById(R.id.kinds_ame);
        ImageButton k_latte=(ImageButton)findViewById(R.id.kinds_latte);
        ImageButton k_mocha=(ImageButton)findViewById(R.id.kinds_mocha);

        ImageButton.OnClickListener k_check = new View.OnClickListener() {
            Bundle kinds = new Bundle();
            @Override
            public void onClick(View v) {
                Intent int_k_car;
                switch (v.getId()){
                    case R.id.kinds_esp:
                        int_k_car = new Intent(kinds_tab.this,kinds_car.class);
                        int_k_car.putExtra("which","2");
                        kinds_tab.this.startActivity(int_k_car);
                        return;
                    case R.id.kinds_cap:
                        int_k_car = new Intent(kinds_tab.this,kinds_car.class);
                        int_k_car.putExtra("which","4");
                        kinds_tab.this.startActivity(int_k_car);
                        return;
                    case R.id.kinds_ame:
                        int_k_car = new Intent(kinds_tab.this,kinds_car.class);
                        int_k_car.putExtra("which","3");
                        kinds_tab.this.startActivity(int_k_car);
                        return;
                    case R.id.kinds_car:
                        int_k_car = new Intent(kinds_tab.this,kinds_car.class);
                        int_k_car.putExtra("which","6");
                        kinds_tab.this.startActivity(int_k_car);

                        return;
                    case R.id.kinds_latte:
                        int_k_car = new Intent(kinds_tab.this,kinds_car.class);
                        int_k_car.putExtra("which","1");
                        kinds_tab.this.startActivity(int_k_car);
                        return;
                    case R.id.kinds_mocha:
                        int_k_car = new Intent(kinds_tab.this,kinds_car.class);
                        int_k_car.putExtra("which","5");
                        kinds_tab.this.startActivity(int_k_car);
                        return;
                }
            }
        };
        k_ame.setOnClickListener(k_check);
        k_cap.setOnClickListener(k_check);
        k_car.setOnClickListener(k_check);
        k_esp.setOnClickListener(k_check);
        k_latte.setOnClickListener(k_check);
        k_mocha.setOnClickListener(k_check);

    }
}
