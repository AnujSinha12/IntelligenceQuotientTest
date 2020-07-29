package com.example.anujsinha.intelligencequotient;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity
{
    private static String TAG="ResultActivity";

    //int a1=2,a2=0,a3=1,a4=1,a5=0;
    int k,l,m,n,o,iq,wrong,score;
    //private int[]yData={a1,a2,a3,a4,a5};
    PieChart pieChart,pieChart2;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle b = getIntent().getExtras();
        score = b.getInt("score");
        iq=score*20;
        k=b.getInt("k");
        l=b.getInt("l");
        m=b.getInt("m");
        n=b.getInt("n");
        o=b.getInt("o");
        wrong=b.getInt("wrong");

        Log.d(TAG, "onCreate: starting to create chart");
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv2.setText(""+iq);
        pieChart=(PieChart)findViewById(R.id.PieChart);

        // pieChart.setDescription("Sal es by Employee(In Thousand $)");

        pieChart.setRotationEnabled(true);
        pieChart.setHoleRadius(50);
        pieChart.setTransparentCircleAlpha(0);
        pieChart.setCenterText("Your iq is made of");
        pieChart.setCenterTextSize(10);

        //pieChart.setDrawEntryLabels(true);

        addDataSet();
       /* pieChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                Log.d(TAG, "onValueSelected: Value select from chart");
                Log.d(TAG, "onValueSelected: "+e.toString());
                Log.d(TAG, "onValueSelected: "+h.toString());
                int pos1=e.toString().indexOf("(sum):");
                String sales=e.toString().substring(pos1 + 7);
                for (int i = 0; i <yData.length ; i++) {
                    if(yData[i]==Float.parseFloat(sales))
                    {
                        pos1=i;
                        break;
                    }
                }
                String employee=xData[pos1 + 1];
                Toast.makeText(MainActivity.this, "Employee "+employee +"\n" +"Sales:$ "+sales +"K", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });
        */
    }

    private void addDataSet()
    {
        String[]xData={"Odd Man Out","Series","Ratio","Clock","Calendar",};
        int[]yData={k,l,m,n,o};
        Log.d(TAG, "addDataSet started ");
        ArrayList<PieEntry> Entrys=new ArrayList<>();
        //ArrayList<String> xEntrys=new ArrayList<>();
        for (int i = 0; i < yData.length; i++) {
            Entrys.add(new PieEntry(yData[i],xData[i]));
        }

        /*for (int i = 0; i < xData.length; i++) {
            xEntrys.add(xData[i]);
        }
        */

        /*for (int i = 0; i <xData.length ; i++) {
            xEntrys.add(new PieEntry(i, xData[i]));
        }
        */
        //create the data set
        PieDataSet pieDataSet=new PieDataSet(Entrys,"IQ Statistics1");
        pieDataSet.setSliceSpace(12);
        pieDataSet.setValueTextSize(0);

        //add colors to dataset
        ArrayList<Integer> colors=new ArrayList<>();
        colors.add(Color.GRAY);
        colors.add(Color.RED);
        colors.add(Color.GREEN);
        colors.add(Color.CYAN);
        colors.add(Color.YELLOW);
        pieDataSet.setColors(colors);

        //add legend to the chart
        Legend legend=pieChart.getLegend();
        legend.setForm(Legend.LegendForm.CIRCLE);
        legend.setPosition(Legend.LegendPosition.LEFT_OF_CHART);


        //create pie chart object
        PieData pieData=new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.invalidate();
        //new chart---------->



    }
    @Override
    public void onBackPressed()
    {
        System.exit(0);
    }

}
