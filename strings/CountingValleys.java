import java.util.*;

public class CountingValleys {
    public static void main(String[] args) {

        int steps = 8;
        String path = "UDDDUDUU";

        int level = 0;
        int valley = 0;

        for(char step : path.toCharArray()){

            if(step == 'U')
                level++;
            else
                level--;

            if(level == 0 && step == 'U')
                valley++;
        }

        System.out.println(valley);
    }
}