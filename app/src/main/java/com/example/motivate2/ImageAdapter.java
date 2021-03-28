package com.example.motivate2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.cs1, R.drawable.cs2, R.drawable.cs3, R.drawable.cs4, R.drawable.fit1, R.drawable.fit2,R.drawable.fit3,R.drawable.fit4,R.drawable.fit4,R.drawable.grit1,R.drawable.grit2,R.drawable.nike1};

    ImageAdapter(Context context) {
        mContext = context;
    }


    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override //ctrl -0 instantiate Item
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView, 0);
        return imageView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }

}
