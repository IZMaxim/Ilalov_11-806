package ru.itis;

import java.util.Scanner;

public class ClassTestTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа: ");
        String s = sc.next();
        boolean flag = true;
        System.out.println(palindrom(0, s, true));
    }

    public static boolean palindrom(int ind, String s, boolean flag) {
        if (ind < s.length() / 2) {
            if (s.charAt(ind) == s.charAt(s.length() - ind - 1) && flag) {
                palindrom(ind += 1, s, flag);
            } else {
                flag = false;
            }
        }
        return flag;
    }
}