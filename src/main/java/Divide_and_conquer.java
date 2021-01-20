import java.util.Scanner;

public class Divide_and_conquer {
    static int map[][];
    static int cnt[] = {0,0};
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        map = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j] = sc.nextInt();
            }
        }
        divide(0,0,N);
        System.out.println(cnt[0]);
        System.out.println(cnt[1]);
    }
    public static void divide(int x, int y, int N){
        if(isSame(x,y,N)) return;

        divide(x,y,N/2);
        divide(x,y+N/2, N/2);
        divide(x+N/2, y, N/2);
        divide(x+N/2, y+N/2, N/2);
    }

    public static boolean isSame(int x, int y,int N){
        int val = map[x][y];

        for(int i=x; i<x+N; i++){
            for(int j=y; j<y+N; j++){
                if(val != map[i][j]) return false;
            }
        }
        cnt[val]++;
        return true;

    }
}
