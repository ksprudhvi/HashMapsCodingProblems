import java.util.HashMap;
import java.util.HashSet;

public class SmallestDistinctWindow {

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,3},{2,4},{4,8},{9,10}};
        int[] b = new int[]{20,47,20,5,125,154,555,32,324};
        String string = "CCABBAbBCABB";
        System.out.println(returnResult2(string));

    }



    private static int returnResult2( String str) {
        HashMap<Character,Integer> strMap= new HashMap<>();
        for(int i=0 ;i<str.length();i++){
            if(!strMap.containsKey(str.charAt(i))){
                strMap.put(str.charAt(i),1);
            }
            else
            {
                strMap.put(str.charAt(i),strMap.get(str.charAt(i))+1);
            }
        }
        // System.out.println(strMap.size());
        int head=0,tail=0,uniqueCount=strMap.size(),ans=str.length();
        HashMap<Character,Integer> resultSet=new HashMap<>();
            while(head<str.length()) {
                if (!resultSet.containsKey(str.charAt(head))) {
                    resultSet.put(str.charAt(head), 1);
                } else {
                    resultSet.put(str.charAt(head), resultSet.get(str.charAt(head)) + 1);
                }
                if (resultSet.size() == uniqueCount) {
                    if ((head - tail) + 1 < ans) {
                        ans = (head - tail) + 1;
                    }
                    while (tail < head) {
                        resultSet.put(str.charAt(tail), resultSet.get(str.charAt(tail)) - 1);
                        if (resultSet.get(str.charAt(tail)) == 0)
                            resultSet.remove(str.charAt(tail));
                        tail++;
                        if (resultSet.size() == uniqueCount)
                            if ((head - tail) + 1 < ans) {
                                ans = (head - tail) + 1;
                            }
                        if (resultSet.size() < uniqueCount)
                            break;
                    }
                }
                head++;
            }
                return ans;
    }
}
