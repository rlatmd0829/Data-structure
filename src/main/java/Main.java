import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[][] board = 	{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int [] moves =	{1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(board, moves));


    }

    public static int solution(int[][] board, int[] moves) {
        int answer=0;
        Stack<Integer> stack = new Stack<Integer> ();
        for(int i=0; i<moves.length; i++){
            int select = moves[i];
            for(int j=0; j<board.length; j++){
                if(board[j][select-1] == 0){
                    continue;
                }
                else{

                    if(!stack.isEmpty() && (stack.peek() == board[j][select-1])){
//                        System.out.println(i);
//                        System.out.println(j);
//                        System.out.println(select-1);
                        stack.pop();
                        board[j][select-1] = 0;
                        answer=answer+2;
                        break;

                    }
                    else{
                        stack.push(board[j][select-1]);
                        board[j][select-1] = 0;
                        break;
                    }
                }
            }
        }

        return answer;
    }
    
}
