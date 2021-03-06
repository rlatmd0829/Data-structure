import java.util.Scanner;

public class StackEx {   // 스택구현
    static int stack[] = new int[10000];
    static int size;
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("몇번 입력할것인가");
        n = sc.nextInt();
        StackEx s;
        while (true) {
            String cmd;
            System.out.println("무엇을 진행할 것인가");
            cmd = sc.next();
            if (cmd.equals("push")) {
                int num;
                System.out.println("데이터를 입력해주세요");
                num = sc.nextInt();
                StackEx.push(num);
            } else if (cmd.equals("top")) {
                //System.out.println((Stack.empty() ? -1 : Stack.top()));
                if (!StackEx.empty()) {
                    System.out.println(StackEx.top());
                }
            } else if (cmd.equals("size")) {
                System.out.println(StackEx.size);
            } else if (cmd.equals("empty")) {
                System.out.println(StackEx.empty());
            } else if (cmd.equals("pop")) {
                //System.out.println((Stack.empty() ? -1 : Stack.top()));
                if (!StackEx.empty()) {
                    System.out.println(StackEx.pop());
                }
            }
            if(n==0){
                break;
            }
            n--;
        }

    }
    public StackEx(){
        size = 0;
    }

    public static void push(int data){
        stack[size]=data;
        size += 1;
    }
    public static boolean empty(){
        if(size == 0){
            return true;  //비어있음
        }
        else
            return false;
    }
    public static int pop(){
        if(empty()){
            return -1;
        }
        else {
            size -= 1;
            return stack[size];
        }
    }
    public static int top(){
        if(empty()){
            return -1;
        }
        else {
            return stack[size - 1];
        }
    }

}
