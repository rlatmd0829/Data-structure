import java.util.Arrays;
import java.util.Scanner;

public class Upper_Lower { // 백준 10816 이분탐색, upper lower 문제
                            // 중복된 값이 있기 떄문에 상한 하한 정해서 푼다
                            // 범위설정 하는거 이해가 잘안됨
    static int arr[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int m = sc.nextInt();
        int k,lo,up;
        for(int i=0; i<m; i++){
            k = sc.nextInt();
            lo = lower_bound(k);
            up = upper_bound(k);
            sb.append((up-lo)+ " ");
        }
        System.out.println(sb);
    }

    public static int lower_bound(int k){ // 배열 a에서 k값이 처음으로 나타나는 인덱스
        int high=arr.length-1, low=0, mid=0;

        while(low < high){
            mid = (high+low)/2;
            if(arr[mid] >= k){ // >= (?)
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return high;
    }

    public static int upper_bound(int k){
        int high=arr.length-1, low=0, mid=0;

        while (low < high){
            mid = (high+low)/2;
            if(arr[mid] > k){
                high = mid;
            }
            else {
                low = mid+1;
            }
        }
        if(arr[high] == k){ // 상한값이 배열 크기를 넘어설 때
            high++;

        }
        return high;
    }
}
