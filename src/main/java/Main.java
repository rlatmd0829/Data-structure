import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    // nCr = n!/r!(n-r)! = n~(n-r)!/r!
    public static void main(String[] args) throws IOException {

       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();

       int a= fibnachi(N);
        System.out.println(a%1000000007);
    }

    public static int fibnachi(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
           return fibnachi(n - 1) + fibnachi(n - 2);
        }
    }
}