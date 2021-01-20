import java.io.IOException;
import java.util.Scanner;

public class Matrix { // 2740 문제 행렬의 곱셈 => 3중 for문 사용

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A[i][j] = sc.nextInt();
            }
        }

        M = sc.nextInt();
        int K = sc.nextInt();
        int B[][] = new int[M][K];

        for(int i=0; i<M; i++){
            for(int j=0; j<K; j++){
                B[i][j] = sc.nextInt();
            }
        }


        int C[][] = new int[N][K];

        // 행렬의 곱셈 행렬 A는 N*M 행렬
        //           행렬 B는 M*K 행렬
        // 행렬의 곱셈은 M에 값이 같아야 가능함
        for(int i=0; i<N; i++){  // A 행렬의 행 개수만큼
            for(int j=0; j<K; j++){ // B 행렬의 열 개수만큼
                for(int k=0; k<M; k++){ // 결과값인 C행렬의 원소는 A와 B의 M개의 원소만큼 더한 값
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
         // 출력
        for(int i=0; i<N; i++){
            for(int j=0; j<K; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }

    }
}
