import java.util.Scanner;

public class dfs_test {
    private static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int [] numbers = {1,1,1,1,1};
        dfs(numbers, target, 0);
    }
    public static void dfs(int[] numbers, int target, int node){
        if(node == numbers.length){
            int sum = 0;
            for(int num : numbers){
                sum+=num;
            }

            if(target == sum) answer++;
        }
        else{
            numbers[node] *= 1;
            dfs(numbers, target, node+1);
            numbers[node] *= -1;
            dfs(numbers, target, node+1);
        }
    }
}
