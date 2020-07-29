package com.example.anujsinha.intelligencequotient;
import android.support.v7.app.AppCompatActivity;
public class Question1 extends AppCompatActivity {
    private int ID1;
    private String QUESTION1;
    private String OPTA1;
    private String OPTB1;
    private String OPTC1;
    private String OPTD1;
    private String ANSWER1;

    public Question1()
    {

        ID1 = 0;
        QUESTION1= "";
        OPTA1 = "";
        OPTB1 = "";
        OPTC1 = "";
        OPTD1="";
        ANSWER1 = "";
    }
    public Question1(String qUESTION1, String oPTA1, String oPTB1, String oPTC1,String oPTD1,
                     String aNSWER1) {
        QUESTION1 = qUESTION1;
        OPTA1 = oPTA1;
        OPTB1 = oPTB1;
        OPTC1 = oPTC1;
        OPTD1 =oPTD1;
        ANSWER1 = aNSWER1;

    }

    public int getID1() {
        return ID1;
    }

    public String getQUESTION1() {
        return QUESTION1;
    }

    public String getOPTA1() {
        return OPTA1;
    }

    public String getOPTB1() {
        return OPTB1;
    }

    public String getOPTC1() {
        return OPTC1;
    }
    public String getOPTD1(){ return OPTD1;}
    public String getANSWER1() {
        return ANSWER1;
    }

    public void setID1(int id) {
        ID1 = id;
    }

    public void setQUESTION1(String qUESTION) {
        QUESTION1 = qUESTION;
    }

    public void setOPTA1(String oPTA) {
        OPTA1 = oPTA;
    }

    public void setOPTB1(String oPTB) {
        OPTB1 = oPTB;
    }

    public void setOPTC1(String oPTC) {
        OPTC1 = oPTC;
    }
    public void setOPTD1(String oPTD) {OPTD1=oPTD;}
    public void setANSWER1(String aNSWER) {
        ANSWER1 = aNSWER;
    }
}