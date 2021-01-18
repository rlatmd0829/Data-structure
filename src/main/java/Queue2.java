import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Queue2 { // 18258 큐2 문제 , 덱 라이브러리를 사용하여 해결 큐에 맨뒤에 값을 찾기위해
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList();
        for(int i=0; i<T; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            String a = st.nextToken();

            if(a.equals("push")){
                int index = Integer.parseInt(st.nextToken());
                queue.addLast(index);
            }
            else if(a.equals("pop")){
                Integer item = queue.poll();
                if(item == null){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(item).append("\n");
                }
            }
            else if(a.equals("size")){
                sb.append(queue.size()).append("\n");
            }
            else if(a.equals("empty")){
                sb.append(queue.isEmpty()?1:0).append("\n");
            }
            else if(a.equals("front")){
                sb.append(queue.isEmpty()?-1:queue.peek()).append("\n");
            }
            else if(a.equals("back")){
                sb.append(queue.isEmpty()?-1:queue.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}