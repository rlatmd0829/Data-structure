import java.util.Scanner;
import java.util.Stack;
public class Sequence {
    public static void main(String[] args){ // 못풀음 1874 스택수열
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int m=0;
        int a = sc.nextInt();
        sc.nextLine();
        String ans = null;  // arrayList로 수정
        while(a-- >0){
                int b = sc.nextInt();
                if(b>m){
                    while(b>m) {
                        s.push(++m);
                        ans += "+";
                        //System.out.println("+");
                    }
                    s.pop();
                    ans += "-";
                    //System.out.println("-");
                }
                else{
                    boolean found =false;
                    if(!s.empty()){
                        int top = s.peek();
                        s.pop();
                        ans += "-";
                        //System.out.println("-");
                        if(b == top){
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("NO");
                    }
                }
        }
        System.out.println(ans);

        sc.close();
    }
}
