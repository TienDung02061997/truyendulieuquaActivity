package com.example.truyendulieuquaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_b extends AppCompatActivity {
  TextView tv_title,tv_description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_description= (TextView) findViewById(R.id.tv_description);
        setdatabyBundle();
    }
    public void setdatabyExtra()
    {
        Intent intent=getIntent();
        String title=intent.getStringExtra(activity_a.Title);
        String description=intent.getStringExtra(activity_a.Description);
        tv_title.setText(title);
        tv_description.setText(description);
    }
    public void setdatabyBundle()
    {
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra(activity_a.Bundle);
        String title=bundle.getString(activity_a.Title);
        String description=bundle.getString(activity_a.Description);
        tv_title.setText(title);
        tv_description.setText(description);
    }
}
