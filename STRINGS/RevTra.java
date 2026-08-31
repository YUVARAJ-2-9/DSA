package STRINGS;

import java.util.Scanner;

public class RevTra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = in.nextLine();

        for (int i = str.length()-1; i >=0 ; i--) {
            char ch = str.charAt(i);
                System.out.print(ch + " ");
            
        }
    }
}
