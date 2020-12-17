import java.util.Scanner;

public class Ex1193 { // 분수찾기 복붙, 너무 어렵다 이해포기

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int X = in.nextInt();

        int cross_count = 1, prev_count_sum = 0; // prev_count_sum 현재 대각선 전에 누적합, cross_count 현재 대각선의 원소개수

        while (true) {

            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (X <= prev_count_sum + cross_count) { // 입력 받은 값이 더작다면 실행

                if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면
                    // 분모가 큰 수부터 시작
                    // 분모는 대각선의 원소 개수 - (X 번째 - 직전 대각선까지의 누적합 - 1)
                    // 분자는 X 번째 - 직전 대각선까지의 누적합
                    System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                }

                else {	// 대각선의 개수가 짝수라면
                    // 홀수일 때의 출력을 반대로
                    System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }

            } else { // 대각선 이동
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}