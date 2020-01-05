public class SudokoSolver {
    public static void main(String[] args) {

        int grid[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        int n=9;
        System.out.println(solveSudoko(grid,n));
    }
    public static Boolean isSafe( int[][] grid , int r ,int c,int element)
    {

        for (int i = 0; i <grid.length ; i++) {
            if(grid[r][i]==element)
                return false;
        }
        for (int i = 0; i < grid.length;i++) {
            if(grid[i][c]==element)
                return false;
        }
        int l1=r-r%3;
        int l2= c-c%3;
        for (int i = l1; i < l1+3; i++) {
            for (int j =l2; j < l2+3; j++) {
                if(grid[i][j]==element)
                    return false;
            }
        }
return true;
    }
    public  static boolean anyEmptyLocationLeft(int[][]board)
    {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]==0)
                    return true;
            }
        }
        return false;
    }
    public static int[] findUnassignedLocation(int[][] board)
    {
        int a[]= new int[2];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]==0)
                {
                    a[0]=i;
                    a[1]=j;

                }
            }
        }
    return a;
    }

    private static Boolean solveSudoko(int[][] grid, int n)
    {
        boolean islocleft=anyEmptyLocationLeft(grid);
        if(!islocleft)
        {
            printBoard(grid, n);
            return true;
        }
        int[] loc=findUnassignedLocation(grid);
        for (int k = 1; k <= 9; k++)
    {
        if (isSafe(grid, loc[0], loc[1], k) == true)
        {       grid[loc[0]][loc[1]] = k;
                boolean ans = solveSudoko(grid, n);
                if (ans == true)
                    return true;
                else
                grid[loc[0]][loc[1]] = 0;
            }
        }
return false;
    }

    private static void printBoard(int[][] grid, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  "+ grid[i][j]+" ");
            }
            System.out.println();
        }
    }

}
