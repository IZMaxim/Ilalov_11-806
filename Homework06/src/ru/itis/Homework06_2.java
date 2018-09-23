package ru.itis;

import java.util.Scanner;

public class Homework06_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String full = "";
        for (int i = 0; i < s.length(); i++) {
            char sy = s.charAt(i);
            if (sy != ' '){
                full += sy;
            }
        }
        System.out.println(full);
    }
}
