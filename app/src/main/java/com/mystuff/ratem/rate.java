package com.mystuff.ratem;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class rate extends ActionBarActivity {
Intent int1;
    SeekBar val1,val2,val3,val4,val5,val6;
    TextView v1,v2,v3,v4,v5,v6;
    String s="";
//    int pr[]=new int[6];
    //Button b=(Button) findViewById(R.id.rate);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(android.R.style.Theme_Dialog);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        val1 = (SeekBar) findViewById(R.id.n);
        val2 = (SeekBar) findViewById(R.id.s);
        val3 = (SeekBar) findViewById(R.id.a);
        val4 = (SeekBar) findViewById(R.id.t);
        val5 = (SeekBar) findViewById(R.id.j);
        val6 = (SeekBar) findViewById(R.id.e);

        v1=(TextView) findViewById(R.id.v1);
        v2=(TextView) findViewById(R.id.v2);
        v3=(TextView) findViewById(R.id.v3);
        v4=(TextView) findViewById(R.id.v4);
        v5=(TextView) findViewById(R.id.v5);
        v6=(TextView) findViewById(R.id.v6);


        Button b=(Button) findViewById(R.id.rate);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(), profile2.class);
                int i=0;
      //          s="";
                intent.putExtra("tag","rate");
  //              while(i<6)
    //                s=s+Integer.toString(pr[i]);
                Log.d("length",Integer.toString(s.length()));
                intent.putExtra("values", s);
                Toast.makeText(getApplicationContext(), "Rated!", Toast.LENGTH_LONG).show();


                startActivityForResult(intent,1);
                finish();


            }
        });




        val1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                s=s+Integer.toString(seekBar.getProgress())+" ";
        //        pr[0]=seekBar.getProgress();
                //Log.d("prog",Integer.toString(pr[0]));

            }
        });

        val2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                s=s+Integer.toString(seekBar.getProgress())+" ";
            //    pr[1]=seekBar.getProgress();
                 }
        });

        val3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


                s=s+Integer.toString(seekBar.getProgress())+" ";
    //            pr[2]=seekBar.getProgress();
            }
        });

        val4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


                s=s+Integer.toString(seekBar.getProgress())+" ";
            //    pr[3]=seekBar.getProgress();
            }
        });

        val5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                s=s+Integer.toString(seekBar.getProgress())+" ";
                //pr[4]=seekBar.getProgress();
            }
        });

        val6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


                s=s+Integer.toString(seekBar.getProgress());
            //    pr[5]=seekBar.getProgress();
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rate, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
