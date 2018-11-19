package ru.itis;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Work {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\user\\Desktop\\MyFiles\\in1.txt");
        Scanner sc1 = new Scanner(f1);
        File f2 = new File("C:\\Users\\user\\Desktop\\MyFiles\\in2.txt");
        Scanner sc2 = new Scanner(f2);
        File out = new File("C:\\Users\\user\\Desktop\\MyFiles\\out.txt");
        PrintWriter pw = new PrintWriter(out);
        int a = 0, b = 0;
        while (sc1.hasNextInt() && sc2.hasNextInt()){
            a = sc1.nextInt();
            b = sc2.nextInt();
            int sum = a + b;
            pw.println(sum);
        }
    }
}
