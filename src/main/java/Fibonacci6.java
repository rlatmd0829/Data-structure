import java.util.Scanner;

public class Fibonacci6 {
    // 피보나치수 Fn = Fn-1 + Fn-2 는 행렬로 나타내면 {{Fn+1, Fn},{Fn, Fn-1}} = {{1,1}, {1,0}}^n으로 나타낼수 있다.
    static final int MOD = 1000000007;
    static long[][] arr = {{1,1}, {1,0}};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long ans;

        if(n == 1){
            ans = 1;
        } else{
            long[][] res = pow(n);
            ans = res[0][1]; // Fn 을 구해야 하므로 {{Fn+1, Fn},{Fn, Fn-1}}
                            // res[0][1] 사용
        }
//        for(int i=0; i<2; i++){
//            for(int )
//        }
        System.out.println(ans + "");
    }

    public static long[][] pow(long n){
        long[][] tmp = new long[2][2];

        if(n==1){
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    tmp[i][j] = arr[i][j];
                }
            }
            return tmp;
        }

        long[][] m;
        m = pow(n/2);

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<2; k++){
                    tmp[i][j] += m[i][k] * m[k][j];
                }
                tmp[i][j] %= MOD;
            }
        }
        if (n%2 == 1){
            long[][] t = new long[2][2];
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    for(int k=0; k<2; k++){
                        t[i][j] += tmp[i][k] * arr[k][j];
                    }
                    t[i][j] %= MOD;
                }
            }
            return t;
        } else {
            return tmp;
        }
    }
}
