package HashMap;

import java.util.HashMap;

public class Pro1 {
    public static void main(String[] args) {
        String str = "101101000011111";
        HashMap <Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i),i);
        }
        System.out.println(map);

    }
}
