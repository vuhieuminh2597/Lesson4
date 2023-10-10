public class Manager extends Employee {
    Employee assistant;

    public Manager() {
    }

    public Manager(Employee assistant) {
        this.assistant = assistant;
    }

    public Manager(double salary, Employee assistant) {
        super(salary);
        this.assistant = assistant;
    }

    public Manager(String name, double salary, Employee assistant) {
        super(name, salary);
        this.assistant = assistant;
    }

    public Manager(String name, String birthDay, double salary, Employee assistant) {
        super(name, birthDay, salary);
        this.assistant = assistant;
    }

    public Employee getAssistant() {
        return assistant;
    }

    @Override
    public void doWork() {
        System.out.println("Trợ lý \"" + this.assistant.getName() + "\" đang làm báo cáo");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "assistant=" + assistant +
                '}';
    }
}
