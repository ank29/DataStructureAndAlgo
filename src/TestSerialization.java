import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class TestSerialization {
    public static void main(String args[]) throws  Exception{
        ArrayList<Person> personArrayList = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream("/data/File.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            for (;;) {
                try{
                Person person = (Person) objectInputStream.readObject();
                System.out.println(person);
                personArrayList.add(person);
            }
            catch (Exception e){
                }
            }



    }
}
