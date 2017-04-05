package com.example.kim_wonhee.a170330;

import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class fragment extends Fragment {

    Button table1, table2, table3, table4;
    TextView Info_table, Info_time, Info_pasta, Info_pizza, Info_membership, Info_price;
    Button order, reorder, reset;

    TextView dlg_table, dlg_time;
    EditText dlg_pasta, dlg_pizza;
    RadioButton dlg_membership1, dlg_membership2, dlg_membership3;

    table t1, t2, t3, t4;

    int tablenum;
    int num_pasta, num_pizza;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.fragment1, container, false);
        init(fragview);


        return fragview;
    }

    void init(final View v) {

        table1 = (Button) v.findViewById(R.id.table1);
        table2 = (Button) v.findViewById(R.id.table2);
        table3 = (Button) v.findViewById(R.id.table3);
        table4 = (Button) v.findViewById(R.id.table4);

        Info_table = (TextView) v.findViewById(R.id.textView2);
        Info_time = (TextView) v.findViewById(R.id.textView4);
        Info_pasta = (TextView) v.findViewById(R.id.textView6);
        Info_pizza = (TextView) v.findViewById(R.id.textView8);
        Info_membership = (TextView) v.findViewById(R.id.textView10);
        Info_price = (TextView) v.findViewById(R.id.textView12);

        order = (Button) v.findViewById(R.id.button);
        reorder = (Button) v.findViewById(R.id.button2);
        reset = (Button) v.findViewById(R.id.button3);

        table1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tablenum = 1;
            }
        });

        table2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tablenum = 2;
            }
        });

        table3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tablenum = 3;
            }
        });

        table4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tablenum = 4;
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View dlgview) {
                if (tablenum == 0) {
                    Toast.makeText(getContext(), "테이블을 선택하세요", Toast.LENGTH_SHORT).show();
                } else {
                    dlgview = View.inflate(getContext(), R.layout.order, null);
                    init_dlg(dlgview);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());

                    dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Snackbar.make(v, "정보가 입력되었습니다", Snackbar.LENGTH_SHORT).show();
                        }
                    });
                    dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Snackbar.make(v, "주문이 취소되었습니다", Snackbar.LENGTH_SHORT).show();
                        }
                    });
                    dlg.setTitle("새 주문");
                    dlg.setView(dlgview);
                    dlg.show();

                    if (tablenum == 1) {
                        if (t1.time == null) {
                            Toast.makeText(getContext(), "비어있는 테이블입니다", Toast.LENGTH_SHORT).show();
                        } else {
                            num_pasta = Integer.parseInt(dlg_pasta.getText().toString());
                            num_pizza = Integer.parseInt(dlg_pizza.getText().toString());



                        }
                    }
                }

            }
        }
        );

        reorder.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View dlgview) {
                dlgview = View.inflate(getContext(), R.layout.order, null);
                init_dlg(dlgview);
                AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());

                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Snackbar.make(v, "주문이 수정되었습니다", Snackbar.LENGTH_SHORT).show();
                    }
                });
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Snackbar.make(v, "주문이 수정되지않았습니다", Snackbar.LENGTH_SHORT).show();
                    }
                });
                dlg.setTitle("정보 수정");
                dlg.setView(dlgview);
                dlg.show();
            }
        }
        );

    }

    void init_dlg(View v) {

        dlg_table = (TextView) v.findViewById(R.id.textView14);
        dlg_time = (TextView) v.findViewById(R.id.textView16);

        dlg_pasta = (EditText) v.findViewById(R.id.editText);
        dlg_pizza = (EditText) v.findViewById(R.id.editText2);

        dlg_membership1 = (RadioButton) v.findViewById(R.id.radioButton);
        dlg_membership2 = (RadioButton) v.findViewById(R.id.radioButton2);
        dlg_membership3 = (RadioButton) v.findViewById(R.id.radioButton3);

    }



}
