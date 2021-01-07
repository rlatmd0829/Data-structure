import java.io.IOException;
import java.util.Scanner;

public class Greedy { // 11047 동전 문제, Greedy 알고리즘 사용 매순간 최적의 해를 찾는다.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int [] coin = new int[N];

        for(int i=0; i<N; i++){
            coin[i] = sc.nextInt();
        }

        int count = 0;

        for(int i=N-1; i>=0; i--){ // 동전의 가치는 오름차순으로 주어지기 때문에 for문 거꾸로 돌려서 큰수부터 확인해봄

            // 현재 동전의 가치가 K보다 작거나 같아야지 구성가능하다.
            if(coin[i] <= K){
                // 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
                count += (K/coin[i]);
                K = K % coin[i];
            }
        }
        System.out.println(count);
    }
}
