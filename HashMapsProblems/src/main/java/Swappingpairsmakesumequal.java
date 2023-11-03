import java.util.Arrays;
import java.util.HashMap;

public class Swappingpairsmakesumequal {

    public static void main(String[] args){
        long[] a=new long[] {4, 1, 2, 1, 1, 2};
        long[] b=new long[] {3, 6, 3, 3};
        String  string="wwpyedwrebkbvmvkvvesansqszwtrknvehhgdiqnhietykcgujlclwgyluryjfiaeelhefputiuxtbaedbtlzegpwhmiloosqefh";
        System.out.println(result2(a,b,6,4));

    }

    private static int result(long a[],long b[],int n, int m) {  //---> O(n^m)

        long suma= Arrays.stream(a).sum();
        long sumb= Arrays.stream(b).sum();
        for(int i=0 ;i<n ;i++){
            for(int j=0;j<m ;j++){
                if(suma-a[i]+b[j]==sumb+a[i]-b[j]){
                    return 1;
                }
            }
        }
       return -1;
    }


    private static int result2(long a[],long b[],int n, int m) {  //---> O(n^m)

        long suma= Arrays.stream(a).sum();
        long sumb= Arrays.stream(b).sum();
        long target ;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        if((suma-sumb)%2==0)
            target=(suma-sumb)/2;
        else
            return -1;
        while(i<n && j<m){
            if(a[i]-b[j]==target){
                    return 1;
            } else if (a[i]-b[j]<target) {
                    i++;
                }else  {
                    j++;
                }

        }
        return -1;
    }
}
