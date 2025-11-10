package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

public final class SalesPerson extends Employee {
    private String[] clients;
    private int aquiredClients;
    private double salary;

    public SalesPerson(int id, String name, LocalDate dateHired,String[] clients,int aquiredClients) {
        super(id, name, dateHired);
        this.clients=clients;
        this.aquiredClients=aquiredClients;
    }

    public void setAquiredClients(int aquiredClients) {
        this.aquiredClients = aquiredClients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    @Override
    public double calculateSalary() {
        int maintained =(clients !=null) ? clients.length : 0;
        salary=getSalary()+(maintained * 500)+(aquiredClients * 1000);
        return salary;
    }

    @Override
    public String toString() {
        return "Employee Name: "+ getName()+",Salary: "+ salary +",HiredDate: "+getDateHired()+",SalesPerson{" +
                "clients=" + Arrays.toString(clients) +
                ", aquiredClients=" + aquiredClients +
                '}';
    }
}
