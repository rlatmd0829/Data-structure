import java.util.*;

public class Ex2667_Dfs {
    static int arr[][];
    static boolean check[][];
    static int n;
    static int[][] pos = {{1,0}, {-1,0}, {0,1}, {0,-1}}; // 우, 좌, 상, 하
    static int cnt;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][n];
        check = new boolean[n][n];

        for(int i=0; i<n; i++){
            String str = sc.next();
            for(int j=0; j<n; j++){
                arr[i][j] = str.charAt(j)-'0';
            }
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 1 && check[i][j] == false){
                    cnt=0;
                    dfs(i, j);
                    resultList.add(cnt);
                }
            }
        }
        // 결과값 출력
        System.out.println(resultList.size());
        // 오름차순 정렬
        Collections.sort(resultList);

        for(Integer integer : resultList){
            System.out.println(integer);
        }


    }

    public static void dfs(int x, int y){
        cnt++; // 1개의 단지마다 몇 가구가 있는지 카운트
        check[x][y] = true;
        for (int i=0; i<pos.length; i++){
            int nx = x + pos[i][0];
            int ny = y + pos[i][1];

            // 1. 배열의 조건을 만족하는지
            // 2. 단지가 연결이 되있는지
            // 3. 방문을 하지않은 곳이였을때

            if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny]==1 && check[nx][ny] == false){
                dfs(nx, ny);
            }
        }
   }
}
