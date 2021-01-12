import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Ex9375 { // 조합문제 해시맵 사용

    static int arr[];

    static public void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- >0) {
            HashMap<String, Integer> hm = new HashMap<>(); // <종류, 개수>

            int N = sc.nextInt();

            while (N-- >0) {
                sc.next(); // 옷 이름은 필요없음

                String kind = sc.next();  // 옷 종류

                if (hm.containsKey(kind)){ // 해당 종류의 옷이 해시맵에 있을경우
                    // 해시맵에 저장되어있던 해당 종류의 개수를 +1 증가시킨다.
                    hm.put(kind, hm.get(kind)+1);
                }
                else { // 해당 종류의 옷이 해시맵에 없을 경우 해당 종류와 개수 1을 넣는다.
                    hm.put(kind, 1);
                }
            }
            int result =1;

            for(int val : hm.values()){ // 안 입는 경우를 고려하여 각 종류별 옷의 개수에 +1 해준 값을 곱해주어야 한다.
                result *= (val + 1);
            }
            System.out.println(result -1); // 알몸인 상태를 제외해주어야 하므로 최종값에 -1이 정답
        }




    }



}