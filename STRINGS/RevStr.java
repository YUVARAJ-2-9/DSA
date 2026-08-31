package STRINGS;

import java.util.Scanner;

public class RevStr {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = in.nextLine();
        String str1 = "";

        for (int i = str.length()-1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println("Char:" + str1);
    }
}
