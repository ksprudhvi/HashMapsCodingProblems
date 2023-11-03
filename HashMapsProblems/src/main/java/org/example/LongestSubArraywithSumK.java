package org.example;

import java.util.Arrays;
import java.util.HashMap;

import static java.util.Collections.max;

public class LongestSubArraywithSumK {
    public static void main(String[] args){
        int[] a=new int[] {10,5,2,7,1,6,2,1,3,2};
        String  string="wwpyedwrebkbvmvkvvesansqszwtrknvehhgdiqnhietykcgujlclwgyluryjfiaeelhefputiuxtbaedbtlzegpwhmiloosqefh";
        System.out.println(result2(a,10,15));

    }
    /*Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.



            Example 1:


    Input :
    A[] = {10, 5, 2, 7, 1, 9}
    K = 15
    Output : 4
    Explanation:
    The sub-array is {5, 2, 7, 1}.*/
    private static int result(int arr[], int N,int k) {  //---> O(n^2)

        int cs=0;
        int count =0;
        int maxCount=0;
        for(int j=0 ;j<N;j++)
        {
            cs=0;
            count=0;
            for(int i=j;i<=N-1 ;i++){
                cs=arr[i]+cs;
                count++;
                if(cs==k && maxCount<count){
                    maxCount=count;
                }
            }

        }
        return maxCount;
    }

    private static int result2(int arr[], int N,int k) {  //---> O(n)

        HashMap<Integer,Integer> m = new HashMap<>();

        m.put(0,-1);
        Integer sum=0, maxi=0;
        for(int i=0; i<N; i++) {
            sum += arr[i];
            if(m.containsKey(sum-k)){
                maxi=maxi>(i-m.get(sum-k))?maxi:i-m.get(sum-k);
            }
            if(!m.containsKey(sum)){
                m.put(sum,i);
            }
        }
        return maxi;
    }

}
