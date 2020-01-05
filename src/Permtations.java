import java.util.ArrayList;

public class Permtations {
    public static void main(String[] args) {
        System.out.println(getPermutations("abcdefg"));
    }
    public static ArrayList<String> getPermutations(String unprocessed)
    {
        if(unprocessed.length()==0)
        {
            ArrayList<String> baseres= new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        char c= unprocessed.charAt(0);
        ArrayList<String> finalResult= new ArrayList<>();
        // this is made to give the next level result after modifying current levels result
        ArrayList<String> recursionResult=getPermutations(unprocessed.substring(1));
        for(int i=0;i<recursionResult.size();i++)
        {
            String elementToModify= recursionResult.get(i);
            for(int j=0;j<=elementToModify.length();j++)
            {
                    finalResult.add(elementToModify.substring(0,j)+c+elementToModify.substring(j));

                }

        }
        return finalResult;
    }
}
