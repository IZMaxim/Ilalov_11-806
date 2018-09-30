package ru.itis;

public class D {
    public static void main(String[] args) {
        double k = 1024;
        if (D(k) == 1) {
            System.out.println("YES");
        }
        else System.out.println("NO");

    }

    static int D(double  k) {
    if (k == 1){
        return 1;
        }
        else if (k > 1 && k < 2){
            return 0;
    }
    else return D(k / 2);
    }
}
