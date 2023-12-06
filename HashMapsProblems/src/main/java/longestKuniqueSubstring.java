import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class longestKuniqueSubstring {
    public static void main(String[] args){
        long[] a=new long[] {4, 1, 2, 1, 1, 2};
        long[] b=new long[] {3, 6, 3, 3};
        String  string="aabacbebebe";
        System.out.println(result2(string,3));

    }



    private static int result2(String s, int k) {  //---> O(n^m)
        int i=0,j=0;
        HashMap<Character,Integer> valueMap = new HashMap<>();
        HashSet<Character> coutMap= new HashSet<>();
        int n= s.length();
        while(i<n && j<n){
            if(valueMap.containsKey(s.charAt(j)) && coutMap.size()!=k){
                valueMap.put(s.charAt(j),valueMap.get(s.charAt(j))+1);
                coutMap.add(s.charAt(j));
                j++;
            } else if (!valueMap.containsKey(s.charAt(j)) && coutMap.size()<k) {
                valueMap.put(s.charAt(j),1);
                coutMap.add(s.charAt(j));
                j++;
            } else {
               // System.out.println(s.charAt(i));
                if(j!=n) {
                    valueMap.put(s.charAt(i),valueMap.get(s.charAt(i))-1);
                    if (valueMap.get(s.charAt(i)) == 0) {
                        coutMap.remove(s.charAt(i));
                    }
                    i++;
                }
            }
        }
      //   System.out.println("length of j "+j+"length of i "+i);

        return coutMap.size()==k?j-i:-1;
    }

}
