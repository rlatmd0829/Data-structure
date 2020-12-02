import java.io.*;
import java.util.Stack;

public class Reverse2 { // 17413 단어뒤집기2 문제, 여기는왜 StringBuilder랑 맨뒤에 개행문자 안넣어주냐
                        // 거의 복붙이라 다시 봐야함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();


        String input = br.readLine();
        boolean tag = false; // tag안인지 밖인지 확인할 flag 생성
        //input += "\n";
        StringBuilder sb = new StringBuilder("");

            for(int j=0; j<input.length(); j++){
                if(input.charAt(j) == '<'){ // 태그 실행일때
                    tag = true; //tag 안인지 확인하는 flag를 true로 바꿈
                    printStack(bw,stack); // stack에 쌓인 단어들을 스택이 빌때까지 비워준다.
                    bw.write(input.charAt(j)); // < 태그 출력
                }
                else if(input.charAt(j) == '>'){ // 태그 종료일때
                    tag = false;
                    bw.write(input.charAt(j)); // > 태그 출력
                }
                else if (tag){ // 태그 안일경우
                    bw.write(input.charAt(j)); // 그 단어 뒤집지 않고 그대로 출력
                }
                else{ // 태그 바깥일 경우
                    if(input.charAt(j)==' '){ // 공백이면
                        printStack(bw,stack); // 그동안 stack에 쌓인 단어들을 스택이 빌 때 까지 비워준다.
                        bw.write(input.charAt(j)); // 공백 출력
                    }
                    else{ // 공백이 아니면
                        stack.push(input.charAt(j)); // 스택에 넣어준다.
                    }
                }


            }
            //반복이 끝나고 마지막일 경우
            printStack(bw,stack);
            // 그동안 stack에 쌓인 단어들을 스택이 빌 때 까지 비워준다.
            // 마지막에 다 넣어서 pop 해주는 과정이 있어서 개행문자랑 StringBuilder가 필요없는건가???????

        br.close();
        bw.flush();
        bw.close();



    }

    private static void printStack(BufferedWriter bw, Stack<Character> stack)throws IOException{
        while (!stack.isEmpty()){ // 스택에 쌓인 단어들 모두 출력하는 함수, 여러번 필요해서 함수로 분리
            bw.write(stack.pop());
        }
    }
}
