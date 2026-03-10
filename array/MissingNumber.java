import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {3,0,1};

        int n = arr.length;
        int total = n*(n+1)/2;

        int sum = 0;

        for(int num : arr){
            sum += num;
        }

        System.out.println(total - sum);
    }
}