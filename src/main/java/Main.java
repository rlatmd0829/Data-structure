import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i=0; i<=n; i++){
            arr[i] = i;
        }

        for(int i=2; i<=n; i++){
            if(arr[i] == 0){
                continue;
            }
            for(int j=i*i; j<=n; j+=i){
                int temp = arr[j];
                arr[j] = 0;
                k--;
                if(k==0){
                    System.out.println(temp);
                    System.exit(0);
                }

            }
        }

    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList();
        int sum=0;
        for(int t : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.add(t);
                    answer++;
                    sum += t;
                    break;
                }else if(q.size() == bridge_length){
                    sum -= q.poll();
                }else{
                    if(sum + t > weight){
                        q.add(0);
                        answer++;
                    }else{
                        q.add(t);
                        sum +=t;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer+bridge_length;
    }
}
