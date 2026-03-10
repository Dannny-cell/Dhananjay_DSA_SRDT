import java.util.*;

public class FirstUniqueIndex {
    public static void main(String[] args) {

        String str = "loveleetcode";

        int[] count = new int[26];

        for(char ch : str.toCharArray()){
            count[ch-'a']++;
        }

        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)-'a'] == 1){
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}