import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean is_prime = true;

        if(num <= 1){
            is_prime = false;
        }

        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                is_prime = false;
                break;
            }
        }

        System.out.println(is_prime);
    }
}