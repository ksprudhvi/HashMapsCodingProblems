import java.util.HashMap;

public class zeroSumSubarrays {
    public static void main(String[] args){
        long[] a=new long[] {6,-1,-3,4,-2,2,4,6,-12,-7};
        String  string="wwpyedwrebkbvmvkvvesansqszwtrknvehhgdiqnhietykcgujlclwgyluryjfiaeelhefputiuxtbaedbtlzegpwhmiloosqefh";
        System.out.println(result2(a,10));

    }
    private static int result(int arr[], int N) {  //---> O(n)

        HashMap<Integer,Integer> m = new HashMap<>();

        m.put(0,-1);
        Integer sum=0, maxi=0,count=0;
        for(int j=0 ;j<N;j++)
        {
            for(int i=j;i<=N-1 ;i++){

            }

        }
        return count;
    }
    private static long result2(long arr[], int N) {  //---> O(n)

        HashMap<Long,Integer> m = new HashMap<>();
        Long sum=new Long(0);
        Long count=new Long(0);
        for(int i=0; i<N; i++) {
            sum += arr[i];
            if(sum==0){
                count++;
            }
            if(m.containsKey(sum)){
                count+=m.get(sum);
            }
            m.put(sum,m.containsKey(sum)?m.get(sum)+1:1);
        }
        return count.longValue();
    }

}
