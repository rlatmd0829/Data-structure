import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[8][8];
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            String str = sc.nextLine();
            for(int j=0; j<arr.length; j++){
                arr[i][j] = str.charAt(j);
                if((i+j)%2 == 0 && arr[i][j] == 'F'){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
