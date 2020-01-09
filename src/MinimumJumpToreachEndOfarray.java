import java.util.Arrays;

public class MinimumJumpToreachEndOfarray {
    public static void main(String[] args) {
        int []a={2,3,1,1,4};
        int[] dp=new int[a.length];
        Arrays.fill(dp,-1);
        System.out.println(solvememo(a,a.length,0,dp));
    }
    public static  int solve( int[]a,int n,int i)
    {
    if( i>=n-1)
        return 0;

    int result=Integer.MAX_VALUE;
        for (int j = i+1; j <=i+a[i] ; j++) {
            int rr_ans=solve(a,n,j);
                result=Math.min(result,rr_ans+1);
        }
        return result;
    }
    public static  int solvememo( int[]a,int n,int i,int [] dp)
    {
        if( i>=n-1)
            return 0;
        if( dp[i]!=-1)
            return dp[i];
        int result=Integer.MAX_VALUE;
        for (int j = i+1; j <=i+a[i] ; j++) {
            int rr_ans=1+solvememo(a,n,j,dp);
            result=Math.min(result,rr_ans);
        }
        dp[i]=result;
        return result;
    }
}
