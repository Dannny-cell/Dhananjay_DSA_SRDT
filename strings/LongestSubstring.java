import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {

        String str = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max_len = 0;

        for(int right=0; right<str.length(); right++){

            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
            max_len = Math.max(max_len, right-left+1);
        }

        System.out.println(max_len);
    }
}