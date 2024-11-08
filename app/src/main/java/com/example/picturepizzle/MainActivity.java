package com.example.picturepizzle;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    TextView tvCounter;
    Button btn00,btn01,btn02,btn10,btn11,btn12,btn20,btn21,btn22;
    Button btnRestart;
    int counter=0;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn00=findViewById(R.id.btn_00);
        btn01=findViewById(R.id.btn_01);
        btn02=findViewById(R.id.btn_02);
        btn10=findViewById(R.id.btn_10);
        btn11=findViewById(R.id.btn_11);
        btn12=findViewById(R.id.btn_12);
        btn20=findViewById(R.id.btn_20);
        btn21=findViewById(R.id.btn_21);
        btn22=findViewById(R.id.btn_22);
        tvCounter=findViewById(R.id.tv_counter);
        btnRestart=findViewById(R.id.btn_restart);
        btn22.setBackground(null);
        win();
        loss();
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restart();
            }
        });
        btn00.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(btn01.getBackground()==null){
                    btn01.setBackground(btn00.getBackground());
                    btn00.setBackground(null);
                    btn00.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if(btn10.getBackground()==null){
                    btn10.setBackground(btn00.getBackground());
                    btn00.setBackground(null);
                    btn00.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }
                return true;
            }
        });
        btn01.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(btn00.getBackground()==null){
                    btn00.setBackground(btn01.getBackground());
                    btn01.setBackground(null);
                    btn01.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                } else if (btn02.getBackground()==null) {
                    btn02.setBackground(btn01.getBackground());
                    btn01.setBackground(null);
                    btn01.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if (btn11.getBackground()==null){
                    btn11.setBackground(btn01.getBackground());
                    btn01.setBackground(null);
                    btn01.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }
                return true;
            }
        });
        btn02.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(btn01.getBackground()==null){
                    btn01.setBackground(btn02.getBackground());
                    btn02.setBackground(null);
                    btn02.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if (btn12.getBackground()==null){
                    btn12.setBackground(btn02.getBackground());
                    btn02.setBackground(null);
                    btn02.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }
                return true;
            }
        });
        btn10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(btn00.getBackground()==null){
                    btn00.setBackground(btn10.getBackground());
                    btn10.setBackground(null);
                    btn10.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if(btn11.getBackground()==null){
                    btn11.setBackground(btn10.getBackground());
                    btn10.setBackground(null);
                    btn10.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if (btn20.getBackground()==null){
                    btn20.setBackground(btn10.getBackground());
                    btn10.setBackground(null);
                    btn10.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }
                return true;
            }
        });
        btn11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(btn01.getBackground()==null){
                    btn01.setBackground(btn11.getBackground());
                    btn11.setBackground(null);
                    btn11.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                } else if (btn10.getBackground()==null) {
                    btn10.setBackground(btn11.getBackground());
                    btn11.setBackground(null);
                    btn11.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if (btn21.getBackground()==null) {
                    btn21.setBackground(btn11.getBackground());
                    btn11.setBackground(null);
                    btn11.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if (btn12.getBackground()==null) {
                    btn12.setBackground(btn11.getBackground());
                    btn11.setBackground(null);
                    btn11.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }
                return true;
            }
        });
        btn12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(btn02.getBackground()==null){
                    btn02.setBackground(btn12.getBackground());
                    btn12.setBackground(null);
                    btn12.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if(btn11.getBackground()==null){
                    btn11.setBackground(btn12.getBackground());
                    btn12.setBackground(null);
                    btn12.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if(btn22.getBackground()==null){
                    btn22.setBackground(btn12.getBackground());
                    btn12.setBackground(null);
                    btn12.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }
                return true;
            }
        });
        btn20.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(btn10.getBackground()==null){
                    btn10.setBackground(btn20.getBackground());
                    btn20.setBackground(null);
                    btn20.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if(btn21.getBackground()==null){
                    btn21.setBackground(btn20.getBackground());
                    btn20.setBackground(null);
                    btn20.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }

                return true;
            }
        });
        btn21.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(btn22.getBackground()==null){
                    btn22.setBackground(btn21.getBackground());
                    btn21.setBackground(null);
                    btn21.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    loss();
                    win();
                }else if(btn11.getBackground()==null){
                    btn11.setBackground(btn21.getBackground());
                    btn21.setBackground(null);
                    btn21.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    loss();
                    win();
                }else if(btn20.getBackground()==null){
                    btn20.setBackground(btn21.getBackground());
                    btn21.setBackground(null);
                    btn21.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    loss();
                    win();
                }
                return true;
            }
        });
        btn22.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(btn12.getBackground()==null){
                    btn12.setBackground(btn22.getBackground());
                    btn22.setBackground(null);
                    btn22.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }else if(btn21.getBackground()==null){
                    btn21.setBackground(btn22.getBackground());
                    btn22.setBackground(null);
                    btn22.postInvalidate();
                    counter++;
                    tvCounter.setText(counter+"");
                    win();
                    loss();
                }
                return true;
            }
        });
    }
    public void win(){
        Drawable btn00img,btn01img,btn02img,btn10img,btn11img,btn12img,btn20img,btn21img,btn22img;
        btn00img=btn00.getBackground();
        btn01img=btn01.getBackground();
        btn02img=btn02.getBackground();
        btn10img=btn10.getBackground();
        btn11img=btn11.getBackground();
        btn12img=btn12.getBackground();
        btn20img=btn20.getBackground();
        btn21img=btn21.getBackground();
        btn22img=btn22.getBackground();
        Drawable img00,img01,img02,img10,img11,img12,img20,img21,img22;
        img00=ContextCompat.getDrawable(this,R.drawable.img_00);
        img01=ContextCompat.getDrawable(this,R.drawable.img_01);
        img02=ContextCompat.getDrawable(this,R.drawable.img_02);
        img10=ContextCompat.getDrawable(this,R.drawable.img_10);
        img11=ContextCompat.getDrawable(this,R.drawable.img_11);
        img12=ContextCompat.getDrawable(this,R.drawable.img_12);
        img20=ContextCompat.getDrawable(this,R.drawable.img_20);
        img21=ContextCompat.getDrawable(this,R.drawable.img_21);
        img22=ContextCompat.getDrawable(this,R.drawable.img_22);
        if(btn00img!=null&&btn01img!=null&&btn02img!=null&&btn10img!=null&&btn11img!=null&&btn12img!=null&&btn20img!=null&&btn21img!=null&&btn22img==null) {
            if(Objects.equals(btn00img.getConstantState(), img00.getConstantState()) &&
                    Objects.equals(btn01img.getConstantState(), img01.getConstantState()) &&
                    Objects.equals(btn02img.getConstantState(), img02.getConstantState()) &&
                    Objects.equals(btn10img.getConstantState(), img10.getConstantState()) &&
                    Objects.equals(btn11img.getConstantState(), img11.getConstantState()) &&
                    Objects.equals(btn12img.getConstantState(), img12.getConstantState()) &&
                    Objects.equals(btn20img.getConstantState(), img20.getConstantState()) &&
                    Objects.equals(btn21img.getConstantState(), img21.getConstantState()) ){
                    btn22.setBackground(img22);
                    showWinDialog();
            }
        }
    }
    public void loss(){
        if(counter==100){
            showLossDialog();
        }
    }
    public void showWinDialog(){
        Dialog dialog=new Dialog(this);
        View winDialogView= LayoutInflater.from(this).inflate(R.layout.win_dialog,null);
        dialog.setContentView(winDialogView);
        Button btnPlayAgain=winDialogView.findViewById(R.id.playAgainButton);
        Button exitButton=winDialogView.findViewById(R.id.exitBtn);
        dialog.show();
        btnPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                restart();
            }
        });
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                finish();
            }
        });
    }
    public void showLossDialog(){
        Dialog dialog=new Dialog(MainActivity.this);
        View dialogView=getLayoutInflater().inflate(R.layout.loss_dialog,null);
        dialog.setContentView(dialogView);
        Button btnTryAgain=dialogView.findViewById(R.id.tryAgainButton);
        Button btnExit=dialogView.findViewById(R.id.exitButton);
        dialog.show();
        btnTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dialog.dismiss();
               restart();
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                finish();
            }
        });
    }

    public void restart(){
        int []listOfPictures={R.drawable.img_00,R.drawable.img_01,R.drawable.img_02,R.drawable.img_10,R.drawable.img_11,R.drawable.img_12,R.drawable.img_20,R.drawable.img_21};
        Button []listOfButtons={btn00,btn01,btn02,btn10,btn11,btn12,btn20,btn21};
        int position=0;
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <8 ; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0; i < 8; i++) {
            listOfButtons[list.get(i)].setBackground(ContextCompat.getDrawable(MainActivity.this,listOfPictures[i]));
            btn22.setBackground(null);
        }
        counter=0;
        tvCounter.setText(counter+"");
    }
}