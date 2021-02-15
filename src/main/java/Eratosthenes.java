import java.util.Scanner;

public class Eratosthenes { // 백준 1929번 문제, 에라토스테네스의 체 이용해 소수 구하기
    public static boolean[] prime;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        prime = new boolean[N+1]; // 0~N까지에 수를 배열에 넣기 위해서는 N+1로 선언
        get_prime();

        for(int i=M; i<=N; i++){
            // false = 소수
            if(!prime[i]) System.out.println(i);
        }



    }
    // 에라토스테네스의 체 알고리즘
    public static void get_prime(){
        //true = 소수아님, false = 소수
        prime[0] = prime[1] = true;

        // 제곱근 함수 : Math.sqrt()
        for(int i=2; i<= Math.sqrt(prime.length); i++){
            if(prime[i]) continue; // 이미 체크된 배열이면 다음 반복문으로 스킵

            for(int j=i*i; j<prime.length; j += i){ // i의 배수들을 걸러주기 위한 반복문
                prime[j] = true;
            }
        }
    }
}
