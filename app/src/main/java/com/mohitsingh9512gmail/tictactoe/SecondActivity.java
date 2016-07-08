package com.mohitsingh9512gmail.tictactoe;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Mohit Singh on 6/19/2016.
 */
public class SecondActivity extends Activity implements View.OnClickListener {

    ImageView l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Button btnNewGame;
    TextView t3;
    static int player=2;
    int s[];
    int cnt=0;
    int win=0;
    private final String LOG_TAG="123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

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
        t3=(TextView)findViewById(R.id.t3);

        btnNewGame=(Button)findViewById(R.id.btnNewGame);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "bradley_hand_itc_tt_bold.ttf");
        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "Chiller.ttf");
        btnNewGame.setTypeface(typeface);
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

        comPlace();
    }

        public void onClick(View v)
        {
            int button_id;
            button_id=(v).getId();

            switch(button_id)
            {
                case R.id.l1 :  playerPlace(l1, 0);
                    processPlayer();
                    break;
                case R.id.l2 :  playerPlace(l2, 1);
                    processPlayer();
                    break;
                case R.id.l3 :  playerPlace(l3, 2);
                    processPlayer();
                    break;
                case R.id.l4 :  playerPlace(l4, 3);
                    processPlayer();
                    break;
                case R.id.l5 :  playerPlace(l5, 4);
                    processPlayer();
                    break;
                case R.id.l6 :  playerPlace(l6, 5);
                    processPlayer();
                    break;
                case R.id.l7 :  playerPlace(l7, 6);
                    processPlayer();
                    break;
                case R.id.l8 :  playerPlace(l8, 7);
                    processPlayer();
                    break;
                case R.id.l9 :  playerPlace(l9, 8);
                    processPlayer();
                    break;
                case R.id.btnNewGame :
                    s=new int[9];
                    win=0;
                    cnt=0;
                    player=2;

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
                    t3.setVisibility(View.INVISIBLE);

                    l1.setEnabled(true);
                    l2.setEnabled(true);
                    l3.setEnabled(true);
                    l4.setEnabled(true);
                    l5.setEnabled(true);
                    l6.setEnabled(true);
                    l7.setEnabled(true);
                    l8.setEnabled(true);
                    l9.setEnabled(true);
                    comPlace();
                    break;

            }
        }

        public void comPlace()
        {   Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8] + "comPlace start");

            if((s[0]==2&&s[4]==1&&s[8]==0)||(s[2]==2&&s[4]==1&&s[6]==0)||(s[8]==2&&s[4]==1&&s[0]==0)||(s[6]==2&&s[4]==1&&s[2]==0))
            {
                if(s[0]==2&&s[4]==1&&s[8]==0)
                {
                    attacked(l9,8);
                }
                else if(s[2]==2&&s[4]==1&&s[6]==0)
                {
                    attacked(l7,6);
                }
                else if(s[8]==2&&s[4]==1&&s[0]==0)
                {
                    attacked(l1,0);
                }
                else if (s[6]==2&&s[4]==1&&s[2]==0)
                {
                    attacked(l3,2);
                }
            }
            else if((s[0]==2&&s[1]==2&&s[2]==0)||(s[0]==2&&s[2]==2&&s[1]==0)||(s[0]==2&&s[3]==2&&s[6]==0)||(s[0]==2&&s[6]==2&&s[3]==0)||(s[0]==2&&s[4]==2&&s[8]==0)||(s[0]==2&&s[8]==2&&s[4]==0)
                    ||(s[2]==2&&s[1]==2&&s[0]==0)||(s[2]==2&&s[0]==2&&s[1]==0)||(s[2]==2&&s[5]==2&&s[8]==0)||(s[2]==2&&s[8]==2&&s[5]==0)||(s[2]==2&&s[4]==2&&s[6]==0)||(s[2]==2&&s[6]==2&&s[4]==0)
                    ||(s[4]==2&&s[1]==2&&s[7]==0)||(s[4]==2&&s[2]==2&&s[6]==0)||(s[4]==2&&s[0]==2&&s[8]==0)||(s[4]==2&&s[5]==2&&s[3]==0)||(s[4]==2&&s[3]==2&&s[5]==0)||(s[4]==2&&s[6]==2&&s[2]==0)||(s[4]==2&&s[7]==2&&s[1]==0)||(s[4]==2&&s[8]==2&&s[0]==0)
                    ||(s[6]==2&&s[1]==2&&s[0]==0)||(s[6]==2&&s[7]==2&&s[8]==0)||(s[6]==2&&s[0]==2&&s[3]==0)||(s[6]==2&&s[8]==2&&s[7]==0)||(s[6]==2&&s[2]==2&&s[4]==0)||(s[6]==2&&s[4]==2&&s[2]==0)
                    ||(s[8]==2&&s[5]==2&&s[2]==0)||(s[8]==2&&s[2]==2&&s[5]==0)||(s[8]==2&&s[4]==2&&s[0]==0)||(s[8]==2&&s[0]==2&&s[4]==0)||(s[8]==2&&s[7]==2&&s[6]==0)||(s[8]==2&&s[6]==2&&s[7]==0)
                    ||(s[1]==2&&s[0]==2&&s[2]==0)||(s[1]==2&&s[2]==2&&s[0]==0)||(s[1]==2&&s[7]==2&&s[4]==0)||(s[1]==2&&s[4]==2&&s[7]==0)
                    ||(s[3]==2&&s[0]==2&&s[6]==0)||(s[3]==2&&s[6]==2&&s[3]==0)||(s[3]==2&&s[4]==2&&s[5]==0)||(s[3]==2&&s[5]==2&&s[4]==0)
                    ||(s[5]==2&&s[2]==2&&s[8]==0)||(s[5]==2&&s[8]==2&&s[2]==0)||(s[5]==2&&s[4]==2&&s[3]==0)||(s[5]==2&&s[3]==2&&s[4]==0)
                    ||(s[7]==2&&s[6]==2&&s[8]==0)||(s[7]==2&&s[8]==2&&s[6]==0)||(s[7]==2&&s[4]==2&&s[1]==0)||(s[7]==2&&s[1]==2&&s[4]==0)
                    )
            { Log.v(LOG_TAG,"from attack");
                attackquick();
            }
            else if ((s[0]==1&&s[1]==1&&s[2]!=2)||(s[0]==1&&s[2]==1&&s[1]!=2)||(s[0]==1&&s[3]==1&&s[6]!=2)||(s[0]==1&&s[6]==1&&s[3]!=2)||(s[0]==1&&s[4]==1&&s[8]!=2)||(s[0]==1&&s[8]==1&&s[4]!=2)
                    ||(s[2]==1&&s[1]==1&&s[0]!=2)||(s[2]==1&&s[0]==1&&s[1]!=2)||(s[2]==1&&s[5]==1&&s[8]!=2)||(s[2]==1&&s[8]==1&&s[5]!=2)||(s[2]==1&&s[4]==1&&s[6]!=2)||(s[2]==1&&s[6]==1&&s[4]!=2)
                    ||(s[4]==1&&s[1]==1&&s[7]!=2)||(s[4]==1&&s[2]==1&&s[6]!=2)||(s[4]==1&&s[0]==1&&s[8]!=2)||(s[4]==1&&s[5]==1&&s[3]!=2)||(s[4]==1&&s[3]==1&&s[5]!=2)||(s[4]==1&&s[6]==1&&s[2]!=2)||(s[4]==1&&s[7]==1&&s[1]!=2)||(s[4]==1&&s[8]==1&&s[0]!=2)
                    ||(s[6]==1&&s[1]==1&&s[0]!=2)||(s[6]==1&&s[7]==1&&s[8]!=2)||(s[6]==1&&s[0]==1&&s[3]!=2)||(s[6]==1&&s[8]==1&&s[7]!=2)||(s[6]==1&&s[2]==1&&s[4]!=2)||(s[6]==1&&s[4]==1&&s[2]!=2)
                    ||(s[8]==1&&s[5]==1&&s[2]!=2)||(s[8]==1&&s[2]==1&&s[5]!=2)||(s[8]==1&&s[4]==1&&s[0]!=2)||(s[8]==1&&s[0]==1&&s[4]!=2)||(s[8]==1&&s[7]==1&&s[6]!=2)||(s[8]==1&&s[6]==1&&s[7]!=2)
                    ||(s[1]==1&&s[0]==1&&s[2]!=2)||(s[1]==1&&s[2]==1&&s[0]!=2)||(s[1]==1&&s[7]==1&&s[4]!=2)||(s[1]==1&&s[4]==1&&s[7]!=2)
                    ||(s[3]==1&&s[0]==1&&s[6]!=2)||(s[3]==1&&s[6]==1&&s[3]!=2)||(s[3]==1&&s[4]==1&&s[5]!=2)||(s[3]==1&&s[5]==1&&s[4]!=2)
                    ||(s[5]==1&&s[2]==1&&s[8]!=2)||(s[5]==1&&s[8]==1&&s[2]!=2)||(s[5]==1&&s[4]==1&&s[3]!=2)||(s[5]==1&&s[3]==1&&s[4]!=2)
                    ||(s[7]==1&&s[6]==1&&s[8]!=2)||(s[7]==1&&s[8]==1&&s[6]!=2)||(s[7]==1&&s[4]==1&&s[1]!=2)||(s[7]==1&&s[1]==1&&s[4]!=2)
                    )
            { Log.v(LOG_TAG,"from defence");
                defence();
            }

            else
            {    Log.v(LOG_TAG,"from else");
                int j=0;
                j=generate();
                Log.v(LOG_TAG,j+"");
                if(j==0)
                {
                    attacked(l1,0);
                }
                else if(j==1)
                {
                    attacked(l2,1);
                }
                else if(j==2)
                {
                    attacked(l3,2);
                }
                else if(j==3)
                {
                    attacked(l4,3);
                }
                else if(j==4)
                {
                    attacked(l5,4);
                }
                else if(j==5)
                {
                    attacked(l6,5);
                }
                else if(j==6)
                {
                    attacked(l7,6);
                }
                else if(j==7)
                {
                    attacked(l8,7);
                }
                else if(j==8)
                {
                    attacked(l9,8);
                }
                Log.v(LOG_TAG,s[0]+""+s[1]+""+s[2]+""+s[3]+""+s[4]+""+s[5]+""+s[6]+""+s[7]+""+s[8]+"comPlace end");

            }

        }
        public int generate()
        {    Log.v(LOG_TAG,s[0]+""+s[1]+""+s[2]+""+s[3]+""+s[4]+""+s[5]+""+s[6]+""+s[7]+""+s[8]+"generate start");
            int val=0;
            int size = 0;

            for (int q=0;q<s.length;q++)
            {
                if(s[q]==0)
                {
                    size++;
                }
            }
            Log.v(LOG_TAG,size+" size");
            int choice[];
            choice=new int[size];
            int l=-1 ;

            for (int q=0;q<s.length;q++)
            {
                if(s[q]==0)
                {   l++;
                    choice[l]=q;
                    Log.v(LOG_TAG,choice[l]+" choice");
                }

            }

            int i=0;
            Random r = new Random();
            Log.v(LOG_TAG,choice.length+" choice.length");
            i = r.nextInt(choice.length);
            Log.v(LOG_TAG,i+" i");
            val=choice[i];
            Log.v(LOG_TAG,val+" val");
            Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8]+"generate end");
            return val;

        }

        public void attackquick()
        {    Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8] + "attackquick start");
            if ((s[0]==2&&s[1]==2&&s[2]==0)||(s[0]==2&&s[2]==2&&s[1]==0)||(s[0]==2&&s[3]==2&&s[6]==0)||(s[0]==2&&s[6]==2&&s[3]==0)||(s[0]==2&&s[4]==2&&s[8]==0)||(s[0]==2&&s[8]==2&&s[4]==0))
            {
                if(s[0]==2&&s[1]==2&&s[2]==0)
                {   attacked(l3,2);
                }
                else if(s[0]==2&&s[2]==2&&s[1]==0)
                {   attacked(l2,1);
                }
                else if(s[0]==2&&s[3]==2&&s[6]==0)
                {   attacked(l7,6);
                }
                else if(s[0]==2&&s[6]==2&&s[3]==0)
                {   attacked(l4,3);
                }
                else if(s[0]==2&&s[4]==2&&s[8]==0)
                {   attacked(l9,8);
                }
                else if(s[0]==2&&s[8]==2&&s[4]==0)
                {   attacked(l5,4);
                }
            }
            else if((s[2]==2&&s[1]==2&&s[0]==0)||(s[2]==2&&s[0]==2&&s[1]==0)||(s[2]==2&&s[5]==2&&s[8]==0)||(s[2]==2&&s[8]==2&&s[5]==0)||(s[2]==2&&s[4]==2&&s[6]==0)||(s[2]==2&&s[6]==2&&s[4]==0))
            {
                if(s[2]==2&&s[1]==2&&s[0]==0)
                {   attacked(l1,0);
                }
                else if(s[2]==2&&s[0]==2&&s[1]==0)
                {   attacked(l2,1);
                }
                else if(s[2]==2&&s[5]==2&&s[8]==0)
                {   attacked(l9,8);
                }
                else if(s[2]==2&&s[8]==2&&s[5]==0)
                {   attacked(l6,5);
                }
                else if(s[2]==2&&s[4]==2&&s[6]==0)
                {   attacked(l7,6);
                }
                else if(s[2]==2&&s[6]==2&&s[4]==0)
                {   attacked(l5,4);
                }
            }
            else if((s[4]==2&&s[1]==2&&s[7]==0)||(s[4]==2&&s[2]==2&&s[6]==0)||(s[4]==2&&s[0]==2&&s[8]==0)||(s[4]==2&&s[5]==2&&s[3]==0)||(s[4]==2&&s[3]==2&&s[5]==0)||(s[4]==2&&s[6]==2&&s[2]==0)||(s[4]==2&&s[7]==2&&s[1]==0)||(s[4]==2&&s[8]==2&&s[0]==0))
            {
                if(s[4]==2&&s[1]==2&&s[7]==0)
                {   attacked(l8,7);
                }
                else if(s[4]==2&&s[2]==2&&s[6]==0)
                {   attacked(l7,6);
                }
                else if(s[4]==2&&s[0]==2&&s[8]==0)
                {   attacked(l9,8);
                }
                else if(s[4]==2&&s[5]==2&&s[3]==0)
                {   attacked(l4,3);
                }
                else if(s[4]==2&&s[3]==2&&s[5]==0)
                {   attacked(l6,5);
                }
                else if(s[4]==2&&s[6]==2&&s[2]==0)
                {   attacked(l3,2);
                }
                else if(s[4]==2&&s[7]==2&&s[1]==0)
                {   attacked(l2,1);
                }
                else if(s[4]==2&&s[8]==2&&s[0]==0)
                {   attacked(l1,0);
                }

            }
            else if((s[6]==2&&s[1]==2&&s[0]==0)||(s[6]==2&&s[7]==2&&s[8]==0)||(s[6]==2&&s[0]==2&&s[3]==0)||(s[6]==2&&s[8]==2&&s[7]==0)||(s[6]==2&&s[2]==2&&s[4]==0)||(s[6]==2&&s[4]==2&&s[2]==0))
            {
                if(s[6]==2&&s[1]==2&&s[0]==0)
                {   attacked(l1,0);
                }
                else if(s[6]==2&&s[7]==2&&s[8]==0)
                {   attacked(l9,8);
                }
                else if(s[6]==2&&s[0]==2&&s[3]==0)
                {   attacked(l4,3);
                }
                else if(s[6]==2&&s[8]==2&&s[7]==0)
                {   attacked(l8,7);
                }
                else if(s[6]==2&&s[2]==2&&s[4]==0)
                {   attacked(l5,4);
                }
                else if(s[6]==2&&s[4]==2&&s[2]==0)
                {   attacked(l3,2);
                }

            }
            else if((s[8]==2&&s[5]==2&&s[2]==0)||(s[8]==2&&s[2]==2&&s[5]==0)||(s[8]==2&&s[4]==2&&s[0]==0)||(s[8]==2&&s[0]==2&&s[4]==0)||(s[8]==2&&s[7]==2&&s[6]==0)||(s[8]==2&&s[6]==2&&s[7]==0))
            {
                if(s[8]==2&&s[5]==2&&s[2]==0)
                {   attacked(l3,2);
                }
                else if(s[8]==2&&s[2]==2&&s[5]==0)
                {   attacked(l6,5);
                }
                else if(s[8]==2&&s[4]==2&&s[0]==0)
                {   attacked(l1,0);
                }
                else if(s[8]==2&&s[0]==2&&s[4]==0)
                {   attacked(l5,4);
                }
                else if(s[8]==2&&s[7]==2&&s[6]==0)
                {   attacked(l7,6);
                }
                else if(s[8]==2&&s[6]==2&&s[7]==0)
                {   attacked(l8,7);
                }

            }
            else if((s[1]==2&&s[0]==2&&s[2]==0)||(s[1]==2&&s[2]==2&&s[0]==0)||(s[1]==2&&s[7]==2&&s[4]==0)||(s[1]==2&&s[4]==2&&s[7]==0))
            {
                if(s[1]==2&&s[0]==2&&s[2]==0)
                {   attacked(l3,2);
                }
                else if(s[1]==2&&s[2]==2&&s[0]==0)
                {   attacked(l1,0);
                }
                else if(s[1]==2&&s[7]==2&&s[4]==0)
                {   attacked(l5,4);
                }
                else if(s[1]==2&&s[4]==2&&s[7]==0)
                {   attacked(l8,7);
                }

            }
            else if((s[3]==2&&s[0]==2&&s[6]==0)||(s[3]==2&&s[6]==2&&s[3]==0)||(s[3]==2&&s[4]==2&&s[5]==0)||(s[3]==2&&s[5]==2&&s[4]==0))
            {
                if(s[3]==2&&s[0]==2&&s[6]==0)
                {   attacked(l7,6);
                }
                else if(s[3]==2&&s[6]==2&&s[3]==0)
                {   attacked(l4,3);
                }
                else if(s[3]==2&&s[4]==2&&s[5]==0)
                {   attacked(l6,5);
                }
                else if(s[3]==2&&s[5]==2&&s[4]==0)
                {   attacked(l5,4);
                }

            }
            else if((s[5]==2&&s[2]==2&&s[8]==0)||(s[5]==2&&s[8]==2&&s[2]==0)||(s[5]==2&&s[4]==2&&s[3]==0)||(s[5]==2&&s[3]==2&&s[4]==0))
            {
                if(s[5]==2&&s[2]==2&&s[8]==0)
                {   attacked(l9,8);
                }
                else if(s[5]==2&&s[8]==2&&s[2]==0)
                {   attacked(l3,2);
                }
                else if(s[5]==2&&s[4]==2&&s[3]==0)
                {   attacked(l4,3);
                }
                else if(s[5]==2&&s[3]==2&&s[4]==0)
                {   attacked(l5,4);
                }

            }
            else if((s[7]==2&&s[6]==2&&s[8]==0)||(s[7]==2&&s[8]==2&&s[6]==0)||(s[7]==2&&s[4]==2&&s[1]==0)||(s[7]==2&&s[1]==2&&s[4]==0))
            {
                if(s[7]==2&&s[6]==2&&s[8]==0)
                {   attacked(l9,8);
                }
                else if(s[7]==2&&s[8]==2&&s[6]==0)
                {   attacked(l7,6);
                }
                else if(s[7]==2&&s[4]==2&&s[1]==0)
                {   attacked(l2,1);
                }
                else if(s[7]==2&&s[1]==2&&s[4]==0)
                {   attacked(l5,4);
                }

            }
            Log.v(LOG_TAG,s[0]+""+s[1]+""+s[2]+""+s[3]+""+s[4]+""+s[5]+""+s[6]+""+s[7]+""+s[8]+"attackquick end");
        }
        public void attacked(ImageView l,int pos)
        {
            Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8]+"attacked start");
            s[pos]=player;
            l.setImageResource(R.drawable.cross);
            l.setEnabled(false);
            player=1;

            comProcess();
            Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8]+"attacked end");
        }
        public void comProcess()
        {
            Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8]+"comProcess start");
            cnt++;
            int x;
            if(s[0]==2&&s[1]==2&&s[2]==2)
            {
                x=s[0];
                winCom(x);
                win=1;

            }
            else if(s[3]==2&&s[4]==2&&s[5]==2)
            {
                x=s[3];
                winCom(x);
                win=1;

            }
            else if(s[6]==2&&s[7]==2&&s[8]==2)
            {
                x=s[6];
                winCom(x);
                win=1;

            }
            else if(s[0]==2&&s[3]==2&&s[6]==2)
            {
                x=s[0];
                winCom(x);
                win=1;

            }
            else if(s[1]==2&&s[4]==2&&s[7]==2)
            {
                x=s[1];
                winCom(x);
                win=1;

            }
            else if(s[2]==2&&s[5]==2&&s[8]==2)
            {
                x=s[2];
                winCom(x);
                win=1;

            }
            else if(s[0]==2&&s[4]==2&&s[8]==2)
            {
                x=s[0];
                winCom(x);
                win=1;

            }
            else if(s[2]==2&&s[4]==2&&s[6]==2)
            {
                x=s[2];
                winCom(x);
                win=1;

            }
            else if(cnt==9&&win!=1)
            {
                winCom(cnt);
            }
            Log.v(LOG_TAG,s[0]+""+s[1]+""+s[2]+""+s[3]+""+s[4]+""+s[5]+""+s[6]+""+s[7]+""+s[8]+"comProcess end");
        }
        public void winCom(int x)
        {   t3.setVisibility(View.VISIBLE);
            l1.setEnabled(false);
            l2.setEnabled(false);
            l3.setEnabled(false);
            l4.setEnabled(false);
            l5.setEnabled(false);
            l6.setEnabled(false);
            l7.setEnabled(false);
            l8.setEnabled(false);
            l9.setEnabled(false);
            if(x==2)
            {
                t3.setText("Computer Wins");
            }

            else if(x==9)
            {
                t3.setText("Game Draw");

            }
            Log.v(LOG_TAG,s[0]+""+s[1]+""+s[2]+""+s[3]+""+s[4]+""+s[5]+""+s[6]+""+s[7]+""+s[8]+"winCom end");
        }
        public void playerPlace(ImageView l,int pos)
        {

            s[pos]=player;
            l.setImageResource(R.drawable.circle);
            l.setEnabled(false);
            player=2;
            Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8] + "playerPlace");
        }
        public void winPlayer(int x)
        {   Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8] + "winPlayer start");
            t3.setVisibility(View.VISIBLE);
            l1.setEnabled(false);
            l2.setEnabled(false);
            l3.setEnabled(false);
            l4.setEnabled(false);
            l5.setEnabled(false);
            l6.setEnabled(false);
            l7.setEnabled(false);
            l8.setEnabled(false);
            l9.setEnabled(false);
            if(x==1)
            {
                t3.setText("You Win");
            }

            else if(x==9)
            {
                t3.setText("Game Draw");
                Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8] + "winPlayer end");
            }
        }
        public void  processPlayer(){
            Log.v(LOG_TAG,s[0]+""+s[1]+""+s[2]+""+s[3]+""+s[4]+""+s[5]+""+s[6]+""+s[7]+""+s[8]+"processPlayer start");
            cnt++;
            int x;
            if(s[0]==1&&s[1]==1&&s[2]==1)
            {
                x=s[0];
                winPlayer(x);
                win=1;

            }
            else if(s[3]==1&&s[4]==1&&s[5]==1)
            {
                x=s[3];
                winPlayer(x);
                win=1;

            }
            else if(s[6]==1&&s[7]==1&&s[8]==1)
            {
                x=s[6];
                winPlayer(x);
                win=1;

            }
            else if(s[0]==1&&s[3]==1&&s[6]==1)
            {
                x=s[0];
                winPlayer(x);
                win=1;

            }
            else if(s[1]==1&&s[4]==1&&s[7]==1)
            {
                x=s[1];
                winPlayer(x);
                win=1;

            }
            else if(s[2]==1&&s[5]==1&&s[8]==1)
            {
                x=s[2];
                winPlayer(x);
                win=1;

            }
            else if(s[0]==1&&s[4]==1&&s[8]==1)
            {
                x=s[0];
                winPlayer(x);
                win=1;

            }
            else if(s[2]==1&&s[4]==1&&s[6]==1)
            {
                x=s[2];
                winPlayer(x);
                win=1;

            }
            else if(cnt==9&&win!=1)
            {
                winPlayer(cnt);
            }
            else
            {
                comPlace();
            }

            Log.v(LOG_TAG,s[0]+""+s[1]+""+s[2]+""+s[3]+""+s[4]+""+s[5]+""+s[6]+""+s[7]+""+s[8]+"processPlayer end");
        }
        public void defence()
        {   Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8] + "defence start");
            if ((s[0]==1&&s[1]==1&&s[2]!=2)||(s[0]==1&&s[2]==1&&s[1]!=2)||(s[0]==1&&s[3]==1&&s[6]!=2)||(s[0]==1&&s[6]==1&&s[3]!=2)||(s[0]==1&&s[4]==1&&s[8]!=2)||(s[0]==1&&s[8]==1&&s[4]!=2))
            {
                if(s[0]==1&&s[1]==1&&s[2]!=2)
                {   defend(l3,2);
                }
                else if(s[0]==1&&s[2]==1&&s[1]!=2)
                {   defend(l2,1);
                }
                else if(s[0]==1&&s[3]==1&&s[6]!=2)
                {   defend(l7,6);
                }
                else if(s[0]==1&&s[6]==1&&s[3]!=2)
                {   defend(l4,3);
                }
                else if(s[0]==1&&s[4]==1&&s[8]!=2)
                {   defend(l9,8);
                }
                else if(s[0]==1&&s[8]==1&&s[4]!=2)
                {   defend(l5,4);
                }
            }
            else if((s[2]==1&&s[1]==1&&s[0]!=2)||(s[2]==1&&s[0]==1&&s[1]!=2)||(s[2]==1&&s[5]==1&&s[8]!=2)||(s[2]==1&&s[8]==1&&s[5]!=2)||(s[2]==1&&s[4]==1&&s[6]!=2)||(s[2]==1&&s[6]==1&&s[4]!=2))
            {
                if(s[2]==1&&s[1]==1&&s[0]!=2)
                {   defend(l1,0);
                }
                else if(s[2]==1&&s[0]==1&&s[1]!=2)
                {   defend(l2,1);
                }
                else if(s[2]==1&&s[5]==1&&s[8]!=2)
                {   defend(l9,8);
                }
                else if(s[2]==1&&s[8]==1&&s[5]!=2)
                {   defend(l6,5);
                }
                else if(s[2]==1&&s[4]==1&&s[6]!=2)
                {   defend(l7,6);
                }
                else if(s[2]==1&&s[6]==1&&s[4]!=2)
                {   defend(l5,4);
                }
            }
            else if((s[4]==1&&s[1]==1&&s[7]!=2)||(s[4]==1&&s[2]==1&&s[6]!=2)||(s[4]==1&&s[0]==1&&s[8]!=2)||(s[4]==1&&s[5]==1&&s[3]!=2)||(s[4]==1&&s[3]==1&&s[5]!=2)||(s[4]==1&&s[6]==1&&s[2]!=2)||(s[4]==1&&s[7]==1&&s[1]!=2)||(s[4]==1&&s[8]==1&&s[0]!=2))
            {
                if(s[4]==1&&s[1]==1&&s[7]!=2)
                {   defend(l8,7);
                }
                else if(s[4]==1&&s[2]==1&&s[6]!=2)
                {   defend(l7,6);
                }
                else if(s[4]==1&&s[0]==1&&s[8]!=2)
                {   defend(l9,8);
                }
                else if(s[4]==1&&s[5]==1&&s[3]!=2)
                {   defend(l4,3);
                }
                else if(s[4]==1&&s[3]==1&&s[5]!=2)
                {   defend(l6,5);
                }
                else if(s[4]==1&&s[6]==1&&s[2]!=2)
                {   defend(l3,2);
                }
                else if(s[4]==1&&s[7]==1&&s[1]!=2)
                {   defend(l2,1);
                }
                else if(s[4]==1&&s[8]==1&&s[0]!=2)
                {   defend(l1,0);
                }

            }
            else if((s[6]==1&&s[1]==1&&s[0]!=2)||(s[6]==1&&s[7]==1&&s[8]!=2)||(s[6]==1&&s[0]==1&&s[3]!=2)||(s[6]==1&&s[8]==1&&s[7]!=2)||(s[6]==1&&s[2]==1&&s[4]!=2)||(s[6]==1&&s[4]==1&&s[2]!=2))
            {
                if(s[6]==1&&s[1]==1&&s[0]!=2)
                {   defend(l1,0);
                }
                else if(s[6]==1&&s[7]==1&&s[8]!=2)
                {   defend(l9,8);
                }
                else if(s[6]==1&&s[0]==1&&s[3]!=2)
                {   defend(l4,3);
                }
                else if(s[6]==1&&s[8]==1&&s[7]!=2)
                {   defend(l8,7);
                }
                else if(s[6]==1&&s[2]==1&&s[4]!=2)
                {   defend(l5,4);
                }
                else if(s[6]==1&&s[4]==1&&s[2]!=2)
                {   defend(l3,2);
                }

            }
            else if((s[8]==1&&s[5]==1&&s[2]!=2)||(s[8]==1&&s[2]==1&&s[5]!=2)||(s[8]==1&&s[4]==1&&s[0]!=2)||(s[8]==1&&s[0]==1&&s[4]!=2)||(s[8]==1&&s[7]==1&&s[6]!=2)||(s[8]==1&&s[6]==1&&s[7]!=2))
            {
                if(s[8]==1&&s[5]==1&&s[2]!=2)
                {   defend(l3,2);
                }
                else if(s[8]==1&&s[2]==1&&s[5]!=2)
                {   defend(l6,5);
                }
                else if(s[8]==1&&s[4]==1&&s[0]!=2)
                {   defend(l1,0);
                }
                else if(s[8]==1&&s[0]==1&&s[4]!=2)
                {   defend(l5,4);
                }
                else if(s[8]==1&&s[7]==1&&s[6]!=2)
                {   defend(l7,6);
                }
                else if(s[8]==1&&s[6]==1&&s[7]!=2)
                {   defend(l8,7);
                }

            }
            else if((s[1]==1&&s[0]==1&&s[2]!=2)||(s[1]==1&&s[2]==1&&s[0]!=2)||(s[1]==1&&s[7]==1&&s[4]!=2)||(s[1]==1&&s[4]==1&&s[7]!=2))
            {
                if(s[1]==1&&s[0]==1&&s[2]!=2)
                {   defend(l3,2);
                }
                else if(s[1]==1&&s[2]==1&&s[0]!=2)
                {   defend(l1,0);
                }
                else if(s[1]==1&&s[7]==1&&s[4]!=2)
                {   defend(l5,4);
                }
                else if(s[1]==1&&s[4]==1&&s[7]!=2)
                {   defend(l8,7);
                }

            }
            else if((s[3]==1&&s[0]==1&&s[6]!=2)||(s[3]==1&&s[6]==1&&s[3]!=2)||(s[3]==1&&s[4]==1&&s[5]!=2)||(s[3]==1&&s[5]==1&&s[4]!=2))
            {
                if(s[3]==1&&s[0]==1&&s[6]!=2)
                {   defend(l7,6);
                }
                else if(s[3]==1&&s[6]==1&&s[3]!=2)
                {   defend(l4,3);
                }
                else if(s[3]==1&&s[4]==1&&s[5]!=2)
                {   defend(l6,5);
                }
                else if(s[3]==1&&s[5]==1&&s[4]!=2)
                {   defend(l5,4);
                }

            }
            else if((s[5]==1&&s[2]==1&&s[8]!=2)||(s[5]==1&&s[8]==1&&s[2]!=2)||(s[5]==1&&s[4]==1&&s[3]!=2)||(s[5]==1&&s[3]==1&&s[4]!=2))
            {
                if(s[5]==1&&s[2]==1&&s[8]!=2)
                {   defend(l9,8);
                }
                else if(s[5]==1&&s[8]==1&&s[2]!=2)
                {   defend(l3,2);
                }
                else if(s[5]==1&&s[4]==1&&s[3]!=2)
                {   defend(l4,3);
                }
                else if(s[5]==1&&s[3]==1&&s[4]!=2)
                {   defend(l5,4);
                }

            }
            else if((s[7]==1&&s[6]==1&&s[8]!=2)||(s[7]==1&&s[8]==1&&s[6]!=2)||(s[7]==1&&s[4]==1&&s[1]!=2)||(s[7]==1&&s[1]==1&&s[4]!=2))
            {
                if(s[7]==1&&s[6]==1&&s[8]!=2)
                {   defend(l9,8);
                }
                else if(s[7]==1&&s[8]==1&&s[6]!=2)
                {   defend(l7,6);
                }
                else if(s[7]==1&&s[4]==1&&s[1]!=2)
                {   defend(l2,1);
                }
                else if(s[7]==1&&s[1]==1&&s[4]!=2)
                {   defend(l5,4);
                }

            }
            Log.v(LOG_TAG,s[0]+""+s[1]+""+s[2]+""+s[3]+""+s[4]+""+s[5]+""+s[6]+""+s[7]+""+s[8]+"defence end ");
        }

        public void defend(ImageView l,int pos)
        {
            Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8]+"defend start");
            s[pos]=player;
            l.setImageResource(R.drawable.cross);
            l.setEnabled(false);
            player=1;
            comProcess();
            Log.v(LOG_TAG, s[0] + "" + s[1] + "" + s[2] + "" + s[3] + "" + s[4] + "" + s[5] + "" + s[6] + "" + s[7] + "" + s[8]+"defend end");
        }


}
