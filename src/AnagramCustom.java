import java.util.Arrays;

public class AnagramCustom {
    static int anagramCustom(String n,String m){
        if(n.length() == 0 || m.length() == 0 || (n.length() != m.length()))
            return -1;
        else{
            char[] a = n.toUpperCase().toCharArray();
            char[] b = m.toUpperCase().toCharArray();
            int[] t = new int[26];
            for(int i =0;i<a.length ;i++){
                t[a[i]-65 ]++;
                t[b[i]-65 ]--;
            }
            int count = 0;
            for(int i =0;i<t.length;i++){
                if(t[i] != 0)
                    count ++;
            }
            System.out.println(count);
            if(count == 0)
                return count;
            else return count/2;
        }
    }

    public static void main(String args[]){
        String a = "apt";
        String b = "p";
        int result = anagramCustom(a,b);
        System.out.println(result);
    }
}
