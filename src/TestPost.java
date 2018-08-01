 class  Post {
   public void add(){System.out.println(6);}
   public void here(){
       System.out.println("in post");
   }
    }
 class PostSub extends Post{
    int a = 5;
    public void add(){System.out.println(a);}
     public void not(){
         System.out.println("in postSub");
     }
 }

public class TestPost{
    public static void main(String args[]) {
        Post post = new PostSub();
        post.add();


    }
}


//    public static StringBuffer replaceStringBuffer(StringBuffer sb, int pos, char[] chars) {
//        try {
//            sb.replace(pos, pos + chars.length, String.valueOf(chars));
//        } catch (Exception ex) {
//
//        }
//        return sb;
//    }
//    public  static String maskPan(String s) {
//        StringBuffer sb = new StringBuffer(s);
//        replaceStringBuffer(sb, 4, "*****".toCharArray());
//        return String.valueOf(sb);
//    }
//    public static void main(String args[]){
//        String a = "BLYPA9816N";
//        String b = maskPan(a);
//
//            System.out.println(b);
//    }
//}
//public static boolean isOEEnabled(String amcCode) {
//    boolean isOEEligible = false;
//    if (WIFSConstants.OE_AMCS.contains(amcCode))
//        isOEEligible = true;
//    return isOEEligible;
//
//}
//public static void main(String args[]){
//    TestPost testPost = new TestPost();
//    testPost.a = 5;
//    System.out.println(a);
//    TestPost testPost1 = new TestPost();
//    testPost1.a = 9;
//    System.out.println(testPost.a);
//    System.out.println(testPost1.a);
//    System.out.println(a);
//    int amcCode = 400015;
//    if(isOEEnabled(String.valueOf(amcCode)))
//        System.out.println("yes");





//    static int binarySearch(int x, int r, int h, int[] a) {
//        while (h >= r) {
//            int m = (r + (h - r)) / 2;
//            if (a[m] == x)
//                return m;
//            else if (a[m] < x)
//                r = m + 1;
//            else
//                h = m - 1;
//
//        }
//        return -1;
//    }
// Class Node { Node next; int data; Node(int data){this.data = data}
// }
// LinkList{
// Node head;
// }
//
//    public static void main(String args[]) {
//        String s = "12:08:08PM";
//        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9};
//        int index = binarySearch(4, 0, arr.length - 1, arr);
//        if (index == -1)
//            System.out.println("not found");
//        else
//            System.out.println("element found at index " + index);
//
//        if (s.substring(s.length() - 2, s.length()).equalsIgnoreCase("pm")) {
//            String time = Integer.toString(Integer.parseInt(s.substring(0, 2)) + 12);
//            if (time.equalsIgnoreCase("24"))
//                time = "00";
//            System.out.println(time + s.substring(2, s.length() - 2));
//        }
//    }
//}

