package com.example.llw.demo_gallry4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Gallery gallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gallery = (Gallery) findViewById(R.id.galler);

        gallery.setAdapter(new BaseAdapter() {
            int[] imageg = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.alenafs};
            @Override
            public int getCount() {

                return imageg.length;
            }

            @Override
            public Object getItem(int position) {

                return position;
            }

            @Override
            public long getItemId(int position) {

                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(imageg[position]);
                System.out.println("当前调用的突破位置是："+position);
                return imageView;
            }
        });
    }


}
