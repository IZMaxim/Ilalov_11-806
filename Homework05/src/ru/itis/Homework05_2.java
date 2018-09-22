package ru.itis;

import java.util.Scanner;

public class Homework05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.nextLine();
        String full = "";
        for (int i = 0; i < s.length(); i++) {
            char st = s.charAt(i);
            if (st  == '0' | st == '1' | st == '2' | st == '3' | st == '4' | st == '5' | st == '6' | st == '7' | st == '8' | st == '9'){
                st = '*';
            }
            else if (st == ' '){
                st = ' ';
            }
            full += st;
        }
        System.out.println(full);
    }
}
