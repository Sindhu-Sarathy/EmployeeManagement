package se.lexicon;

import java.time.LocalDate;
import java.util.Arrays;

public class SystemDeveloper extends Employee {
    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(int id,String name,String[] certificates,String[] languages){
        super(id,name,LocalDate.now());
        this.certificates= certificates;
        this.languages=languages;
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
    public void calculateSalary() {
        setSalary(25000+(certificates.length*1000)+(languages.length*1500));
    }

    @Override
    public String getDescription() {
        return "Employee Name: " + super.getName();
    }

    @Override
    public String toString() {
        return  "SystemDeveloper{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                ", salary=" + getSalary() +
                '}';
    }
}
