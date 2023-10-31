package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Firstnonrepeatingcharacterinastream {

    public static void main(String[] args){
        int[] a=new int[] {4,-16,43,4,7,-36,18};
        String  string="aabc";
        System.out.println(result(string));

    }

    private static String result(String string) {
       String result="";
      // result=result+string.charAt(0);
        //Input: A = "aabc"
        //Output: "a#bb"
        String lastNonRepeatedChar="";
        HashSet<Character> nr= new HashSet();
        List<Character> nrList= new ArrayList<>();
        HashSet<Character> r= new HashSet();
        char l =string.charAt(0);
        for(int i=0 ;i<string.length();i++){
            if(nr.contains(string.charAt(i))){
                nr.remove(string.charAt(i));
                r.add(string.charAt(i));
                if(nr.isEmpty())
                    l='#';
                else
                    l= [0];
                if(!lastNonRepeatedChar.equals(string.charAt(i)))
            }else {
                if(lastNonRepeatedChar.equals(""))
                    lastNonRepeatedChar=""+string.charAt(i);
                if(!lastNonRepeatedChar.equals(string.charAt(i)))
                valueMap.add(string.charAt(i));
                result=result+lastNonRepeatedChar;

            }


        }

      return result ;
    }
}
