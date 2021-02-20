import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = {3,7,19,25,2,6,4};
        System.out.println(solution(arr));
    }
    public static int solution(int[] citations) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i<citations.length; i++){
            list.add(citations[i]);
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            if(list.get(i)<i+1){
                return i;
            }
        }
        return citations.length;
    }
}
