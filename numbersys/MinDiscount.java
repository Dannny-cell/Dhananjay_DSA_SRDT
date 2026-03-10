package numbersys;
import java.util.*;

public class MinDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int item_num = Integer.parseInt(sc.nextLine());

        String min_item = "";
        int min_disc = Integer.MAX_VALUE;

        for(int i = 0; i < item_num; i++){

            String line = sc.nextLine();
            String[] data = line.split(",");

            String name = data[0];
            int price = Integer.parseInt(data[1]);
            int disc = Integer.parseInt(data[2]);

            int disc_val = (price * disc) / 100;

            if(disc_val < min_disc){
                min_disc = disc_val;
                min_item = name;
            }
        }

        System.out.println(min_item);
    }
}