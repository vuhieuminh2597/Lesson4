public class Employee extends Person {
    double salary;

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name, String birthDay, double salary) {
        super(name, birthDay);
        this.salary = salary;
    }

    @Override
    public void doWork() {
        System.out.println(this.getLastName() + " đang làm việc.");
    }

    @Override
    public void eat(String food) {
        System.out.println(this.getLastName() + " đang ăn " + food);
    }

    public void sleep() {
        System.out.println("\"" + this.getLastName() + "\" đang nghỉ ngơi.");
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
