package com.atom.coffee.fragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.atom.coffee.R;
import com.atom.coffee.zipImage.ZipImage;

/**
 * Created by yangzikang on 2017/6/4.
 */

public class Hu4Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_hu4, container, false);

        ImageView iv =(ImageView)rootView.findViewById(R.id.hu4);
        Bitmap bitmap = ZipImage.decodeSampledBitmapFromResource(getResources(), R.drawable.hu4, 600, 1000);
        iv.setImageBitmap(bitmap);


        return rootView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
    }
}

