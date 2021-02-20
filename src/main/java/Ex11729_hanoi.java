import java.util.Scanner;

public class Ex11729_hanoi {
    static int cnt =0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        hanoi(n,1,2,3);
        System.out.println(cnt);
        System.out.println(sb);

    }
    // n : 원판의 개수
    // from : 출발 원판
    // by : 이용하는 원판
    // to : 도착 원판
    public static void hanoi(int n, int from, int by, int to){
        cnt++;
        if(n==1){ // 원판 하나 남았을 경우
            sb.append(from+" "+to+"\n");
            return;
        }
        else{
            hanoi(n-1,from,to,by); // 원판 1에서 3거쳐서 2로 옴기는 작업
            sb.append(from+" "+to+"\n"); // 원판1에서 남은 마지막 원판3으로 옴기기
            hanoi(n-1,by,from,to); // 원판 2에서 1거쳐서 3으로 옴기는 작업
        }
    }
}
