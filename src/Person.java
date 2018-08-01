//import java.util.Date;
//import java.util.*;
//
//public class Person {
//
//    public enum Sex {
//        MALE, FEMALE
//    }
//
//    String name;
//    Date birthday;
//    Sex gender;
//    String emailAddress;
//    int age;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void printPerson() {
//
//    }
//    public static List<Person> getPersion(List<Person> personList,int lowage,int maxage){
//        List<Person> list = new ArrayList<>();
//        for(Person person:personList){
//            if(person.age >= lowage && person.age<maxage){
//                Person person1 = new Person();
//                list.add(person1);
//            }
//        }
//        return list;
//
//    }
//}
//singleton
//Public class EageInitializationSingleton{
//    private static final EageInitializationSingleton eagerInitialized = new EageInitializationSingleton();
//    private EageInitializationSingleton(){}
//    public static EageInitializationSingleton getInstance() {
//        return eagerInitialized;
//    }
//
//}
//Public class StaticBlockInitializationSingleton{
//    private static  StaticBlockInitializationSingleton eagerInitialized;
//    static {
//        eagerInitialized = new StaticBlockInitializationSingleton();
//    }
//    private StaticBlockInitializationSingleton(){}
//    public static StaticBlockInitializationSingleton getInstance() {
//        return eagerInitialized;
//    }
//
//}
//Public class LazyInitializationSingleton {
//    private static LazyInitializationSingleton eagerInitialized;
//
//    private LazyInitializationSingleton() {
//    }
//
//    public static LazyInitializationSingleton getInstance() {
//        if (eagerInitialized == null)
//            eagerInitialized = new LazyInitializationSingleton();
//        return eagerInitialized;
//    }
//}
//
//Public class BillpughSingleton {
//
//    private BillpughSingleton() {}
//    private static  class SingletonHelper{
//        private static final BillpughSingleton  INSTANCE = new BillpughSingleton();
//    }
//
//    public static BillpughSingleton getInstance() {
//        return SingletonHelper.INSTANCE;
//    }
//}

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//class Person1{
//    int age = 18;
//    public int getAge(){
//        return  age;
//    }
//}
//interface ITEngineer{
//    public int getbetterSalary();
//}
//class Employee extends Person1 implements ITEngineer{
//    int age = 21;
//
//    @Override
//    public int getbetterSalary() {
//        return 10000000;
//    }
//
//    public int getSalary(){
//        return 100000;
//    }
//}
//class  Employee1 extends Person1{
//
//}
//
public class Person implements Serializable{
    transient int age;
    String gender;
    int salary;
    static int number ;
    Person(int age,String gender,int salary){
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        number = number++;
    }

//    public void go(){
//        j=i;
//        System.out.println(i);
//        System.out.println(j);
//    }
    public static void main(String args[]) throws Exception{
        Person person = new Person(23,"F",500000);
        Person person1 = new Person(25,"M",1200000);
        FileOutputStream fileOutputStream = new FileOutputStream("/data/File.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.writeObject(person1);
        objectOutputStream.close();

//    public static void main(String args[]){
//        Person1 person1 = new Employee();
//        Person1 person2 = new Employee1();
//        Employee employee = (Employee)new Person1();
//        System.out.print(person1.getAge());
//        System.out.print(employee.);

    }
}