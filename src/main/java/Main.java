import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        BigInteger fac = fac(T);
        int cnt=0;
        while(fac!=BigInteger.valueOf(0)){
            if(fac.remainder(BigInteger.valueOf(10))==BigInteger.valueOf(0)){
                cnt++;
                fac = fac.divide(BigInteger.valueOf(10));
            }
            else{
                break;
            }
        }
        System.out.println(cnt);




    }

    static BigInteger fac(int N){
        if(N==0){
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(N).multiply(fac(N-1));
    }



}