import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        for(int i=0; i<N; i++){
            str[i] = sc.next();
        }

        for(int i=0; i<str[0].length(); i++){
            boolean dif = false;
            for(int j=0; j<N-1; j++){
                if(str[j].charAt(i) != str[j+1].charAt(i)){
                    dif = true;
                    break;
                }
            }
            if(dif==true){
                System.out.print('?');
            }
            else{
                System.out.print(str[0].charAt(i));
            }
        }

    }


}