import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCharString {
    void getDuplicateCharHashmap(String testString){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        String test = testString.toLowerCase();
        for(int i =0;i<test.length();i++){
            if(map.containsKey(test.charAt(i))) {
                System.out.println("Duplicate char is ::" + test.charAt(i));
                map.put(test.charAt(i),map.get(test.charAt(i))+1);
            }
            else map.put(test.charAt(i),1);
        }

      Optional<Character> testCharacter = map.keySet().stream().findFirst();
        testCharacter.ifPresent(testt -> System.out.print("here"));

    }
    void getDuplicateChar(String testString){
        String test = testString.toLowerCase();
        int[] testArray = new int[26];
        for(int i =0;i<test.length();i++){
            testArray[test.charAt(i) - 97] ++;
        }
        for(int i =0;i<testArray.length;i++){
            if(testArray[i] > 1) {
                int t = i+97;
                System.out.println(Character.toString((char)t));
            }
        }

    }
    public String Encryption(String encryptionString) {
        StringBuffer hexString = new StringBuffer();

        byte[] defaultBytes = encryptionString.getBytes();
        try {
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(defaultBytes);
            byte messageDigest[] = algorithm.digest();

            for (int i = 0; i < messageDigest.length; i++) {
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            }
        } catch (NoSuchAlgorithmException nsae) {
        }

        return hexString.toString();
    }



    public static void main(String args[]){
        String string = "Ankita";
        DuplicateCharString duplicateCharString = new DuplicateCharString();
        duplicateCharString.getDuplicateCharHashmap(string);
        duplicateCharString.getDuplicateChar(string);



    }
}
