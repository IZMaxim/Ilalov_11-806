package ru.itis;

import java.util.Scanner;

public class Homework05_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = 0;
        int k = 1;
        char[] st = s.toCharArray();
        for (int i = st.length - 1; i >= 0; i--) {
            int num = Character.digit(st[i], 10);
            while (num > 0) {
                x += num % 10 * k;
                num /= 10;
                k *= 10;
            }
        }
            System.out.println(x);
    }
}
