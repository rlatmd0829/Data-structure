import java.sql.SQLOutput;
import java.util.Scanner;

public class RGB { // 1149, DP 문제 어려움
    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] Cost;
    static int[][] DP;  // 누적합을 계산하기 위한 용도

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Cost = new int[N][3];
        DP = new int[N][3];

        for(int i=0; i<N; i++){
            Cost[i][Red] = sc.nextInt();
            Cost[i][Green] = sc.nextInt();
            Cost[i][Blue] = sc.nextInt();
        }

        // DP의 첫번째 값은 각 색상비용의 첫번째 값으로 초기화
        DP[0][Red] = Cost[0][Red];
        DP[0][Green] = Cost[0][Green];
        DP[0][Blue] = Cost[0][Blue];

        System.out.print(Math.min(Paint_cost(N-1, Red), Math.min(Paint_cost(N-1,Green), Paint_cost(N-1, Blue))));
    }

    static int Paint_cost(int N, int color){

        // 만약 탐색하지 않은 배열이라면
        if(DP[N][color] == 0){

            // color의 색에 따라 이전 집의 서로 다른색을 재귀호출하여 최솟값과 현재 집의 비용을 더해서 DP에 저장한다.
            if(color == Red){
                DP[N][Red] = Math.min(Paint_cost(N-1, Green), Paint_cost(N-1, Blue)) + Cost[N][Red];
            }
            else if(color == Green){
                DP[N][Green] = Math.min(Paint_cost(N-1, Red), Paint_cost(N-1, Blue)) + Cost[N][Green];
            }
            else {
                DP[N][Blue] = Math.min(Paint_cost(N-1, Red), Paint_cost(N-1, Green)) + Cost[N][Blue];
            }
        }
        return DP[N][color];
    }
}
