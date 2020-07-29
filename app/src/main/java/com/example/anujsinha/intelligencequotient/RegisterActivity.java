package com.example.anujsinha.intelligencequotient;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText etname,etuserid,etpass,etage,etgender;
    Button btnreg;
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etname=(EditText)findViewById(R.id.etname);
        etuserid=(EditText)findViewById(R.id.etuserid);
        etpass=(EditText)findViewById(R.id.etpass);
        etage=(EditText)findViewById(R.id.etage);
        btnreg=(Button)findViewById(R.id.btnreg);
        radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etname.getText().toString();
                String userid=etuserid.getText().toString();
                String pass=etpass.getText().toString();
                String age=etage.getText().toString();
                if(TextUtils.isEmpty(name))
                {
                    etname.setError("please enter name");
                    return;
                }
                if(TextUtils.isEmpty(userid))
                {
                    etuserid.setError("please enter userid");
                    return;
                }
                if(TextUtils.isEmpty(pass))
                {
                    etpass.setError("please enter password");
                    return;
                }
                if(TextUtils.isEmpty(age))
                {
                    etage.setError("please enter age");
                    return;
                }
                int a=Integer.parseInt(age);
                int selectedId = radioSexGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioSexButton = (RadioButton) findViewById(selectedId);
                if(a<16 || a>90)
                {
                    etage.setError("enter a valid age between 17-89");
                }
                else {
                    SharedPreferences sharedPreferences = getSharedPreferences("register", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("name", etname.getText().toString().trim());
                    editor.putString("userid", etuserid.getText().toString().trim());
                    editor.putString("password", etpass.getText().toString().trim());
                    editor.putString("age", etage.getText().toString().trim());
                    editor.putString("gender", (String) radioSexButton.getText());


                    editor.commit();
                    Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                    Intent intn = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intn);
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
