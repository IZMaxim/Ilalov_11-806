package ru.itis;

import java.util.Scanner;

public class Homework05_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String q = sc.nextLine();
        System.out.println("Введите ключ: l/u");
        String k = sc.nextLine();
        if (k.equals("l")){
            q = q.toLowerCase();
        }
        else if (k.equals("u")){
            q = q.toUpperCase();
        }
        System.out.println(q);
    }
}
