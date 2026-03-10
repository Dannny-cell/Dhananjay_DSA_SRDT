import java.util.*;

public class PairSum {
    public static void main(String[] args) {

        int[] arr = {1,5,7,-1,5};
        int target = 6;

        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;

        for(int num : arr){

            if(map.containsKey(target-num)){
                count += map.get(target-num);
            }

            map.put(num, map.getOrDefault(num,0)+1);
        }

        System.out.println(count);
    }
}