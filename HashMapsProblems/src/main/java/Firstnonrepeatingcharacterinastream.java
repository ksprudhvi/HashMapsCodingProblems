import java.util.*;

public class Firstnonrepeatingcharacterinastream {

    public static void main(String[] args){
        int[] a=new int[] {4,-16,43,4,7,-36,18};
        String  string="wwpyedwrebkbvmvkvvesansqszwtrknvehhgdiqnhietykcgujlclwgyluryjfiaeelhefputiuxtbaedbtlzegpwhmiloosqefh";
        System.out.println(result2(string));

    }
/*    Given an input stream A of n characters consisting only of lower case alphabets. While reading characters from the stream, you have to tell which character has appeared only once in the stream upto that point. If there are many characters that have appeared only once, you have to tell which one of them was the first one to appear. If there is no such character then append '#' to the answer.

            NOTE:
            1. You need to find the answer for every i (0 <= i < n)
2. In order to find the solution for every i you need to consider the string from starting position till ith position.


    Example 1:

    Input: A = "aabc"
    Output: "a#bb"
    Explanation: For every ith character we will
    consider the string from index 0 till index i first non
    repeating character is as follow-
            "a" - first non-repeating character is 'a'
            "aa" - no non-repeating character so '#'
            "aab" - first non-repeating character is 'b'
            "aabc" - there are two non repeating characters 'b' and 'c',
    first non-repeating character is 'b' because 'b' comes before
'c' in the stream.*/
    private static String result(String string) {
       String result="";
      // result=result+string.charAt(0);
        //Input: A = "aabc"
        //Output: "a#bb"
        HashSet<Character> r= new HashSet();
        Queue<Character> nrq = new  LinkedList<>();

        for(int i=0 ;i<string.length();i++){
            if(nrq.contains(string.charAt(i))){
               // nrq.remove(string.charAt(i));// taking more   time O(n) ----> O(1);
                if(!r.contains(string.charAt(i))){
                    r.add(string.charAt(i));
                }
                    nrq.removeAll(r);
                    if(nrq.peek()==null ||nrq == null || nrq.isEmpty())
                        result=result+"#";
                    else
                    result = result + nrq.peek();
            }else {
                if(!r.contains(string.charAt(i)))
                    nrq.add(string.charAt(i));
                result=result+nrq.peek();
            }
            try{
        if(nrq!=null && nrq.peek()=='m'){
            System.out.println(i);
        }}
            catch(NullPointerException e)
            {
                System.out.print("NullPointerException Caught");
            }

        }

      return result ;
    }

    private static String result2(String string) {
        String result="";
        // result=result+string.charAt(0);
        //Input: A = "aabc"
        //Output: "a#bb"
        char freq[]= new char[26]; //'z'-'a'=25
        Queue<Character> nrq = new  LinkedList<>();
        for(int i=0 ;i<string.length();i++) {
            nrq.add(string.charAt(i));
            freq[string.charAt(i)-'a']++;
            while(!nrq.isEmpty() && freq[nrq.peek()-'a']>1)
                nrq.remove();
            if(nrq.peek() ==null)
                result=result+"#";
            else
            result=result+nrq.peek();
        }
        return result ;
    }
}
