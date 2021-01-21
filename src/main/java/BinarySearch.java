import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            System.out.println(solution(arr,sc.nextInt()));
        }
    }
    public static int solution(int[] arr, int num){
        int high = arr.length-1, low=0, mid=0;

        while (low <= high){
            mid = (high+low)/2;

            if(arr[mid] == num){
                return 1;
            }else if(arr[mid]>num){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return 0;
    }
}
