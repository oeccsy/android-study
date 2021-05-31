package com.example.android_prac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override //AppCompatActivity의 메소드 재정의
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // AppCompatActivity 클래스의 onCreat()호출 : 호출해야 액티비티로 작동
        setContentView(R.layout.activity_main); //액티비티에서 보여줄 화면을 설정하는 코드
        // R.layout.activity_main 은 /res/layout/activity_main.xml 파일을 지칭한다.


    }
}