package Classes;

import Interfaces.Payable;

public abstract class Person implements Payable , Comparable<Person>
{
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;

    public Person()
    {
        id = id_gen++;
    }

    public Person(String name , String surname)
    {
        this();
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public abstract String getPosition();

    @Override
    public  int compareTo(Person other){
        return Double.compare(this.getPaymentAmount() , other.getPaymentAmount());
    }

    @Override
    public String toString() {
        return (id + ". " + name + " " + surname);
    }
}
