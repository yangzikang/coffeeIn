package com.atom.coffee;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.atom.coffee.adapter.FragAdapter;
import com.atom.coffee.fragment.Hu1Fragment;
import com.atom.coffee.fragment.Hu2Fragment;
import com.atom.coffee.fragment.Hu3Fragment;
import com.atom.coffee.fragment.Hu4Fragment;
import com.atom.coffee.fragment.SunFragment;
import com.atom.coffee.fragment.WaterFragment;

import java.util.ArrayList;
import java.util.List;

public class HuActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hu);

        //构造适配器
        List<Fragment> fragments=new ArrayList<Fragment>();
        fragments.add(new Hu1Fragment());
        fragments.add(new Hu2Fragment());
        fragments.add(new Hu3Fragment());
        fragments.add(new Hu4Fragment());
        FragAdapter adapter = new FragAdapter(getSupportFragmentManager(), fragments);

        //设定适配器
        ViewPager vp = (ViewPager)findViewById(R.id.viewpager2);
        vp.setAdapter(adapter);
        vp.setCurrentItem(0);
    }
}
