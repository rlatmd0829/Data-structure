import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class BigInt { // 1676 팩토리얼 0의 개수
                        // 팩토리얼 크기가 엄청나게 커지기 때문에 BigInteger을 사용한다.
                        //System.out.println("덧셈(+) :" +bigNumber1.add(bigNumber2));
                        //System.out.println("뺄셈(-) :" +bigNumber1.subtract(bigNumber2));
                         //System.out.println("곱셈(*) :" +bigNumber1.multiply(bigNumber2));
                        //System.out.println("나눗셈(/) :" +bigNumber1.divide(bigNumber2));
                         //System.out.println("나머지(%) :" +bigNumber1.remainder(bigNumber2));

    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        BigInteger fac = fac(T);
        int cnt=0;
        while(fac!=BigInteger.valueOf(0)){ // BigInteger.valueOf() 를 이용해 int 를 BigInteger로 만들어줌
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