import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class Sequence {
    public static void main(String[] args) throws IOException { // 1874 스택수열 배껴서 해결(어려운듯)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> s = new Stack();
        int count=1;
        String str = br.readLine();
        int a = Integer.parseInt(str);
        boolean found =true;

        List<String> list = new ArrayList();

        while(a-- >0){
                String sr = br.readLine();
                int b = Integer.parseInt(sr);
                if(b>=count){  //입력받은 값이랑 count값이랑 비교해 입력받은값이 더 클 경우에 1부터 입력받은값까지 스택에 넣어준다.
                    while(b>=count) {
                        s.push(++count);
                        list.add("+");
                    }
                }
                if(s.empty()){  // 맨위 while문이 끝나기 전에 스택이 비어있으면 그것은 잘못된것이다.
                    found = false;
                }
                else{
                    while (!s.empty() && s.peek() >= b){ // 입력받은값이랑 스택에 맨 위 값이랑 같거나 스택에 맨위값이 더크면 pop을 해준다.
                        int top = s.peek();
                        s.pop();
                        list.add("-");
                    }
                }
        }
        if(found) { //found가 true이면 정상종료 이기 때문에 저장된 값을 출력해준다.
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i) + "\n");
            }
        }
        else{
            System.out.println("NO");
        }


        br.close();
        bw.flush();
        bw.close();

    }
}
