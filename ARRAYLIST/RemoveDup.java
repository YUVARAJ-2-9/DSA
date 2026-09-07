
package ARRAYLIST;
import java.util.ArrayList;
import java.util.Scanner;



public class RemoveDup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the values:");
        int n = in.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(in.nextInt());

        }
        for (int i = 0; i < n;) {
            if(al.contains(al.get(i)) && al.indexOf(al.get(i)) != i){
                al.remove(i);
                n--;
            }
            else{
                i++;
            }
            
        }
        System.out.println(al);
        
        

    }
}
