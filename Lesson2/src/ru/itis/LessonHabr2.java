package ru.itis;

public class LessonHabr2 {
    public static void main(String[] args) {
        ab(3, 2);
    }
    static void ab(int a, int b){
        if (a < b){
            ab(a, b - 1);
            System.out.println(b);
        }
        if(a > b){
            ab(a - 1, b);
            System.out.println(a);
        }
        if (a == b){
            System.out.println(a);
            return;
        }
    }
}
