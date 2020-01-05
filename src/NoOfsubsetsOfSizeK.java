import java.util.ArrayList;

public class NoOfsubsetsOfSizeK {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        boolean visited[] = new boolean[arr.length];
        generateSubsets(arr, visited, k, 0, 0);

    }

    private static void generateSubsets(int[] arr, boolean[] visited, int k, int curlength, int idx) {

        if(curlength==k) {
            for (int i = 0; i < visited.length; i++) {
                if (visited[i] == true)
                    System.out.print(arr[i] + "   ");
            }
            System.out.println();
            return;
        }
        if(idx>=arr.length)
            return;
        visited[idx]=true;
        generateSubsets(arr,visited,k,curlength+1,idx+1);
        visited[idx]=false;
    generateSubsets(arr,visited,k,curlength,idx+1);

    }
}
