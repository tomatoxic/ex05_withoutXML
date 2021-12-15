package com.example.ex05_withoutxml;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //1.레이아웃을 만든다(예:리니어 레이아웃)
        //1-1.레이아웃 만들기 옵션을 먼저 정한다.(예:param - 너비, 높이)
        //1-2.레이아웃 객체 생성(예: new LinearLayout)
        //1-3.레이아웃 객체 속성 설정(예:오리엔테이션,배경색 등)
        //1-4.레이아웃 객체를 view에 꽂는다.만들기옵션과 함께

        //1-1.레이아웃 만들기 옵션을 먼저 정한다.(예:param - 너비, 높이)
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        //1-2.레이아웃 객체 생성(예: new LinearLayout)
        LinearLayout baseLayout = new LinearLayout(this);

        //1-3.레이아웃 객체 속성 설정(예:오리엔테이션,배경색 등)
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));

        //1-4.레이아웃 객체를 view에 꽂는다.만들기옵션과 함께
        setContentView(baseLayout, params);


        //2.뷰를 만든다(예:버튼)
        //2-1.뷰 객체를 생성한다.(예:버튼)
        //2-2.뷰 객체의 속성 설정(예:들어갈글자,글자크기,배경색 등)
        //2-3.중요: 뷰객체를 레이아웃에 꽂는다.추가한다
        //2-4.뷰객체의 이벤트처리 (예: 온클릭리스너)

        //2-1.뷰 객체를 생성한다.(예:버튼)
        Button btn1 = new Button(this);

        //2-2.뷰 객체의 속성 설정(예:들어갈글자,글자크기,배경색 등)
        btn1.setText("나 버튼임!!!");
        btn1.setBackgroundColor(Color.MAGENTA);

        //2-3.중요: 뷰객체를 레이아웃에 꽂는다.추가한다
        baseLayout.addView(btn1);

        //2-4.뷰객체의 이벤트처리 (예: 온클릭리스너)
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"클릭했음!!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}