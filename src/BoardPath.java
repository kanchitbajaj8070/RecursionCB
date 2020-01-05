import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

import java.util.ArrayList;

public class BoardPath {
    public static void main(String[] args) {
        System.out.println(secondWayPermutation(0,4));

    }
    public static ArrayList<String> getBoardPaths(int n,String ans)
    {
        if(n==0)
        {
            ArrayList<String> br= new ArrayList<>(0);
            br.add(ans);
            return br;
        }
        if(n<0)
            return new ArrayList<String>();
        ArrayList<String> myResult= new ArrayList<>();
        for (int i = 1; i <=6 ; i++) {
            if(i>n)
                continue;
            ArrayList<String> rr=getBoardPaths(n-i,ans+i);
            myResult.addAll(rr);
        }
        return myResult;
    }
    public static ArrayList<String> secondWayPermutation(int start, int end)
    {
     if(start==end)
     {
         ArrayList<String> br= new ArrayList<>();
         br.add("");
         return br;
     }
     if(start>end)
         return new ArrayList<>();
     ArrayList<String> finalres= new ArrayList<>();
        for (int i = 1; i <=6 ; i++) {
            ArrayList<String> rr= secondWayPermutation(start+i,end);
            for(String rrs:rr)
            {
                finalres.add(i+rrs);
            }
        }
return finalres;
    }
}
