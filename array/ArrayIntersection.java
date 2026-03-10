import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {

        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for(int num : arr1){
            set1.add(num);
        }

        for(int num : arr2){

            if(set1.contains(num)){
                res.add(num);
            }
        }

        System.out.println(res);
    }
}