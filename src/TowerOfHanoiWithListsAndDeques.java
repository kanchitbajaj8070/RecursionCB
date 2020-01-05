import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TowerOfHanoiWithListsAndDeques {
    public static void main(String[] args) {
        List<Deque<Integer>> towers= new ArrayList<>();
        //0 for src ,1 for destination and 2 for auxillary;
        for (int i = 0; i <3 ; i++) {
        towers.add( new LinkedList<Integer>());
        }
        int n=4;
        for(int i=0;i<n  ;i++)
        {
            towers.get(0).addLast(i+1);
        }
        towerOfHanoi( 3, towers,0,1,2);
    }

    private static void towerOfHanoi(int n, List<Deque<Integer>> towers, int src, int dest, int auxillary) {
    if(n<=0)
        return;
    towerOfHanoi(n-1,towers,src,auxillary,dest);
    towers.get(dest).addFirst(towers.get(src).removeFirst());
    System.out.println("Move "+ n + " from "+ src + "   to  "+ dest
        +"\n"+ towers.get(0)+"\n"+ towers.get(1)+"\n"+ towers.get(2));
    towerOfHanoi(n-1,towers,auxillary,dest,src);

    }
}
