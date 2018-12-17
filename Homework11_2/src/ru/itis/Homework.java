package ru.itis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("in1.txt");
        File file2 = new File("in2.txt");

        Scanner sc1 = new Scanner(file1);
        Scanner sc2 = new Scanner(file2);

        PrintWriter pw = new PrintWriter("Out.txt");

        int a = sc1.nextInt();
        int b = sc2.nextInt();

        while (sc1.hasNextInt() || sc2.hasNextInt()) {
            if (a < b) {
                pw.println(a);
                if (sc1.hasNextInt()) a = sc1.nextInt();
                else a = sc2.nextInt();
            } else {
                pw.println(b);
                if (sc2.hasNextInt()) b = sc2.nextInt();
                else b = sc1.nextInt();
            }
        }

        if (a < b) {
            pw.println(a);
            pw.println(b);
        } else {
            pw.println(b);
            pw.println(a);
        }
        pw.close();
    }
}