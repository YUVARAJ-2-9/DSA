package STRINGS;

import java.util.Scanner;

public class WithSpc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the String:");
        String str = in.nextLine();
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            str1 += ch + " ";

        }
        System.out.println(str1);
        
    }
}
