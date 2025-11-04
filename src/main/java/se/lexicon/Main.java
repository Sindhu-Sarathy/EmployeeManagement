package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] certificates={"SCRUM","AWS"};
        String[] languages={"DotNet","Java"};
        SystemDeveloper developer=new SystemDeveloper(1,"Sindhu",certificates,languages);
        System.out.println(developer);
    }
}