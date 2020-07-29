package com.example.anujsinha.intelligencequotient;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etuserid,etpass;
    Button btnlog;
    TextView tvreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etuserid=(EditText)findViewById(R.id.etuserid);
        etpass=(EditText)findViewById(R.id.etpass);
        btnlog=(Button)findViewById(R.id.btnlog);
        tvreg=(TextView)findViewById(R.id.tvreg);
        tvreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intn=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intn);

            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("register",MODE_PRIVATE);
                String name=sharedPreferences.getString("name","n/a");
                String userid=sharedPreferences.getString("userid","n/a");
                String password=sharedPreferences.getString("password","n/a");
                String age=sharedPreferences.getString("age","n/a");
                String gender=sharedPreferences.getString("gender","n/a");
                String useri=etuserid.getText().toString();
                String passw=etpass.getText().toString();
                if (useri.equals(userid))
                {
                    if(passw.equals(password))
                    {
                        Intent intn=new Intent(LoginActivity.this,ProfileActivity.class);
                        startActivity(intn);
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this, "Incorrect LogIn", Toast.LENGTH_SHORT).show();
                    }

                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Incorrect LogIn", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public void onBackPressed()
    {
        System.exit(0);
    }
}
