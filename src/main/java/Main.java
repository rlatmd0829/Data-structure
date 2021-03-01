import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        int x;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        ArrayList list = new ArrayList();

        x = sc.nextInt();
        String[] a = new String[x];
        for(int i=0; i<x; i++){
            a[i] = sc.nextLine();

        }
        for(int j=0; j<a[0].length(); j++){
            int i=0;
            if(a[i].charAt(j) == a[i+1].charAt(j) ){
                list.add(a[i].charAt(j));
            }
        }
        System.out.println(x);
    }

}