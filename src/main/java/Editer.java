import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Editer { // 1406 에디터 문제, StringTokenizer 공부하기, 해결
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> s = new Stack<>();  // 커서 왼쪽 스택
        Stack<Character> k = new Stack<>();  // 커서 오른쪽 스택


        String str = br.readLine();
        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            s.push(arr[i]);
        }
        String cnt = br.readLine();  // br.read() 읽으면 ASCII 코드로 문자열 '1'인 값을 읽어오기 때문에 결국 int 49를 읽어오게 된다.
        int count = Integer.parseInt(cnt); // 그래서 차라리 readLine으로 받은뒤 int로 변환하는 방법이 편한다.
        while (count-- >0){
            String main = br.readLine();
            StringTokenizer st = new StringTokenizer(main); // string을 token 단위로 끊어준다. 디폴트방식이고 공백문자로 나눠준다. split 처럼 지정해줄수 있는데 한문자만로만 나누기가 가능하다.
            String c = st.nextToken();                      // nextToken을 해줘야 처음값이 c에 입력된다.
                if (c.equals("L")) {
                    if(!s.empty()) {
                        char good = s.pop();
                        k.push(good);
                    }
                }else if(c.equals("D")){
                    if(!k.empty()) {
                        char goods = k.pop();
                        s.push(goods);
                    }
                }else if(c.equals("B")){
                    if(!s.empty()){
                        s.pop();
                    }
                }else if(c.equals("P")){

                    s.push(st.nextToken().charAt(0)); // nextToken() 다음 토큰을 리턴한다. 이전토큰은 제거
                }
        }
        while (!s.empty()){  // 왼쪽 스택에 있는 값을 모두 오른쪽 스택에 옮긴다.
            k.push(s.peek());
            s.pop();
        }
        while (!k.empty()){    // 오른쪽 스택에서 모두 빌때까지 pop을 해주고 출력해준다.
            bw.write(k.peek()); // 버퍼에 저장한다는 의미
            k.pop();
        }
        br.close();
        bw.flush(); // flush를 해줘야 write로 저장한 값들 출력
        bw.close();
    }
}
