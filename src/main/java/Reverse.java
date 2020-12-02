
import java.io.*;
import java.util.Scanner;
import java.util.Stack;


public class Reverse {  //  9093 단어뒤집기 배껴서 맞춤 buffered에 대해서 공부하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nStr = br.readLine();
        Stack<Character> stack = new Stack<>();

        String input = "";
        int T = Integer.parseInt(nStr);

        for(int i=0; i<T; i++){
            input = br.readLine();
            input += '\n';
            StringBuilder sb = new StringBuilder("");
            //String sb="";    // 그냥 String으로 하는 방법이 있고 StringBuilder를 사용하는 방법이 있다.
                             // 기본 String을 사용하면 매모리 할당과 해제를 발생시켜며 더하는 연산이 많아질수록 성능이 안좋아진다.
                             // 그래서 StringBuilder를 사용하는게 성능적으로 좋다. append를 사용하여 더해준다.

            for(int j=0; j<input.length(); j++){

                if(input.charAt(j) == ' ' || input.charAt(j) == '\n'){
                    while (!stack.empty()){
                        sb.append(stack.peek());
                        //sb += stack.peek();
                        stack.pop();
                    }

                    if(input.charAt(j) == ' '){
                        sb.append(input.charAt(j));
                        //sb += input.charAt(j);
                    }
                }
                else{
                    stack.push(input.charAt(j));
                }
            }
            bw.write(sb.toString()+"\n");
            // toString은 객체가 가지고있는 정보를 문자열로 출력한다.
        }
        br.close();
        bw.flush();
        bw.close();



    }
}

