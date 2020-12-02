import java.util.Scanner;
import java.util.Stack;

public class Editer { // 시간초과 ;; 1406 에디터 문제
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        Stack<Character> k = new Stack<>();

        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            s.push(arr[i]);
        }
        int count = sc.nextInt();
        while (count-- >0){
            String main = sc.next();
                if (main.equals("L")) {
                    if(!s.empty()) {
                        char good = s.pop();
                        k.push(good);
                    }
                }else if(main.equals("D")){
                    if(!k.empty()) {
                        char goods = k.pop();
                        s.push(goods);
                    }
                }else if(main.equals("B")){
                    if(!s.empty()){
                        s.pop();
                    }
                }else if(main.equals("P")){
                    char hide = sc.next().charAt(0);
                    s.push(hide);
                }
        }
        while (!s.empty()){
            k.push(s.peek());
            s.pop();
        }
        while (!k.empty()){
            System.out.print(k.peek());
            k.pop();
        }
        sc.close();
    }
}
