import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = {2,2,1,1,1,2,2};

        int count = 0;
        int cand = 0;

        for(int num : arr){

            if(count == 0){
                cand = num;
            }

            if(num == cand)
                count++;
            else
                count--;
        }

        System.out.println(cand);
    }
}