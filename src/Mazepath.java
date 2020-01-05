import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

import java.util.ArrayList;

public class Mazepath {
    public static void main(String[] args) {
        System.out.println(getMazePath(0,0,2,2));
    }

    public static ArrayList<String> getMazePath(int cc, int cr, int ec, int er)
    {
        if(cc==ec&&cr==er)
        {
            ArrayList <String> br= new ArrayList<>();
            br.add("");
            return br;
        }
        if(cc>ec||cr>er)
        {
            return new ArrayList<>();//like returning null result
            //no element no for loop no result
        }
        ArrayList<String> finalres= new ArrayList<>();
        ArrayList<String> hr = getMazePath(cc+1,cr,ec,er);
        for(String e: hr)
        {
            finalres.add("H"+e);
        }
        ArrayList<String> vr= getMazePath(cc,cr+1,ec,er);
        for(String e:vr)
        {
            finalres.add("V"+e);
        }
        return finalres;
    }
}
