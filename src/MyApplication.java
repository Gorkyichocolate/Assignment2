import Classes.Employee;
import Classes.Person;
import Classes.Student;
import Interfaces.Payable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args)
    {
        ArrayList<Person> persons = new ArrayList<>();

        Person biba = new Student("Beybars" , "Kuanysh" , 3.97);
        Person erkham = new Student("Erkhan" , "Piriyev" , 3.05);
        Person khaimuldin = new Employee("Nursultan" , "Khaimuldin" , "Teacher" , 2000000);

        persons.add(biba);
        persons.add(erkham);
        persons.add(khaimuldin);

        Collections.sort(persons);

        printData(persons);
    }

    private static void printData(Iterable<? extends Payable> payables)
    {
        for (Payable payable : payables)
        {
            System.out.println(payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");
        }
    }
}