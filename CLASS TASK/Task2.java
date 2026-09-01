import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = in.nextLine();
        int [] arr = new int [26];

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                int val = str.charAt(i) - 'A';
            arr[val]++;
            }
            else{
                int val = str.charAt(i) - 'a';
                arr[val]++;
            }
        }
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                if(arr[str.charAt(i) - 'A'] >1){
                    System.out.println(str.charAt(i));
                    arr[str.charAt(i -'a')] = 0;
                }
            }
            else{
                if(arr[str.charAt(i) -'a'] >1){
                    System.out.println(str.charAt(i));
                    arr[str.charAt(i) - 'a'] = 0;
                }
            }
        }
        // for (int i = 0; i < str.length(); i++) {
        //     if(arr[str.charAt(i)-'a']>0)
		//     System.out.print(str.charAt(i)+" "+arr[str.charAt(i)-'a']+" ");
		//     if(arr[str.charAt(i)-'a']>1){
		//         arr[str.charAt(i)-'a']=0;
		//     }
           
        // }
    }
}