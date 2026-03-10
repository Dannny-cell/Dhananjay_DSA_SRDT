import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {

        String str = "madam";

        int left = 0;
        int right = str.length()-1;

        boolean pal = true;

        while(left < right){

            if(str.charAt(left) != str.charAt(right)){
                pal = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(pal);
    }
}