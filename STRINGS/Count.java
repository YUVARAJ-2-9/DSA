package STRINGS;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the String:");
        String str = in.nextLine();
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            c++;
        }

        System.out.println("Count :" + c);
    }
}
