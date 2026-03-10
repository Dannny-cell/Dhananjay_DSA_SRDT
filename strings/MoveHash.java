import java.util.*;

public class MoveHash {
    public static void main(String[] args) {

        String str = "Move#Hash#to#Front";

        int hash_count = 0;
        String res = "";

        for(char ch : str.toCharArray()){
            if(ch == '#')
                hash_count++;
            else
                res += ch;
        }

        String front = "";

        for(int i=0;i<hash_count;i++){
            front += "#";
        }

        System.out.println(front + res);
    }
}