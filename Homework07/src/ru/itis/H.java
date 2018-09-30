package ru.itis;

public class H {
    public static void main(String[] args) {
        double n = 17;
        int del = 2;
        if (H(n, del)) {
            System.out.println("YES");
        }
         else System.out.println("NO");
        }

    static boolean H (double n , int del){
        if (n < 2){
             return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % del == 0){
            return false;
        }
        else if (del < n / 2){
           return H(n, del + 1);
            }
            else return true;
        }
    }
