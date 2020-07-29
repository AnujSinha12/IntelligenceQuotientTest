package com.example.anujsinha.intelligencequotient;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button btnan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btnan=(Button)findViewById(R.id.btnan);
       /* btnan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView ivlogo=(ImageView)findViewById(R.id.ivlogo);
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                ivlogo.startAnimation(animation);
            }
        });



    */
        CountDownTimer countdowntimer=new CountDownTimer(3*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent intn=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intn);
            }
        }.start();
    }
    @Override
    public void onBackPressed()
    {
        System.exit(0);
    }
}