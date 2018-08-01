import java.util.Arrays;

public class ReverseString {
    public static String reverseString(char[] ar,int l,int h){
        if(l < h){
            char t = ar[l];
            ar[l] = ar[h];
            ar[h] = t;
           return reverseString(ar,l+1,h-1);
        }
        else {
            return new String(ar);
        }
    }
    public static void main(String args[]){
        String string = "pots&pans";
        String reversedString = "snap&stop";
        String isPallindrome = "racecar";
        String revese = reverseString(string.toCharArray(),0,string.length()-1);
        String reversedforPallindrome  = reverseString(isPallindrome.toCharArray(),0,isPallindrome.length()-1);
        if(reversedString.equals(revese))
            System.out.println("are anagrams");
        if(reversedforPallindrome.equals(isPallindrome))
            System.out.println("is pallindrome");
    }
}
