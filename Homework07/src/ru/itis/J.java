package ru.itis;

public class J {
    public static void main(String[] args) {
        String  s = "local".toLowerCase();
        System.out.println(J(s));
    }

    static String J(String s){
        int sLength = s.length();

        char firstSymbol = s.charAt(0);
        char secondSymbol = s.charAt(sLength - 1);

        if (s.length() == 1){
            return "YES";
        }
        else {
            if (firstSymbol == secondSymbol){
                if (s.length() == 2){
                    return "YES";
                }
                return J(s.substring(1, s.length() - 1));
            }
            else {
                return "NO";
            }
        }
    }
}
