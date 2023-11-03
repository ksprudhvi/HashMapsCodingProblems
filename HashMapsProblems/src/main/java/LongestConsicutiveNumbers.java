import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeArray.sort;

public class LongestConsicutiveNumbers {
    public static void main(String[] args){
        int[] a=new int[] {42,37,35,14,17,10,50,20,44,13,4,33,12,28,7,36,46,22,26,21,47,18,31,2,5,34,9,45,16,32,48,19,11,29,27,39,8,49,43};
        String  string="wwpyedwrebkbvmvkvvesansqszwtrknvehhgdiqnhietykcgujlclwgyluryjfiaeelhefputiuxtbaedbtlzegpwhmiloosqefh";
        System.out.println(result(a,39));

    }
    /*Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.


            Example 1:

    Input:
    N = 7
    a[] = {2,6,1,9,4,5,3}
    Output:
            6*/
    private static int result(int arr[], int N) {

        Arrays.sort(arr);
        int secondmax;
        int max;
        int count =1;
        int maxCount=1;
        for(int i=0;i<N-1 ;i++){
            secondmax=arr[i];
            max=arr[i+1];
            if(max-secondmax>1){
                if(count>maxCount)
                maxCount=count;
                 count=1;
            }else if(max-secondmax==0)
                continue;
            else
             count++;
        }

        return maxCount>count?maxCount:count;
    }






}
