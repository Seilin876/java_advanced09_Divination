package com.example.advancedhw09;


import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result[] = {"普通","吉","大吉"};
        System.out.println("請輸入生日: 月 日");
        int Month = Integer.parseInt(scanner.next());
        while (Month<1||Month>12){
            System.out.println("月份須是1~12 請重新輸入");
            Month = Integer.parseInt(scanner.next());
        }
        int Date = Integer.parseInt(scanner.next());
        while (Date<1||Date>31){
            System.out.println("日期錯誤 請重新輸入");
            Date = Integer.parseInt(scanner.next());
        }
        int ansnum = (Month*2+Date)%3;
        System.out.println("你的運勢:"+result[ansnum]);
    }
}