package com.example.advancedhw09;


import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result[] = {"���q","�N","�j�N"};
        System.out.println("�п�J�ͤ�: �� ��");
        int Month = Integer.parseInt(scanner.next());
        while (Month<1||Month>12){
            System.out.println("������O1~12 �Э��s��J");
            Month = Integer.parseInt(scanner.next());
        }
        int Date = Integer.parseInt(scanner.next());
        while (Date<1||Date>31){
            System.out.println("������~ �Э��s��J");
            Date = Integer.parseInt(scanner.next());
        }
        int ansnum = (Month*2+Date)%3;
        System.out.println("�A���B��:"+result[ansnum]);
    }
}