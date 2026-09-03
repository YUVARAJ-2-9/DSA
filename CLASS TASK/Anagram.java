import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the String:");
        String str = in.nextLine();
         System.out.println("ENter the String:");
        String str1 = in.nextLine();
        char [] arr = str.toCharArray();
        char [] arr1 = str.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr,arr1)){
            System.out.println("It is anagram!");
        }
        else{
            System.out.println("NOt an anagram");
        }
        System.out.println(Arrays.toString(arr));
    }
}
