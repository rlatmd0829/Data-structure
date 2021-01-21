import java.util.Scanner;

public class MatrixSquared { // 백준 10830 행렬 제곱 문제
    // 분할 정복 문제, A^9 = (A^4 * A^4) * A = ((A^2 * A^2) * (A^2 * A^2)) * A
    public static int n;
    public static long[][] matrix;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        long b = sc.nextLong();

        matrix = new long[n][n];

        for (int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        long[][] ans = pow(b);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static long[][] pow(long b){
        long[][] tmp = new long[n][n]; // 값을 넣고 리턴할 행렬
        long[][] m; // 행렬 곱셈을 위해 분할에 사용될 행렬

        if(b==1){ // 제곱근이 1이라면 tmp에 행렬을 담아서 return
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    tmp[i][j] = matrix[i][j] % 1000;
                }
            }
            return tmp;
        }
        m = pow(b / 2); // b==1 이 아니면 b를 2로 나눠서 재귀를 돌린다. (분할)

        // 재귀를 돌려서 받은 m으로 행렬의 곱셈을 수행 (병합)
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    tmp[i][j] += m[i][k] * m[k][j];
                }
                tmp[i][j] %= 1000;
            }
        }

        // b를 나누어서 나머지가 1이면 행렬을 한번 더 곱해서 return
        // 아니라면 그냥 return
        if(b%2 == 1){
            long[][] odd = new long[n][n];
            // 나머지가 1이면 한번더 곱해줘야 하기 때문에 나머지가 1일경우는 odd 행렬에 넣어주고 리턴함

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    for(int k=0; k<n; k++){
                        odd[i][j] += tmp[i][k] * matrix[k][j];
                    }
                    odd[i][j] %= 1000;
                }
            }
            return odd;
        } else{
            return tmp;
        }
    }
}
