package STRINGS;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the String:");
        String str = in.nextLine();
        int v = 0;
        int con = 0;

        str = str.toLowerCase();
       for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                con++;
            }
       }
       System.out.println("Vowel :" + v);
       System.out.println("consonant :" + con);
    }
}
