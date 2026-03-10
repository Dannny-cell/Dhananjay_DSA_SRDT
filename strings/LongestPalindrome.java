import java.util.*;

public class LongestPalindrome {
    public static void main(String[] args) {

        String str = "babad";
        String ans = "";

        for(int i=0;i<str.length();i++){

            for(int j=i+1;j<=str.length();j++){

                String sub = str.substring(i,j);

                if(isPal(sub) && sub.length() > ans.length()){
                    ans = sub;
                }
            }
        }

        System.out.println(ans);
    }

    static boolean isPal(String s){

        int l = 0;
        int r = s.length()-1;

        while(l < r){

            if(s.charAt(l) != s.charAt(r))
                return false;

            l++;
            r--;
        }

        return true;
    }
}