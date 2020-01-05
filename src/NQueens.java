import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Set;

public class NQueens {
        public static void main(String[] args) {
            int[][] board= new int[4][4];
            int n=4;
           solveNqueens(board,n,0);

    }

    public static boolean isSafe(int[][] board , int r, int c)
    {
        for (int i = 0; i < board.length; i++)
        {
            if(board[r][i]==1)
                return false;
        }
        for (int i = 0; i <board.length ; i++) {
            if(board[i][c]==1)
                return false;
        }
        int i=r;
        int j=c;
        while(i>=0&&j>=0)
        {
            if(board[i][j]==1)
                return false;
            i--;
            j--;
        }
        i=r;
        j=c;
        while(i>=0&&j<board.length)
        {
            if(board[i][j]==1)
                return false;
            i--;
            j++;
        }

        return true;

    }

        public static void solveNqueens(int[][] board , int n, int j)
        {
                if(j==n)
                {
                    printBoard(board);
                    return;
                }
            for (int k = 0; k < board.length; k++) {
                if(isSafe(board,j,k)) {
                    board[j][k] = 1;
                    solveNqueens(board, n, j + 1) ;
                    board[j][k]=0;
                }
            }
            return ;
        }

    private static void printBoard(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board.length ; j++) {
                if(board[i][j]==1)
                System.out.print("Q     ");
                else
                    System.out.print("-     ");

            }
            System.out.println();
        }
        System.out.println("------------------");
        }

}



