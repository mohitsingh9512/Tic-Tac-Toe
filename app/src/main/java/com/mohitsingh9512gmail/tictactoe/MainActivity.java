package com.mohitsingh9512gmail.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "bradley_hand_itc_tt_bold.ttf");
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "Chiller.ttf");
        b1=(Button) findViewById(R.id.onePlayerButton);
        b2=(Button) findViewById(R.id.twoPlayerButton);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        b1.setTypeface(typeface);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b2.setTypeface(typeface);
        t1.setTypeface(typeface1);
        t1.setTextColor(Color.RED);
        t2.setTypeface(typeface1);
        t2.setTextColor(Color.RED);
        t3.setTypeface(typeface1);
        t3.setTextColor(Color.RED);

    }

    public void onClick(View view)
    {
        int button_id;
        button_id = (view).getId();

        if (button_id==R.id.onePlayerButton)
        {
            Intent intent=new Intent(this,SecondActivity.class);
            startActivity(intent);
        }

        else if (button_id==R.id.twoPlayerButton)
        {
            Intent intent=new Intent(this,ThirdActivity.class);
            startActivity(intent);
        }

    }
}
