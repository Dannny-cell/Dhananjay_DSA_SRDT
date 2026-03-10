import java.util.*;

public class DealershipTyres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int shop_num = sc.nextInt();

        for(int i = 0; i < shop_num; i++){

            int car = sc.nextInt();
            int bike = sc.nextInt();

            int tyre = (car * 4) + (bike * 2);

            System.out.println(tyre);
        }
    }
}