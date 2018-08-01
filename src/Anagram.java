
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fundsindia
 */
public class Anagram {
    static boolean isAnagram(String f,String s){
      
       String a = f.toLowerCase();
       String b = s.toLowerCase();
       if(a == null || a.isEmpty() || b == null || b.isEmpty())
           return false;
       else if(a.length() != b.length())
           return false;
       else{
           char[] charA = a.toCharArray();
           char[] charB = b.toCharArray();
           Arrays.sort(charA);
           Arrays.sort(charB);
           for(int i = 0;i<charA.length;i++){
               if(charA[i] != charB[i])
                 return false;
           }
           return true;
       }
    
    }
    
      static boolean isAnagramBest(String f,String s){
      
       char[] charA = f.toLowerCase().toCharArray();
       char[] charB = s.toLowerCase().toCharArray();
       if(f == null || f.isEmpty() || s == null || s.isEmpty())
           return false;
       else if(f.length() != s.length())
           return false;
       else{
            int[] count = new int[26];
            for(int i = 0;i<charB.length;i++){
                count[charA[i]-97] ++;
                count[charB[i]-97] --;
            } 
            for(int i =0;i<charA.length;i++){
                if(count[i]!= 0)
                    return false;
            }
            return true;
       }
    
    }
    public static void main(String args[]){
     String first = "Ankita";
     String second = "nakati";
     if(isAnagramBest(first,second))
         System.out.println("is anagram");
     else
       System.out.println("is Not anagram");
    }
}
