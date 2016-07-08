package com.mohitsingh9512gmail.tictactoe;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by Mohit Singh on 6/18/2016.
 */
public class ThirdActivity extends Activity implements View.OnClickListener {


    ImageView l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Button btnNewGame;
    TextView t1,t2,t3;
    static int player=1;
    int s[];
    int cnt=0;
    int win=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        s=new int [9];

        l1=(ImageView) findViewById(R.id.l1);
        l2=(ImageView) findViewById(R.id.l2);
        l3=(ImageView) findViewById(R.id.l3);
        l4=(ImageView) findViewById(R.id.l4);
        l5=(ImageView) findViewById(R.id.l5);
        l6=(ImageView) findViewById(R.id.l6);
        l7=(ImageView) findViewById(R.id.l7);
        l8=(ImageView) findViewById(R.id.l8);
        l9=(ImageView) findViewById(R.id.l9);
        l10=(ImageView) findViewById(R.id.l10);

        t1=(TextView)findViewById(R.id.textView4);
        t2=(TextView)findViewById(R.id.textView5);
        t3=(TextView)findViewById(R.id.result);

        btnNewGame=(Button)findViewById(R.id.btnNewGame);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "bradley_hand_itc_tt_bold.ttf");
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "Chiller.ttf");
        btnNewGame.setTypeface(typeface);
        t1.setTypeface(typeface);
        t2.setTypeface(typeface);
        t3.setTypeface(typeface1);

        l1.setBackgroundColor(Color.LTGRAY);
        l2.setBackgroundColor(Color.LTGRAY);
        l3.setBackgroundColor(Color.LTGRAY);
        l4.setBackgroundColor(Color.LTGRAY);
        l5.setBackgroundColor(Color.LTGRAY);
        l6.setBackgroundColor(Color.LTGRAY);
        l7.setBackgroundColor(Color.LTGRAY);
        l8.setBackgroundColor(Color.LTGRAY);
        l9.setBackgroundColor(Color.LTGRAY);
        t3.setVisibility(View.INVISIBLE);

        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);
        l5.setOnClickListener(this);
        l6.setOnClickListener(this);
        l7.setOnClickListener(this);
        l8.setOnClickListener(this);
        l9.setOnClickListener(this);
        btnNewGame.setOnClickListener(this);
        t1.setTextColor(Color.RED);
        t2.setTextColor(Color.BLACK);

    }


    public void onClick(View v)
    {
        int button_id;
        button_id=(v).getId();

        switch(button_id)
        {
            case R.id.l1 :  place(l1,0);
                            break;
            case R.id.l2 :  place(l2,1);
                            break;
            case R.id.l3 :  place(l3,2);
                            break;
            case R.id.l4 :  place(l4,3);
                            break;
            case R.id.l5 :  place(l5,4);
                            break;
            case R.id.l6 :  place(l6,5);
                            break;
            case R.id.l7 :  place(l7,6);
                            break;
            case R.id.l8 :  place(l8,7);
                            break;
            case R.id.l9 :  place(l9,8);
                            break;
            case R.id.btnNewGame :
                            s=new int[9];
                            win=0;
                            cnt=0;
                            player=1;

                            t1.setTextColor(Color.RED);
                            t2.setTextColor(Color.BLACK);
                            t1.setVisibility(View.VISIBLE);
                            t2.setVisibility(View.VISIBLE);
                            t3.setVisibility(View.INVISIBLE);

                            l1.setImageDrawable(null);
                            l2.setImageDrawable(null);
                            l3.setImageDrawable(null);
                            l4.setImageDrawable(null);
                            l5.setImageDrawable(null);
                            l6.setImageDrawable(null);
                            l7.setImageDrawable(null);
                            l8.setImageDrawable(null);
                            l9.setImageDrawable(null);

                            l1.setBackgroundColor(Color.LTGRAY);
                            l2.setBackgroundColor(Color.LTGRAY);
                            l3.setBackgroundColor(Color.LTGRAY);
                            l4.setBackgroundColor(Color.LTGRAY);
                            l5.setBackgroundColor(Color.LTGRAY);
                            l6.setBackgroundColor(Color.LTGRAY);
                            l7.setBackgroundColor(Color.LTGRAY);
                            l8.setBackgroundColor(Color.LTGRAY);
                            l9.setBackgroundColor(Color.LTGRAY);

                            l1.setEnabled(true);
                            l2.setEnabled(true);
                            l3.setEnabled(true);
                            l4.setEnabled(true);
                            l5.setEnabled(true);
                            l6.setEnabled(true);
                            l7.setEnabled(true);
                            l8.setEnabled(true);
                            l9.setEnabled(true);
                            break;

        }
    }
    public void place(ImageView l,int pos){

        if(player==1)
        {

            s[pos]=player;
            l.setImageResource(R.drawable.cross);
            l.setEnabled(false);
            player=2;

            t2.setTextColor(Color.RED);
            t1.setTextColor(Color.BLACK);
            process();
        }
        else
        {
            s[pos]=player;
            l.setImageResource(R.drawable.circle);
            l.setEnabled(false);
            player=1;

            t1.setTextColor(Color.RED);
            t2.setTextColor(Color.BLACK);
            process();

        }

    }
    public void win(int x)
    {
        t1.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);
        t3.setVisibility(View.VISIBLE);
        if(x==1)
        {
            t3.setText("Player 1 Wins");
        }
        else if(x==2)
        {
            t3.setText("Player 2 Wins");
        }
        else if(x==9)
        {
            t3.setText("Game Draw");
        }
    }
    public void  process(){
        cnt++;
        int x=0;

        if((s[0]==1&&s[1]==1&&s[2]==1)||(s[0]==2&&s[1]==2&&s[2]==2))
        {
            x=s[0];
            win(x);
            win=1;

        }
        if((s[3]==1&&s[4]==1&&s[5]==1)||(s[3]==2&&s[4]==2&&s[5]==2))
        {
            x=s[3];
            win(x);
            win=1;

        }
        if((s[6]==1&&s[7]==1&&s[8]==1)||(s[6]==2&&s[7]==2&&s[8]==2))
        {
            x=s[6];
            win(x);
            win=1;

        }
        if((s[0]==1&&s[3]==1&&s[6]==1)||(s[0]==2&&s[3]==2&&s[6]==2))
        {
            x=s[0];
            win(x);
            win=1;

        }
        if((s[1]==1&&s[4]==1&&s[7]==1)||(s[1]==2&&s[4]==2&&s[7]==2))
        {
            x=s[1];
            win(x);
            win=1;

        }
        if((s[2]==1&&s[5]==1&&s[8]==1)||(s[2]==2&&s[5]==2&&s[8]==2))
        {
            x=s[2];
            win(x);
            win=1;

        }
        if((s[0]==1&&s[4]==1&&s[8]==1)||(s[0]==2&&s[4]==2&&s[8]==2))
        {
            x=s[0];
            win(x);
            win=1;

        }
        if((s[2]==1&&s[4]==1&&s[6]==1)||(s[2]==2&&s[4]==2&&s[6]==2))
        {
            x=s[2];
            win(x);
            win=1;

        }
        if(cnt==9&&win!=1)
        {
            win(cnt);
        }
    }

}
