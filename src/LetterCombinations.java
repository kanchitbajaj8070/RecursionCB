import java.util.ArrayList;

public class LetterCombinations {
    public static void main(String[] args) {
      /*  Input: "23"
        Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].*/
      LetterCombinations obj= new LetterCombinations();
      obj.printLetterCombinations("23","");
        System.out.println(obj.getLetterCombinations("23",""));
    }
    String [] combinations={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public void printLetterCombinations( String original, String ans)
    {
        if( original.isEmpty())
        {
            System.out.print(ans+"  ");
            return;
        }
        int cc= original.charAt(0)-'0';
        String ros=original.substring(1);
        for (int i = 0; i <combinations[cc].length() ; i++) {
        printLetterCombinations(ros,ans+combinations[cc].charAt(i));
        }
    }
    public ArrayList<String> getLetterCombinations(String original, String ans)
    {
        if( original.isEmpty())
        {
            ArrayList< String> br= new ArrayList<>();
            br.add(ans);
            return br;
        }
        int cc= original.charAt(0)-'0';
        String ros=original.substring(1);
        ArrayList<String > myresult= new ArrayList<>();
        for (int i = 0; i <combinations[cc].length() ; i++) {
            ArrayList<String> rr=getLetterCombinations(ros,ans+combinations[cc].charAt(i));
        myresult.addAll(rr);
        }
        return myresult;
    }
}
