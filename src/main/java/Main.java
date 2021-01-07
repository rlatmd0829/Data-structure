import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    static int arr[];

    static public void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int sum = 0;
        int prev = 0;

        for(int i=0; i<T; i++){
            sum += prev + arr[i];

            prev += arr[i];
        }

        System.out.println(sum);


    }




}