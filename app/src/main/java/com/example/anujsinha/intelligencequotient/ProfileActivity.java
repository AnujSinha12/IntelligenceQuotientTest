package com.example.anujsinha.intelligencequotient;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity
{
    Button btntest;
    TextView tvname,tvuserid,tvage,tvgender;
    ImageView ivcover,ivprof;
    RadioGroup radioGrouplang;
    int language;
    int age1,qid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btntest=(Button)findViewById(R.id.btntest);
        tvname=(TextView)findViewById(R.id.tvname);
        tvuserid=(TextView)findViewById(R.id.tvuserid);
        tvage=(TextView)findViewById(R.id.tvage);
        tvgender=(TextView)findViewById(R.id.tvgender);
        ivcover=(ImageView)findViewById(R.id.ivcover);
        ivprof=(ImageView)findViewById(R.id.ivprof);
        SharedPreferences sharedPreferences=getSharedPreferences("register",MODE_PRIVATE);
        String name=sharedPreferences.getString("name","n/a");
        String userid=sharedPreferences.getString("userid","n/a");
        //String password=sharedPreferences.getString("password","n/a");
        String age=sharedPreferences.getString("age","n/a");
        String gender=sharedPreferences.getString("gender","n/a");
        ivcover.setImageResource(R.mipmap.cover_iq);
        age1=Integer.parseInt(age);

        if(gender.equals("Male"))
        {
            ivprof.setImageResource(R.mipmap.male);
        }
        else
        {
            ivprof.setImageResource(R.mipmap.female);
        }
        tvname.setText(name);
        tvuserid.setText(userid);
        tvage.setText(age);
        tvgender.setText(gender);

        // find the radiobutton by returned id


        if(age1<30)
        {
            qid=1;
        }
        else if(age1>=30 && age1<50)
        {
            qid=11;
        }
        else
        {
            qid=21;
        }
        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intn=new Intent(ProfileActivity.this,TestActivity.class);
                intn.putExtra("language",language);
                intn.putExtra("age1",age1);
                intn.putExtra("qid",qid);
                startActivity(intn);
            }
        });
        //Toast.makeText(this, "age1="+age1, Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed()
    {
        System.exit(0);
    }

}
