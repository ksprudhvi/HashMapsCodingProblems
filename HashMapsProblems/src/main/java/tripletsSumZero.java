import java.util.*;
public class tripletsSumZero {

        public static void main(String[] args){
           // Scanner sc=new Scanner(System.in);
           // int t=sc.nextInt();
            /*while(t-->0){
                int n=sc.nextInt();
                int[] a=new int[n];
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
               // Solution g=new Solution();
                if(findTriplets(a,n))
                    System.out.println("1");
                else
                    System.out.println("0");

            }*/
            int[] a=new int[] {4,-16,43,4,7,-36,18};
           // findTripletsHashMap(a,5);
            if(findTripletsHashMap(a,7))
                System.out.println("1");
            else
                System.out.println("0");
        }

    public  static boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        //brute force O(n3)
        for (int i=0 ; i<=n-3 ;i++)
            for(int j=i+1 ; j<=n-2 ;j++)
                for(int k=j+1 ; k<=n-1 ;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                        return true;
                }
        return false;
    }
    public  static boolean findTripletsHashMap(int arr[] , int n)
    {
        //add code here.
        //brute force O(n3)
        HashMap<Integer, Integer> valueMap= new HashMap<>();
        //using HashMaps O(n2)
        Boolean found = false;
        for (int i=0 ; i<n-1 ;i++) {
            for (int j = i + 1; j < n ; j++) {
                if (valueMap.containsKey((arr[i] + arr[j]) * -1)) {
                    found = true;
                    break;
                } else {
                    valueMap.put(((arr[j])), 1);
                }
            }
            if (found) break;
        }
        return found;
    }
}
