import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class soma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int h = sc.nextInt();

        int[][] people = new int[p][n];


            int m=1;
            for(int j=0; j<n; j++) {
                if(m>p){
                    break;
                }
                int pc = sc.nextInt();
                int time = sc.nextInt();
                if (m!=pc){
                    m++;

                }else {
                    people[pc - 1][j] = time;
                }
            }

        for(int i=0; i<p; i++){
            int[] dp = new int[n];
            int[] sum = new int[p];
            for(int j=0; j<n; j++){
                sum[i]=0;
                if(people[i][j]>h){
                    continue;
                }
                else{
                    dp[j] = people[i][j];
                    ArrayList<Integer> list = new ArrayList();
                    for(int k=0; k<people[i].length; k++){
                        list.add(dp[k]);
                    }
                    Collections.sort(list);
                    Collections.reverse(list);
                    for(int k=0; k<people[i].length; k++){
                        if(list.get(k) <= h){
                            sum[i] += h;
                            if(sum[i] == h){
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println((i+1)+" "+sum[i]*1000);
        }
    }
}
