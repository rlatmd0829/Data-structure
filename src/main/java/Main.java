import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        int cnt1=0;
        int cnt2=0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        for(int i=0; i<c.length; i++){
            if(c[i] == '('){
                cnt1++;
            }
            else if (c[i] == ')'){
                    cnt2++;
                }
            }
        if(cnt1 == cnt2){
            System.out.println("YES");

        }else{
            System.out.println("NO");
        }
    }


}