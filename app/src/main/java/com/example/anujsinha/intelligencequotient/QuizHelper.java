package com.example.anujsinha.intelligencequotient;
/**
 * Created by AnujSinha on 28-Apr-17.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class QuizHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "mathsone";
    // tasks table name
    private static final String TABLE_QUEST = "quest";
    // tasks Table Columns names
    private static final String KEY_ID = "qid";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; // correct option
    private static final String KEY_OPTA = "opta"; // option a
    private static final String KEY_OPTB = "optb"; // option b
    private static final String KEY_OPTC = "optc"; // option c
    private static final String KEY_OPTD = "optd";

    //table2
    private static final String TABLE_QUEST1 = "quest1";
    // tasks Table Columns names
    private static final String KEY_ID1 = "qid1";
    private static final String KEY_QUES1 = "question1";
    private static final String KEY_ANSWER1 = "answer1"; // correct option
    private static final String KEY_OPTA1 = "opta1"; // option a
    private static final String KEY_OPTB1 = "optb1"; // option b
    private static final String KEY_OPTC1 = "optc1"; // option c
    private static final String KEY_OPTD1 = "optd1";
    private SQLiteDatabase dbase;
    int exm = 0;
    /*
    int language2;
    public void move(int language1)
    {
        language2=language1;
    }
    */
    public QuizHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override

    public void onCreate(SQLiteDatabase db)
    {

        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT, " + KEY_OPTD + " TEXT)";
        db.execSQL(sql);


        String sql1 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST1 + " ( "
                + KEY_ID1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES1
                + " TEXT, " + KEY_ANSWER1 + " TEXT, " + KEY_OPTA1 + " TEXT, "
                + KEY_OPTB1 + " TEXT, " + KEY_OPTC1 + " TEXT, " + KEY_OPTD1 + " TEXT)";
        db.execSQL(sql1);
        if (exm== 0) {
            addQuestion();
        } else {
            addQuestion1();
        }
        // db.close();
    }

    private void addQuestion() {
        Question q1 = new Question("Que: Which is the element ?", "7", "1", "8", "6", "7");
        this.addQuestion(q1);
        Question q2 = new Question("Que: Position of the location ?", "18", "2", "19", "20", "20");
        this.addQuestion(q2);
        Question q3 = new Question("Que: 7,29,57,91,131,?", "187", "177", "175", "139", "177");
        this.addQuestion(q3);
        Question q4 = new Question("Que: 2,12,36,74,126,?", "180", "164", "192", "172", "192");
        this.addQuestion(q4);
        Question q5 = new Question("Que: 512:888::729:?", "333", "888", "999", "666", "999");
        this.addQuestion(q5);
        Question q6 = new Question("Que: 16:64::64:?", "502", "256", "516", "524", "256");
        this.addQuestion(q6);
        Question q7 = new Question("Que: What is the angle between the hands of a clock at 4.20 pm?", "20", "15", "10", "18", "10");
        this.addQuestion(q7);
        Question q8 = new Question("Que: How many times do the two hands of a clock be perpendicular to each other in 48hr ?", "44", "22", "88", "48", "88");
        this.addQuestion(q8);
        Question q9 = new Question("Que: The number of odd days in leap year are?", "0", "1", "2", "3", "2");
        this.addQuestion(q9);
        Question q10 = new Question("Que: How many odd days are there in 349 days ?", "5", "6", "4", "3", "6");
        this.addQuestion(q10);


        Question q12 = new Question("Que: What is the code for this ?", "18", "2", "19", "20", "20");
        this.addQuestion(q12);
        Question q13 = new Question("Que: No this not the code ?", "6", "3", "7", "8", "7");
        this.addQuestion(q13);
        Question q14 = new Question("Que: 7,10,15,22,31,?", "6", "9", "7", "3", "7");
        this.addQuestion(q14);
        Question q15 = new Question("Que: 193,144,108,83,67,?", "59", "55", "69", "58", "58");
        this.addQuestion(q15);
        Question q16 = new Question("Que: 12:144::32:?", "1124", "384", "1044", "448", "384");
        this.addQuestion(q16);
        Question q11 = new Question("Que: 27:51::83:?", "102", "117", "123", "138", "123");
        this.addQuestion(q11);
        Question q17 = new Question("Que: How many times do the two hands of a clock point in opposite directions between 9am and 9pm on the same day?", "22", "11", "10", "24", "11");
        this.addQuestion(q17);
        Question q18 = new Question("Que: How many times do the two hands of a clock overlap with each other between 5am to 9pm in a day?", "16", "15", "17", "14", "15");
        this.addQuestion(q18);
        Question q19 = new Question("Que: Which among the following is a non leap year?", "3200", "2800", "2500", "4400", "2500");
        this.addQuestion(q19);
        Question q20 = new Question("Que: What will be the next leap year after 1796?", "1800", "1801", "1804", "1808", "1804");
        this.addQuestion(q20);


        Question q21 = new Question("Que: Calculating the value of ?", "18", "2", "19", "20", "20");
        this.addQuestion(q21);
        Question q22 = new Question("Que: Finding the approximate of this ?", "6", "3", "7", "8", "7");
        this.addQuestion(q22);
        Question q23 = new Question("Que: 2,12,36,80,150,?", "252", "219", "271", "262", "252");
        this.addQuestion(q23);
        Question q24 = new Question("Que: 1,27,125,343,?", "1331", "1000", "729", "512", "729");
        this.addQuestion(q24);
        Question q25 = new Question("Que: 24:576::14:?", "186", "264", "2744", "196", "196");
        this.addQuestion(q25);
        Question q26 = new Question("Que: 25:36::49:?", "61", "63", "65", "60", "60");
        this.addQuestion(q26);
        Question q27 = new Question("Que: What is the angle covered by the minute hand in 34 minutes?", "132", "194", "204", "214", "204");
        this.addQuestion(q27);
        Question q28 = new Question("Que: By how many degrees does an hour hand move in three quarter of an hour?", "7.5", "22.5", "21.5", "15", "22.5");
        this.addQuestion(q28);
        Question q29 = new Question("Que: The calendar for the year 2005 is the same as that for which of the following years ?", "2010", "2012", "2011", "2009", "2011");
        this.addQuestion(q29);
        Question q30 = new Question("Que: Which of the following years has the same calendar as that of 1991 ?", "2002", "1996", "2000", "2001", "2002");
        this.addQuestion(q30);

        // END
    }

    private void addQuestion1() {
        Question1 q1 = new Question1(" टेनिस में विश्व के दूसरी वरीयता प्राप्त सर्बिया ?", "7", "1", "8", "6", "7");
        this.addQuestion1(q1);
        Question1 q2 = new Question1("जोकोविक के लिए आने वाले मैच बेहद खास हो गए हैं ?", "18", "2", "19", "20", "20");
        this.addQuestion1(q2);
        Question1 q3 = new Question1("1,7,21,43,73,?", "110", "121", "111", "131", "111");
        this.addQuestion1(q3);
        Question1 q4 = new Question1("1,4,27,16,125,36,?", "512", "49", "216", "343", "343");
        this.addQuestion1(q4);
        Question1 q5 = new Question1("17:85::22:?", "80", "110", "100", "120", "110");
        this.addQuestion1(q5);
        Question1 q6 = new Question1("35:125::45:?", "625", "526", "636", "283", "625");
        this.addQuestion1(q6);
        Question1 q7 = new Question1("By how many degrees does an hour hand move in the same time,in which hour hand moves 9?", "84", "126", "108", "90", "108");
        this.addQuestion1(q7);
        Question1 q8 = new Question1("What is the angle between the hands of the clock,when it shows 50 minutes past 5 O' clock?", "125", "95", "130", "120", "125");
        this.addQuestion1(q8);
        Question1 q9 = new Question1("1+5 = ?", "6", "2", "7", "5", "6");
        this.addQuestion1(q9);
        Question1 q10 = new Question1("7-5 = ?", "3", "4", "2", "6", "2");
        this.addQuestion1(q10);


        Question1 q11 = new Question1("इटैलियन ओपन के खिताबी मुकाबले में उलटफेर ?", "18", "2", "19", "20", "20");
        this.addQuestion1(q11);
        Question1 q12 = new Question1("वह साल के दूसरे ग्रैंड स्लैम टूर्नामेंट फ्रेंच ओपन ?", "6", "3", "7", "8", "7");
        this.addQuestion1(q12);
        Question1 q13 = new Question1("24,12,26,13,30,15,?", "36", "32", "20", "17", "36");
        this.addQuestion1(q13);
        Question1 q14 = new Question1("2,4,11,37,153,?", "661", "771", "512", "669", "771");
        this.addQuestion1(q14);
        Question1 q15 = new Question1("28:126::9:?", "49", "39", "28", "43", "28");
        this.addQuestion1(q15);
        Question1 q16 = new Question1("14:26::34:?", "36", "46", "72", "68", "46");
        this.addQuestion1(q16);
        Question1 q17 = new Question1("When the clock shows 10 minutes past 9 O'clock,What is the angle between two  ", "8", "1", "7", "9", "9");
        this.addQuestion1(q17);
        Question1 q18 = new Question1("Question 19", "6", "2", "7", "5", "6");
        this.addQuestion1(q18);
        Question1 q19 = new Question1("Question 20", "3", "4", "2", "6", "2");
        this.addQuestion1(q19);
        Question1 q20 = new Question1("Question 11", "7", "1", "8", "6", "7");
        this.addQuestion1(q20);


        Question1 q21 = new Question1("मार्सल ग्रैनोलर्स के खिलाफ मैच से करेंगे, जबकि विश्व के सर्वोच्च ?", "18", "2", "19", "20", "20");
        this.addQuestion1(q21);
        Question1 q22 = new Question1("ब्रिटेन के एंडी मरे टूर्नामेंट के पहले दौर में रूस ?", "6", "3", "7", "8", "7");
        this.addQuestion1(q22);
        Question1 q23 = new Question1("2,4,5,13,23,?", "97", "52", "67", "69", "67");
        this.addQuestion1(q23);
        Question1 q24 = new Question1("4,14,44,134,?", "246", "397", "404", "412", "404");
        this.addQuestion1(q24);
        Question1 q25 = new Question1("57:74::36:?", "52", "63", "54", "45", "45");
        this.addQuestion1(q25);
        Question1 q26 = new Question1("62:64::84:?", "102", "144", "124", "98", "144");
        this.addQuestion1(q26);
        Question1 q27 = new Question1("Question 28", "8", "1", "7", "9", "9");
        this.addQuestion1(q27);
        Question1 q28 = new Question1("Question 29", "6", "2", "7", "5", "6");
        this.addQuestion1(q28);
        Question1 q29 = new Question1("Question 30", "3", "4", "2", "6", "2");
        this.addQuestion1(q29);
        Question1 q30 = new Question1("Question 21", "7", "1", "8", "6", "7");
        this.addQuestion1(q30);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        if (exm== 0) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        } else {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST1);
        }
        // Create tables again
        onCreate(db);
    }

    // Adding new question
    public void addQuestion(Question quest) {
        // SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        values.put(KEY_OPTD, quest.getOPTD());
        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }

    public void addQuestion1(Question1 quest1) {
        // SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values1 = new ContentValues();
        values1.put(KEY_QUES1, quest1.getQUESTION1());
        values1.put(KEY_ANSWER1, quest1.getANSWER1());
        values1.put(KEY_OPTA1, quest1.getOPTA1());
        values1.put(KEY_OPTB1, quest1.getOPTB1());
        values1.put(KEY_OPTC1, quest1.getOPTC1());
        values1.put(KEY_OPTD1, quest1.getOPTD1());
        // Inserting Row
        dbase.insert(TABLE_QUEST1, null, values1);
    }

    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quest.setOPTD(cursor.getString(6));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }

    public List<Question1> getAllQuestions1() {
        List<Question1> quesList1 = new ArrayList<Question1>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST1;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question1 quest1 = new Question1();
                quest1.setID1(cursor.getInt(0));
                quest1.setQUESTION1(cursor.getString(1));
                quest1.setANSWER1(cursor.getString(2));
                quest1.setOPTA1(cursor.getString(3));
                quest1.setOPTB1(cursor.getString(4));
                quest1.setOPTC1(cursor.getString(5));
                quest1.setOPTD1(cursor.getString(6));
                quesList1.add(quest1);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList1;
    }

}
