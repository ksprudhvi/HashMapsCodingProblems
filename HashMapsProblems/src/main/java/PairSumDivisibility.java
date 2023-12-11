import java.util.Arrays;
import java.util.HashMap;

public class PairSumDivisibility {


    public static void main(String[] args) {
        int[] a = new int[]{13,1,9,3,1,14,5,2,12,7,10,4,7,5,13,5,6,6,3,11,2,9};
        int[] b = new int[]{20,47,20,5,125,154,555,32,324};
        String string = "aabacbebebe";
        System.out.println(resultMain(a, 5));

    }

    private static boolean resultMain(int[] a, int k) {

        HashMap<Integer,Integer> modMap=new HashMap<>();
        for (int entry : Arrays.stream(a).toArray()) {
            if(modMap.containsKey(entry%k))
                modMap.put(entry%k,modMap.get(entry%k)+1);
            else
                 modMap.put(entry%k,1);
        }
        for (Integer i : modMap.keySet()) {
            if(i==0 && modMap.get(0)%2==0 ) {
                if(modMap.get(0)%2==0)
                     continue;
                else return false;
            }
            else if(modMap.get(i)==modMap.get(k-i)){
               continue;
            }
            else  return false;
        }
        return true;
    }
}
