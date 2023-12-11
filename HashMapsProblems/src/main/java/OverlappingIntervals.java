import javafx.util.Pair;

import java.util.*;

class pair{
    int first,second;

    // constructor for assigning values
    pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
public class OverlappingIntervals {

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,3},{2,4},{4,8},{9,10}};
        int[] b = new int[]{20,47,20,5,125,154,555,32,324};
        String string = "aabacbebebe";
        System.out.println(overlappedIntervalt(a));

    }

    private static int[][] overlappedIntervalt(int[][] a) {
        List<pair> pairList=new ArrayList<>();
        for (int[] entry : a) {
            pair tempPair=new pair(entry[0],entry[1]);
            pairList.add(tempPair);
        }
        Collections.sort(pairList, Comparator.comparing(p -> p.first));
        Stack<pair> resultStack = new Stack<>();
        for (pair entry : pairList) {
            if(resultStack.isEmpty())
                resultStack.push(entry);
            else if(resultStack.peek()==entry)
                continue;
            else if((resultStack.peek().first)<=entry.first && resultStack.peek().second>=entry.first )
            {
                if(resultStack.peek().second<=entry.second){
                    pair pairArray=new pair(resultStack.peek().first,entry.second);
                    resultStack.pop();
                    resultStack.push(pairArray);
                }

            }
            else {
                resultStack.push(entry);
            }
        }
        int count=0;
        int[][] solution = new int[resultStack.size()][2];
        for (pair entry : resultStack) {
            solution[count][0]=entry.first;
            solution[count][1]=entry.second;
            count=count+1;
        }
        return solution;
    }

}
