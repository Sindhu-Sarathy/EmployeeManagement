package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

public final class SystemDeveloper extends Employee {
    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(int id,String name,double salary,LocalDate dateHired,String[] certificates,String[] languages){
        super(id,name,salary,dateHired);
        this.certificates= certificates;
        this.languages=languages;
        calculateSalary();
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
        calculateSalary();
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
        calculateSalary();
    }


    public void addCertificates(String certi){
        certificates=Arrays.copyOf(certificates,certificates.length+1);
        certificates[certificates.length-1]=certi;

    }

    public void addLanguages(String lang){
        languages=Arrays.copyOf(languages,languages.length+1);
        languages[languages.length-1]=lang;

    }


    @Override
    public double calculateSalary() {
        return(getSalary()+(certificates.length*1000)+(languages.length*1500));
    }

    @Override
    public String getDescription() {
        return "Employee Name: " + super.getName() + ",Salary: "+getSalary()+",HiredDate: "+getDateHired()+",Certificates: "+certificates+",Languages: "+languages;
    }

    @Override
    public String toString() {
        return "Employee Name: "+ getName()+",Salary: "+getSalary()+",HiredDate: "+getDateHired()+",SystemDeveloper{" +
                "certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
