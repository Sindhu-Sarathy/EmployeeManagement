package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] certificates={"SCRUM","AWS"};
        String[] languages={"DotNet","Java"};

        Employee developer=new SystemDeveloper(1,"Sindhu",25000, LocalDate.now(), certificates,languages);

        System.out.println("The Salary is: "+ developer.calculateSalary());
        System.out.println(developer.toString());
    }
}