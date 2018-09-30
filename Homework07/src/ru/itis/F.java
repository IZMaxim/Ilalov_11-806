package ru.itis;

public class F {
    public static void main(String[] args) {
        int n = 12345;
        F(n);
    }
    static void F(int n){
        if (n < 10){
            System.out.println(n);
            return;
        }
        else{
            int k = n % 10;
            System.out.println(k);
            F(n / 10);
        }
    }
}
