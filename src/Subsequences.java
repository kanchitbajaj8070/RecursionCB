import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        System.out.println(subsequences("abc"));
    }
    public static ArrayList<String> subsequences( String unprocessed)
    {
            if(unprocessed.length()==0||unprocessed.isEmpty())
            {
                ArrayList<String> baseresult= new ArrayList<>();
                baseresult.add("");
                return baseresult;
            }
        char currentCharacter=unprocessed.charAt(0);
        String restOfString=unprocessed.substring(1);
        ArrayList<String > finalResult= new ArrayList<>();
        ArrayList<String> recursionResult= subsequences(restOfString);
        for(String a : recursionResult)
        {
            finalResult.add(a);
            finalResult.add( currentCharacter+ a);

        }
        return finalResult;
    }
}
