package org.example;

import java.util.*;

public class Firstnonrepeatingcharacterinastream {

    public static void main(String[] args){
        int[] a=new int[] {4,-16,43,4,7,-36,18};
        String  string="wwpyedwrebkbvmvkvvesansqszwtrknvehhgdiqnhietykcgujlclwgyluryjfiaeelhefputiuxtbaedbtlzegpwhmiloosqefh";
        System.out.println(result(string));

    }

    private static String result(String string) {
       String result="";
      // result=result+string.charAt(0);
        //Input: A = "aabc"
        //Output: "a#bb"
        HashSet<Character> r= new HashSet();
        Queue<Character> nrq = new  LinkedList<>();
       // valueQueue.peek()

       // System.out.println(valueQueue.toString());
     //   valueQueue.remove('b');
       // System.out.println(valueQueue.toString());

        for(int i=0 ;i<string.length();i++){
            if(nrq.contains(string.charAt(i))){
                nrq.remove(string.charAt(i));
                if(!r.contains(string.charAt(i))){
                    r.add(string.charAt(i));
                }
                if(nrq.isEmpty())
                    result=result+"#";
                else
                    result=result+nrq.peek();
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
}
