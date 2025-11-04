package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Employee {
    private final int id;
    private String name;
    private double salary;
    private LocalDate dateHired;

    public Employee(int id,String name,LocalDate dateHired){
        this.id=id;
        this.name=name;
        this.salary=25000;
        this.dateHired= LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

     public abstract void calculateSalary();

    public String getDescription(){
        return "Name:"+name;
    }

    public String toString(){
        return "The Employee Details are:"+name;
    }
}
