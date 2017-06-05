package com.atom.coffee;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebStorage;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CoffeeBean extends Activity {



    @OnClick(R.id.sort)
    public void showSort(){
        Intent intent = new Intent(CoffeeBean.this,SortActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.ingredient)
    public void showIngredient(){
        Intent intent = new Intent(CoffeeBean.this, IngredientActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.origin)
    public void showOrigin(){
        Intent intent = new Intent(CoffeeBean.this,OriginActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_coffee_bean);
        ButterKnife.bind(this);

    }
}
