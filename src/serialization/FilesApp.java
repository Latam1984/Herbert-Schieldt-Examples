package serialization;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Aleksey on 13.05.2017.
 */
public class FilesApp {
    public static void main(String[] args) {
        String fileName ="Person.dat";

        ArrayList <Person> person = new ArrayList<>();
        person.add(new Person("Alex", 22));
        person.add(new Person("John", 21));
        person.add(new Person("Niki", 20));

       try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Person.dat"))) {
           os.writeObject(person);
           System.out.println("Objects wrote in file");
       } catch (IOException e) {
           e.printStackTrace();
       }

       ArrayList <Person> person1= new ArrayList<>();

       try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Person.dat"))){
           person1=(ArrayList<Person>)ois.readObject();
       } catch (IOException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
        for (Person p:person1) {
            System.out.println(p);

        }
    }
}
