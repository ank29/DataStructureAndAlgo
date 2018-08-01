import java.util.Arrays;

public class UnitBalance {
    public static void convertor(String a,String b,String c){
        String[] i = c.split("=")[1].split(" ");
        String[] j = b.split("=")[1].split(" ");
        String[] p1 = a.split("=")[1].split(" ");
        int p2 = Integer.parseInt(p1[1])* Integer.parseInt(j[1]);
        int p3 = p2* Integer.parseInt(i[1]);
        System.out.println(a+" = "+p2+j[2]+" = "+p3+i[2]);

    }
    public static void main(String args[]){
        String a = "1 kg = 1000 grams";
        String b = "1 grams = 1000 miligrams";
        String c = "1 minute = 60 seconds";
        convertor(a,b,c);
    }
}
