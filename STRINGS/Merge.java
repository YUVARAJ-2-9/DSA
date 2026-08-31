package STRINGS;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = in.nextLine();
        System.out.println("Enter the str1 :");
        String str1 = in.nextLine();
        String str2 = "";

        str2 += str +str1 ;
        System.out.println("Merger value:" + str2);
    }
}
