import java.util.*;

public class SecondElements {
    public static void main(String[] args) {

        int[] arr = {1,2,4,7,7,5};

        Arrays.sort(arr);

        int small = -1;
        int large = -1;

        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[0]){
                small = arr[i];
                break;
            }
        }

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] != arr[arr.length-1]){
                large = arr[i];
                break;
            }
        }

        System.out.println("Second Smallest : " + small);
        System.out.println("Second Largest : " + large);
    }
}