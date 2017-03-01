package com.mystuff.ratem;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.logging.Handler;
import java.util.logging.LogRecord;


public class profile2 extends ActionBarActivity{
String d,rnk,inf;
    ProgressBar nerd;
    ProgressBar slut;
    ProgressBar attr;
    ProgressBar two;
    ProgressBar judg;
    ProgressBar ego;
    int stats1[]=new int[6];
    int stats[]={99,65,10,45,23,99};
    Button rate1;
    TextView tv;
    Intent int1;
    double avg=((stats[0]+stats[1]+stats[2]+stats[3]+stats[4]+stats[5])/600)*5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile2);

        /*b= (Button)findViewById(R.id.show);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                stats1[0]=0;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(stats1[0]<stats[0])
                        {stats1[0]+=1;
                            nerd.post(new Runnable(){
                                @Override
                                public void run() {
                                    nerd.setProgress(stats1[0]);
                                    Log.d("happening","success");
                                }
                            });

                        }
                    }
                });
            }
        });
        */



        final Thread thread= new Thread(){
            public void run(){
                stats1[0] = 0;
                try
                {while (stats1[0] < stats[0]) {
                    stats1[0] += 1;
                    //Log.d("bs","ILever getLere");
                    nerd.setProgress(stats1[0]);
                    //Log.d("happening", "success");
                        }
                    }
                catch(Exception e){e.printStackTrace();}
                finally{Log.d("finalmessage","it happens");}

            }
        };

        final Thread thread1= new Thread(){
            public void run(){
                stats1[1] = 0;
                try
                {while (stats1[1] < stats[1]) {
                    stats1[1] += 1;
                    //Log.d("bs","ILever getLere");
                    slut.setProgress(stats1[1]);
                    //Log.d("happening", "success");
                }
                }
                catch(Exception e){e.printStackTrace();}
                finally{Log.d("finalmessage","it happens");}

            }
        };

        final Thread thread2= new Thread(){
            public void run(){
                stats1[2] = 0;
                try
                {while (stats1[2] < stats[2]) {
                    stats1[2] += 1;
                    //Log.d("bs","ILever getLere");
                    attr.setProgress(stats1[2]);
                    //Log.d("happening", "success");
                }
                }
                catch(Exception e){e.printStackTrace();}
                finally{Log.d("finalmessage","it happens");}

            }
        };

        final Thread thread3= new Thread(){
            public void run(){
                stats1[3] = 0;
                try
                {while (stats1[3] < stats[3]) {
                    stats1[3] += 1;
                    //Log.d("bs","ILever getLere");
                    two.setProgress(stats1[3]);
                    //Log.d("happening", "success");
                }
                }
                catch(Exception e){e.printStackTrace();}
                finally{Log.d("finalmessage","it happens");}

            }
        };

        final Thread thread4= new Thread(){
            public void run(){
                stats1[4] = 0;
                try
                {while (stats1[4] < stats[4]) {
                    stats1[4] += 1;
                    //Log.d("bs","ILever getLere");
                    judg.setProgress(stats1[4]);
                    //Log.d("happening", "success");
                }
                }
                catch(Exception e){e.printStackTrace();}
                finally{Log.d("finalmessage","it happens");}

            }
        };

        final Thread thread5= new Thread(){
            public void run(){
                stats1[5] = 0;
                try
                {while (stats1[5] < stats[5]) {
                    stats1[5] += 1;
                    //Log.d("bs","ILever getLere");
                    ego.setProgress(stats1[5]);
                    //Log.d("happening", "success");
                }
                }
                catch(Exception e){e.printStackTrace();}
                finally{Log.d("finalmessage","it happens");}

            }
        };

        rate1= (Button) findViewById(R.id.rate);

        rate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int1=new Intent(getBaseContext(),rate.class);
                Toast.makeText(getApplicationContext(),"Rate now!",Toast.LENGTH_LONG).show();
                    startActivity(int1);

            }
        });




        Bundle extras = getIntent().getExtras();
        String class1=extras.getString("tag");
        if(class1.equals("wall")) {
            byte[] b = extras.getByteArray("pic");
            d = extras.getString("data");
            String temp[] = d.split(" ");

            rnk = temp[0];
            inf = temp[1];

            Bitmap bmp = BitmapFactory.decodeByteArray(b, 0, b.length);
            ImageView image = (ImageView) findViewById(R.id.iv1);
            tv = (TextView) findViewById(R.id.tv1);
            tv.setText(Double.toString(avg));

        /*tv.setText(rnk);*/
            image.setImageBitmap(bmp);
        }

        else if(class1.equals("rate")){

            d = extras.getString("values");
            String temp[] = d.split("\\s");

            Log.d("length",Integer.toString(temp.length));


            int i=0;
            while(i<temp.length)
            {
                stats[i]=Integer.parseInt(temp[i]);
                Log.d("string is",temp[i]);
                i++;
            }


        }

        nerd= (ProgressBar) findViewById(R.id.n);
        slut= (ProgressBar) findViewById(R.id.s);
        attr= (ProgressBar) findViewById(R.id.a);
        two= (ProgressBar) findViewById(R.id.t);
        judg= (ProgressBar) findViewById(R.id.j);
        ego= (ProgressBar) findViewById(R.id.e);

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile2, menu);
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
