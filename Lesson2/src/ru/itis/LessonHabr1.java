package ru.itis;


public class LessonHabr1 {
    public static void main(String[] args) {
        System.out.println(nums(6));
    }

    static int nums(int n) {
            if (n == 1) {
                return 1;
            }
            nums(n - 1);
            System.out.println(n - 1);
            return n;
        }
    }
