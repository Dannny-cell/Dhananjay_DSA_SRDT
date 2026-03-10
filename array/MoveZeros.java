import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};

        int pos = 0;

        for(int num : arr){

            if(num != 0){
                arr[pos++] = num;
            }
        }

        while(pos < arr.length){
            arr[pos++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}