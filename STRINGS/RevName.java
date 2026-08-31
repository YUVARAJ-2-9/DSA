package STRINGS;

import java.util.Scanner;

public class RevName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = in.nextLine();
        String str1 = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            str1 += ch;
        }
        System.out.println("REV VAL:" + str1);
    }
}
