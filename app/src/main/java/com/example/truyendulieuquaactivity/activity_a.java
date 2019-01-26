package com.example.truyendulieuquaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_a extends AppCompatActivity {
    EditText ed_title,ed_description;
    Button btn_senddata;

    public static final String Title="Title";
    public static final String Description="Description";
    public static final String Bundle="Description";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ed_title= (EditText) findViewById(R.id.ed_title);
        ed_description= (EditText) findViewById(R.id.ed_description);
        btn_senddata= (Button) findViewById(R.id.btn_senddata);
        btn_senddata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String title=ed_title.getText().toString();
             String descrition=ed_description.getText().toString();
//                byExtra(title,descrition);
                  bybullder(title,descrition);
            }
        });
    }
//truyen du lieu lon
    private void bybullder(String title, String descrition) {
        Intent intent =new Intent(activity_a.this,activity_b.class);
        Bundle bundle =new Bundle();
        bundle.putString(Title,title);
        bundle.putString(Description,descrition);
        intent.putExtra(Bundle,bundle);
        startActivity(intent);
    }
    ///truyen du lieu nho
    private void byExtra(String title, String descrition) {
        Intent intent =new Intent(activity_a.this,activity_b.class);
        intent.putExtra(Title,title);
        intent.putExtra(Description,descrition);
        startActivity(intent);
    }

}
