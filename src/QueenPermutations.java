import java.util.Arrays;
import java.util.Queue;

public class QueenPermutations {
    public static void main(String[] args) {

        int[] board= new int[4];
        Arrays.fill(board,-1);
        //QueenPermutations(board,2,0,0);
        QueenCombinations(board,2,0,0,-1);
        System.out.println("count is ;-" +c);
        c=0;
    }


    public static void  QueenPermutations(int board[] , int queens ,int bloc, int qloc)
    {
        if(qloc==queens)
        { printBoard(board);
            return;
        }
        if(bloc>=board.length)
            return;

        for (int i = 0; i < board.length; i++) {
            if(board[i]==-1 ) {
                board[i] = qloc;
                QueenPermutations(board, queens, bloc + 1, qloc + 1);
                board[i]=-1;

            }

        }

    }
 static int c=0;
    private static void printBoard(int[] board) {
        c++;
        for (int i = 0; i < board.length; i++) {
            if (board[i] >= 0) {
                System.out.print(c+". "+"b" + i + "q" + board[i]+"     ");
            }
        }
        System.out.println();
    }

    public static void  QueenCombinations(int board[] , int queens ,int bloc, int qloc,int lbu)
    {
        if(qloc==queens)
        { printBoard(board);
            return;
        }
        if(bloc>=board.length)
            return;

        for (int i = lbu+1; i < board.length; i++) {
            board[i] = qloc;
            QueenCombinations(board, queens, bloc + 1, qloc + 1, i);
            board[i] = -1;
        }
    }
}
