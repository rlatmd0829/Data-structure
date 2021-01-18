import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue4 { // 1021 회전하는 큐 Iterator 사용
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int M = sc.nextInt();

        int count = 0;

        Deque<Integer> q = new LinkedList();

        for(int i=1; i<=N; i++){
            q.add(i);
        }

        for(int i=0; i<M; i++){
            int num = sc.nextInt();
            while (true){
                int index = 0; // 몇번째 인덱스인지 찾기
                Iterator<Integer> it = q.iterator();
                while (it.hasNext()){
                    if(it.next() == num){
                        break;
                    }
                    index++;
                }
                if(index == 0){
                    q.pollFirst();
                    break;
                }
                else if(index > q.size() / 2){ // 인덱스가 사이즈의 반보다 크다면 Last쪽으로 가까이 가기위해 Last에서 빼서 First쪽으로 삽입
                    q.addFirst(q.removeLast());
                    count++;
                }
                else{
                    q.addLast(q.removeFirst());
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
