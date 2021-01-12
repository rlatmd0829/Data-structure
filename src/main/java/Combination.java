import java.util.Scanner;

public class Combination { // 1010 다리짓기, nCr 조합을 사용해도 되고, DP를 사용해도됨
                            // 조합을 이용한 풀이
    public static void main(String[] args){ // int, long 쓰면 오버플로우가 발생한다.
                                            // BigInteger 사용해도됨
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        double[] a = new double[T];

        for(int i=0; i<T; i++){
            double n = sc.nextDouble();
            double m = sc.nextDouble();
            a[i] = Combination(m,n);
        }

        for(int i=0; i<T; i++){
            System.out.printf("%.0f", a[i]);
            System.out.println();
        }
    }

    public static double Combination(double n, double r){
        double a=1, b=1;
        for(double i=n; i>(n-r); i--){
            a *= i;
        }
        for(double i=2; i<=r; i++){
            b *= i;
        }
        return a/b; // nCr = n!/r!(n-r)! = n~(n-r)!/r!   (n개중에 r을 고르는 경우의수)

    }
}
