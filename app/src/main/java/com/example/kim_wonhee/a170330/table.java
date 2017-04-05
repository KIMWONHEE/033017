package com.example.kim_wonhee.a170330;

/**
 * Created by kim_wonhee on 2017. 3. 30..
 */


public class table {
    int tablenum = 0;
    String time;
    int pasta = 0;
    int pizza = 0;
    int membershipnum = 0;
    int price = 0;

    void table(int tablenum, String time, int pasta, int pizza, int membershipnum, int price) {
        this.tablenum = tablenum;
        this.time = time;
        this.pasta = pasta;
        this.pizza = pizza;
        this.membershipnum = membershipnum;
        this.price = price;
    }
}
