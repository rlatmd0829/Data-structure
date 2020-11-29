
import java.util.Scanner;
import java.util.Stack;


public class Reverse {  // 시간초과 후우..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<T; i++){
            Stack<Object> stack = new Stack<>();
            String str = sc.nextLine();
            for(int j=0; j<str.length(); j++){
                char c = str.charAt(j);
                if(c == ' '){
                    while (!stack.empty()){
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                }
                else{
                    stack.push(str.charAt(j));
                }
            }
            while (!stack.empty()){    // 맨마지막 문자는 뒤에 띄어쓰기가 없으므로 for문을 빠져 나온다음에 한번더 pop해준다.
                System.out.print(stack.pop());
            }
            System.out.println();
        }
        sc.close();

    }
}

