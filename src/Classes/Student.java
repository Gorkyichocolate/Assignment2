package Classes;

import Interfaces.Payable;

public class Student extends Person
{
    private double gpa;

    public Student(){}

    public Student(String name , String surname , double gpa)
    {
        super(name , surname);
        this.gpa = gpa;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ("Student: " + super.toString());
    }

    @Override
    public double getPaymentAmount() {
        return (gpa>=2.67?36600.00:0);
    }
}
