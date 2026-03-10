import java.util.*;

public class SemesterMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sem_num = sc.nextInt();

        for(int i = 1; i <= sem_num; i++){

            int sub_num = sc.nextInt();
            int max_mark = -1;

            for(int j = 1; j <= sub_num; j++){

                int mark = sc.nextInt();

                if(mark < 0 || mark > 100){
                    System.out.println("You have entered invalid mark");
                    return;
                }

                if(mark > max_mark){
                    max_mark = mark;
                }
            }

            System.out.println("Maximum mark in " + i + " semester: " + max_mark);
        }
    }
}