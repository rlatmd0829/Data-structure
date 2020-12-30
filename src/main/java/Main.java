import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static public void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];
        int cnt[] = new int[4001];

        int sum = 0;
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            arr[i]=a;
            sum += a;
        }
        Arrays.sort(arr);

        System.out.println(sum/N);
        System.out.println(arr[N/2]);
        System.out.println();
        System.out.println(arr[N-1]-arr[0]);
    }
}

