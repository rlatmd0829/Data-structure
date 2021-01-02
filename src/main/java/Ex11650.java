import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex11650 { // 정렬문제, 2차원 배열은 Arrays.sort()를 하기위해서는 변형을 해줘야한다.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [][] arr = new int[N][2];

        for(int i=0; i<N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>(){ // 람다식으로도 쉽게 표현가능
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) // x값이 같으면 y 값으로 비교
                    return o1[1] - o2[1]; // 리턴값이 양수이면 순서 바꾸고 음수이면 순서를 냅둔다.
                else
                    return o1[0] - o2[0];
            }
        });

        for(int i=0; i<N; i++){
            System.out.println(arr[i][0] + " "+arr[i][1]);
        }
    }
}
