package STRINGS;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the String:");
        String str = in.nextLine();
        System.out.println("Enter the elem to Search:");
        char ch1 = in.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch1 == ch){
                System.out.println("Elem is Found!");
                break;
            }
            else{
                System.out.println("Not found");
                break;
            }
        }
        
    }   
}
