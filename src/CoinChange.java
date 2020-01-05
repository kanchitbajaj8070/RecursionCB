import java.util.ArrayList;

public class CoinChange {

    public static void main(String[] args) {
        int[]a={2,3,5,6};
        System.out.println(getCombinations(a,10,"",0));
    }
    public static ArrayList<String> getCombinations(int []a, int sum,String ans,int j)
    {
        if(sum==0)
        {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        if(sum<0)
            return new ArrayList<>();
    ArrayList<String> myresult=new ArrayList<>();
        for (int i = j; i < a.length; i++) {
            if(a[i]>sum)
                break;
            ArrayList<String > rr= getCombinations(a,sum-a[i],ans+a[i],i);
            for(String e: rr)
            myresult.add(a[i]+e);
        }
        return myresult;
    }

}
