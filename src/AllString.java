public class AllString {
    public static void allString(String a, String b) {
        if (a.length() == 0)
            System.out.println(b);
        else {
            for (int i = 0; i < a.length(); i++) {
                allString(a.substring(0, i) + a.substring(i + 1, a.length()), b + a.charAt(i));
            }
        }
    }

    public static void allSet(String s, String t) {
        if (t.length() > 0) {
            System.out.print(t + " ");
        }
        if (s.length() > 0) {
            for (int i = 0; i < s.length(); i++) {
                allSet(s.substring(i + 1, s.length()), t + s.charAt(i));
            }
        }
    }


    public static void main(String args[]){
        String a = "SAMO";
        String t  = "";
        allString(a,t);
//        allSet(a,t);
    }
}
