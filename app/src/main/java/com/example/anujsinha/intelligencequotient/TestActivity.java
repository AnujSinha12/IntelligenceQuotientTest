package com.example.anujsinha.intelligencequotient;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;


public class TestActivity extends AppCompatActivity
{
    TextView textView;
    List<Question> quesList;
    List<Question1>quesList1;
    Question currentQ;
    Question1 currentQ1;
    int language;
    int age1;
    int exm=0;
    int tot=0;
    int qid;
    Button button,button2,button3,button4;
    int k=0,l=0,m=0,n=0,o=0,score=0,wrong=0;
    long min;
    long sec;
    TextView tvminute,tvsecond,tvlanguage,tvqid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Bundle intn=getIntent().getExtras();
        language= intn.getInt("language");
        qid= intn.getInt("qid");
        age1=intn.getInt("age1");
        //public void move();
        QuizHelper db = new QuizHelper(this);

        if(exm==0) {
            // my question bank class
            quesList = db.getAllQuestions();  // this will fetch all quetonall questions
            currentQ = quesList.get(qid);
        }
        else
        {
            quesList1 = db.getAllQuestions1();  // this will fetch all quetonall questions
            currentQ1 = quesList1.get(qid);
        }
        textView=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        tvminute=(TextView)findViewById(R.id.tvminute);
        tvsecond=(TextView)findViewById(R.id.tvsecond);
        CountDownTimer countDownTimer= new CountDownTimer(600 * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                min=(millisUntilFinished/(60000));
                sec=(millisUntilFinished%(60000));
                tvminute.setText(""+min);
                tvsecond.setText(""+sec/1000);
            }

            @Override
            public void onFinish() {
                Intent intn=new Intent(TestActivity.this,ResultActivity.class);
                startActivity(intn);
            }
        }.start();
        // button click listeners

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // passing the button text to other method
                // to check whether the anser is correct or not
                // same for all three buttons
                if(exm==0) {
                    getAnswer(button.getText().toString());
                }
                else
                {
                    getAnswer1(button.getText().toString());
                }
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exm==0) {
                    getAnswer(button2.getText().toString());
                }
                else
                {
                    getAnswer1(button2.getText().toString());
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exm==0) {
                    getAnswer(button3.getText().toString());
                }
                else
                {
                    getAnswer1(button3.getText().toString());
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(exm==0) {
                    getAnswer(button4.getText().toString());
                }
                else
                {
                    getAnswer1(button4.getText().toString());
                }
            }
        });



    }



    public void getAnswer(String AnswerString) {
        if (currentQ.getANSWER().equals(AnswerString)) {

            // if conditions matches increase the int (score) by 1
            // and set the text of the score view
            score++;
            tot++;
            if (age1 < 40) {

                if (qid > 0 && qid <= 2) {
                    k++;
                } else if (qid > 2 && qid <= 4) {
                    l++;
                } else if (qid > 4 && qid <= 6) {

                    m++;
                } else if (qid > 6 && qid <= 8) {
                    n++;
                } else {
                    o++;
                }

            }
            else if (age1>=40 && age1<50 ) {

                if (qid > 10 && qid <= 12) {
                    k++;
                } else if (qid > 12 && qid <= 14) {
                    l++;
                } else if (qid > 14 && qid <= 16) {

                    m++;
                } else if (qid > 16 && qid <= 18) {
                    n++;
                } else {
                    o++;
                }

            }
            else
            {
                if (qid > 20 && qid <= 22) {
                    k++;
                } else if (qid > 22 && qid <= 24) {
                    l++;
                } else if (qid > 24 && qid <= 26) {

                    m++;
                } else if (qid > 26 && qid <= 28) {
                    n++;
                } else {
                    o++;
                }
            }

        } else {
            wrong++;
            tot++;


        }
        if (tot!=10) {

            // if questions are not over then do this
            currentQ = quesList.get(qid);
            setQuestionView();
        } else {

            // if over do this
            Intent intent = new Intent(TestActivity.this,
                    ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", score);
            b.putInt("k", k);
            b.putInt("l", l);
            b.putInt("m", m);
            b.putInt("n", n);
            b.putInt("o", o);
            b.putInt("wrong", wrong);
            // Your score
            intent.putExtras(b); // Put your score to your next
            startActivity(intent);
            finish();
        }
    }
    public void getAnswer1(String AnswerString) {
        if (currentQ1.getANSWER1().equals(AnswerString)) {

            // if conditions matches increase the int (score) by 1
            // and set the text of the score view

            score++;
            if (age1 < 40) {

                if (qid > 0 && qid <= 2) {
                    k++;
                } else if (qid > 2 && qid <= 4) {
                    l++;
                } else if (qid > 4 && qid <= 6) {

                    m++;
                } else if (qid > 6 && qid <= 8) {
                    n++;
                } else {
                    o++;
                }

            }
            else if (age1>=40 && age1<50 ) {

                if (qid > 10 && qid <= 12) {
                    k++;
                } else if (qid > 12 && qid <= 14) {
                    l++;
                } else if (qid > 14 && qid <= 16) {

                    m++;
                } else if (qid > 16 && qid <= 18) {
                    n++;
                } else {
                    o++;
                }

            }
            else
            {
                if (qid > 20 && qid <= 22) {
                    k++;
                } else if (qid > 22 && qid <= 24) {
                    l++;
                } else if (qid > 24 && qid <= 26) {

                    m++;
                } else if (qid > 26 && qid <= 28) {
                    n++;
                } else {
                    o++;
                }
            }

        }
        else {
            wrong++;
            tot++;

        }
        if (qid < 10) {

            // if questions are not over then do this
            currentQ1 = quesList1.get(qid);
            setQuestionView1();
        } else {

            // if over do this
            Intent intent = new Intent(TestActivity.this,
                    ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", score);
            b.putInt("k", k);
            b.putInt("l", l);
            b.putInt("m", m);
            b.putInt("n", n);
            b.putInt("o", o);
            b.putInt("wrong", wrong);
            // Your score
            intent.putExtras(b); // Put your score to your next
            startActivity(intent);
            finish();
        }
    }
    private void setQuestionView() {

        // the method which will put all things together
        textView.setText(currentQ.getQUESTION());
        button.setText(currentQ.getOPTA());
        button2.setText(currentQ.getOPTB());
        button3.setText(currentQ.getOPTC());
        button4.setText(currentQ.getOPTD());
        qid++;
    }
    private void setQuestionView1() {

        // the method which will put all things together
        textView.setText(currentQ1.getQUESTION1());
        button.setText(currentQ1.getOPTA1());
        button2.setText(currentQ1.getOPTB1());
        button3.setText(currentQ1.getOPTC1());
        button4.setText(currentQ1.getOPTD1());
        qid++;
    }
    @Override
    public void onBackPressed()
    {
        System.exit(0);
    }


}