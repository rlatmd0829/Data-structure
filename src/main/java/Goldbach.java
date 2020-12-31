import java.util.Scanner;

public class Goldbach { // 백준 9020 골드바흐의 추측
                        // 골드바흐의 추측은 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다.

    public static boolean[] prime = new boolean[10001];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        get_prime();

        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            int first_partition = n/2;
            int second_partition = n/2;

            while (true){
                // 두 파티션이 모두 소수일 경우
                if(!prime[first_partition] && !prime[second_partition]){
                    System.out.println(first_partition + " " + second_partition);
                    break;
                }
                first_partition--;
                second_partition++;
            }
        }
    }

    public static void get_prime(){
        prime[0] = prime[1] = true;

        for(int i=2; i<=Math.sqrt(prime.length); i++){
            if(prime[i])
                continue;
            for(int j= i * i; j<prime.length; j+=i){
                prime[j] = true;
            }
        }
    }
}
