import java.io.*;
import java.util.StringTokenizer;

public class Ex2896 { // 수학 달팽이문제 시간초과가 뜨기 때문에 반복문을 쓰면안된다.
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V  = Integer.parseInt(st.nextToken());
        int cnt =0;
        cnt = (V-B) / (A-B); // 하루에 올라갈수 있는 거리는 A-B이다. 정상에 도달한 후에는 아래로 떨어지지 않기 때문에 도달해야 하는 거리는 V-B이다.
        if((V-B)%(A-B) != 0){ // 나머지가 0이 아니라면 한번더 해야하기 때문에 ++해준다.
            cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}
