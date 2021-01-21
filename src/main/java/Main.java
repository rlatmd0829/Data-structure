import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int cnt=0;
    public static void main(String[] args) throws IOException {

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];


       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }
       Arrays.sort(arr);

       int m = sc.nextInt();
       int result[] = new int[m];
       for(int i=0; i<m; i++){
           solution(arr, result, sc.nextInt());
       }

    }
    public static void solution(int[] arr, int[] result, int a){
        int high = arr.length, low=0, mid=0;

        while (high >= low){
            mid = (high+low)/2;
            if(arr[mid] == a){
                result[cnt]++;

            } else if(arr[mid]>a){
                high = mid -1;
            } else {
                low = mid +1;
            }
        }
        cnt++;
        return;
    }
}