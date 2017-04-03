package com.example.kim_wonhee.a170330;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
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

    public void onMyClick(final View v) {

        if (v.getId() == R.id.button) {
            View dlgview = View.inflate(this, R.layout.order, null);

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setPositiveButton("확인",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Snackbar.make(v, "정보가 입력되었습니다", Snackbar.LENGTH_SHORT).show();
                        }
                    });
            dlg.setNegativeButton("취소",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Snackbar.make(v, "주문이 취소되었습니다", Snackbar.LENGTH_SHORT).show();
                        }
                    });
            dlg.setView(dlgview);
            dlg.setTitle("새 주문");
            dlg.show();
        }
        else if (v.getId() == R.id.button2) {
            View reorderview = View.inflate(this, R.layout.order, null);

            AlertDialog.Builder reorder = new AlertDialog.Builder(this);
            reorder.setPositiveButton("확인",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Snackbar.make(v, "주문이 수정되었습니다", Snackbar.LENGTH_SHORT).show();
                        }
                    });
            reorder.setNegativeButton("취소",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Snackbar.make(v, "주문이 수정되지 않았습니다", Snackbar.LENGTH_SHORT).show();
                        }
                    });
            reorder.setView(reorderview);
            reorder.setTitle("주문수정");
            reorder.show();
        }

    }


}
