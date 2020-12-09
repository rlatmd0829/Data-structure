import java.util.Scanner;

public class number { // 2577 %10으로 일의자리수를 구한다음 10으로 나눠준후 반복하는방법이 있고
    // 문자열로 바꿔주는 방법이 있다.
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int arr[] = new int[10];
        int abc = A*B*C;
        while (abc>0){
            arr[abc%10]++;
            abc /= 10;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
