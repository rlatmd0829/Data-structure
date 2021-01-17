import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int start=0;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack();
        while(T-->0){
            int a = sc.nextInt();
            if(a>start) {
                for (int i = start + 1; i <= a; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start=a;
            }else if(stack.peek() != a){ // top에 있는 원소가 입력받은 값과 같지 않은 경우
                System.out.println("NO");
                return; // 더이상 탐색 할 필요가 없으므로 프로그램을 종료시켜 버린다. System.exit(0) 으로 대체해도됨
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);

    }
}