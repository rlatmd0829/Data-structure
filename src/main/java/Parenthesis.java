import java.util.Scanner;
import java.util.Stack;

public class Parenthesis { // 맞췄다!! 9012 괄호문제
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<a; i++){
            Stack<Object> stack = new Stack<>();
            char b[] = sc.nextLine().toCharArray();
            int cnt = 0;
            for(int j=0; j<b.length; j++){

                if(b[j]==')'){
                    cnt--;
                    if(stack.empty()){
                        break;
                    }
                    stack.pop();
                }
                else{
                    stack.push(b[j]);
                    cnt++;
                }
            }
            if(cnt == 0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
