
public class SelfNumber { // 4673 셀프넘버 문제
                            // 자릿수 구하는 부분 볼 것
    static public void main(String[] args) {
        boolean[] check = new boolean[10001];

        for(int i=0; i<10001; i++){
            int n = d(i);

            if(n<10001){
                check[n] = true; // 생성자가 있는 수는 true로 바꿔줌
            }
        }
        for(int i=0; i<10001; i++){
            if(!check[i]){ // false인 경우가 셀프넘버 즉 생성자가 없는 수이다.
                System.out.println(i);
            }
        }

    }
    public static int d(int n){
        int sum = n;

        while (n != 0){ // 0이 되기까지 모든 자리 수를 구하기 위해 반복
            sum = sum + (n % 10);  // 원래수와 첫째 자리수 더하기
            n = n/10; // 첫째 자리수를 없앤다 예를들어 1873 일때 위에서 3을 구한후 십의자리인 7을 구하기 위해 187을 만들어주는 것이다.
        }
        return sum; // return으로 나가는 수는 생성자가 있는 수이다.


    }
}

