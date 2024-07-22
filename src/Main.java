//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person(11,"vava");
        System.out.println(person);
        Employee employee = new Employee(11, "vava",92803716);
        System.out.println(employee);
        Company company = new Company("vava");
        System.out.println(Company.changerCompanyName("baba"));
        System.out.println(Company.printCompanyName( ));


    }
}