package org.bubulescu.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();

        Picasso.with(this)
                .load("https://cdn.brilio.net/news/2016/03/17/49234/205598-1000xauto-10-most-beautiful-roads-in-the-world.jpg")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .resize(500, 0)
                .into(ivImage);
    }

    private void initWidgets() {
        ivImage = findViewById(R.id.ivImage);


    }
}
