package ARRAYLIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hard {
    public static void main(String[] args) {
        String str = "a@i1$k2j67p";
        ArrayList <Character> num = new ArrayList<>();
        ArrayList <Character> alp = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
                if(Character.isDigit(ch)){
                    num.add(ch);    
        }
                else if(Character.isLetter(ch)){
                    alp.add(ch);
                }

            }
         num.sort(null);
         Collections.reverse(alp);
         System.out.println(num);
         System.out.println(alp);
         String emp = "";
         int numInd =0;
         int alpInd = 0;

         for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
                if(Character.isDigit(ch)){
                    emp += num.get(numInd);
                    numInd++;   
        }
                else if(Character.isLetter(ch)){
                    emp += alp.get(alpInd);
                    alpInd++; 
                }
                else{
                    emp += ch;
                }
         }
         System.out.println(emp);


}

}
