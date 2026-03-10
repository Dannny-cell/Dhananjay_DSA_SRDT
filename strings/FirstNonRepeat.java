import java.util.*;

public class FirstNonRepeat {
    public static void main(String[] args) {

        String str = "swiss";

        int[] count = new int[26];

        for(char ch : str.toCharArray()){
            count[ch-'a']++;
        }

        for(char ch : str.toCharArray()){
            if(count[ch-'a'] == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}