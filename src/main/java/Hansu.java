import java.util.Scanner;

public class Hansu { //1065번 등차수열, 즉 연속하는 두 항의 차이가 모두 일정한 수열을 의미한다.
    public static void main(String[] args){ // 1 ~ 99 의 경우 그 수 자체가 수열이다.
        Scanner sc = new Scanner(System.in);
        System.out.println(sequence(sc.nextInt()));
    }
    public static int sequence(int num){
        int cnt = 0;

        if(num < 100){ // 카운트를 세어서 넘겨줘도 되지만 예를들어 86이 들어오면 1~86까지는 모두 수열이기 때문에 그값을 리턴해줘도 된다.
            return num;
        }
        else{ // 100이상의 수
            cnt = 99; // 100이상의 수는 수열 99개를 가지고 시작하는 거랑 똑같다.
//            if(num == 1000){
//                num = 999; // 1000이상은 받지 않기때문에 1000일 경우 999로 바꿔준다.
//            }
            for(int i=100; i<=num; i++){
                int hun = i/100; // 백의 자리수
                int ten = (i/10)%10; // 십의 자리수
                int one = i % 10;

                if((hun - ten) == (ten - one)){ // 각 자릿수가 수열을 이루면
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
