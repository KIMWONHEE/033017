package com.example.kim_wonhee.a170330;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("HYPasta 예약시스템");
    }

    public void onMyClick(View v) {

        if (v.getId() == R.id.button) {
            View dlgview = View.inflate(this, R.layout.order, null);

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setPositiveButton("확인",null);
            dlg.setNegativeButton("취소",null);
            dlg.setView(dlgview);
            dlg.show();
        }


    }
}
