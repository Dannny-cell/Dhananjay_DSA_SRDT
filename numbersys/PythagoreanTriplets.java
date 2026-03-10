import java.util.*;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();

        for(int a = 1; a <= limit; a++){
            for(int b = 1; b <= limit; b++){
                for(int c = 1; c <= limit; c++){
                    if(a*a + b*b == c*c){
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}