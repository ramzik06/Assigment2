import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void printData(Iterable<Human> people) {
        for (Human person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Arsen" , "Rustemov" , "delivery" , 120000);
        Employee e2 = new Employee("Askar" , "Haimuldin" , "Coder" , 570000);
        Student s1 = new Student("Artem" , "Kuznesov" , 3.0);
        Student s2 = new Student("Raim" , "Ermukhambet" , 2.0);


        ArrayList<Human> arr = new ArrayList<>();
        arr.add(e1);
        arr.add(e2);
        arr.add(s1);
        arr.add(s2);

        Collections.sort(arr);
        System.out.println(arr.get(0));
        printData(arr);


    }



}