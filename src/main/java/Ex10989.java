import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Ex10989 { // 정렬문제,  시간과 메모리 때문에 Arrays.sort(), Collections.sort()를 사용하지못함 카운팅정렬을 사용해 해결
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] cnt = new int[10001];

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            cnt[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i=1; i<10001; i++){
            // i 값이 개수가 0이 될 때 까지 출력(빈도수를 의미)
            while(cnt[i]>0){ // 중복 데이터가 있으므로 누적한 인덱스의 value 값을 한개씩 줄이면서 0이 될 때 까지 출력해주어야 한다.
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}