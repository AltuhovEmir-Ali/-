public class Employee extends Person {
    private int employeeid;

    public Employee(int age, String name, int employeeid) {
        super(age, name);
        this.employeeid = employeeid;
    }

    public Employee(int age, String name) {
        super(age, name);
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                '}';
    }
}
