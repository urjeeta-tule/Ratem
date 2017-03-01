package com.mystuff.ratem;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.ByteArrayOutputStream;
import java.util.StringTokenizer;


public class Wall extends ActionBarActivity {

    ImageButton B1;
    ImageButton B2;
    ImageButton B3;
    ImageButton B4;
    ImageButton B5;
    String data="";
    Bitmap d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wall);
        B1= (ImageButton) findViewById(R.id.b1);
        B2= (ImageButton) findViewById(R.id.b2);
        B3= (ImageButton) findViewById(R.id.b3);
        B4= (ImageButton) findViewById(R.id.b4);
        B5= (ImageButton) findViewById(R.id.b5);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_wall, menu);
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

    public void getme(View t)
    {
        Intent i=new Intent(this,profile2.class);
        i.putExtra("tag","wall");
        switch(t.getId())
    {case R.id.b1: {
        data +=R.id.t1 + " " + R.id.i1;
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.avatar_2x);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        i.putExtra("pic", b);
        i.putExtra("data", data);
    }break;
        case R.id.b2:
        {
            data +=R.id.t2 + " " + R.id.i2;
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.seemslegitobama);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
            byte[] b = baos.toByteArray();
            i.putExtra("pic", b);
            i.putExtra("data", data);

        }break;
        case R.id.b3:
        {
            data +=R.id.t3 + " " + R.id.i3;
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.download);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
            byte[] b = baos.toByteArray();
            i.putExtra("pic", b);
            i.putExtra("data", data);

        }break;
        case R.id.b4:
        {
            data +=R.id.t4 + " " + R.id.i4;
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.frnd);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
            byte[] b = baos.toByteArray();
            i.putExtra("pic", b);
            i.putExtra("data", data);

        }break;
        case R.id.b5:
        {
            data +=R.id.t5 + " " + R.id.i5;
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.logo_f6_stillsmallsize);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
            byte[] b = baos.toByteArray();
            i.putExtra("pic", b);
            i.putExtra("data", data);

        }break;
    }
 startActivity(i);
    }
}
