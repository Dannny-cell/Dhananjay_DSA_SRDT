import java.util.*;

public class MatrixCheck {
    public static void main(String[] args) {

        int[][] a = {
            {1,1,1,1},
            {2,2,2,2},
            {3,3,3,3},
            {4,4,4,4}
        };

        int[][] b = {
            {1,1,1,1},
            {2,2,2,2},
            {3,3,3,3},
            {4,4,4,4}
        };

        boolean same = true;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j] != b[i][j]){
                    same = false;
                    break;
                }
            }
        }

        if(same)
            System.out.println("Matrices are identical");
        else
            System.out.println("Matrices are not identical");
    }
}