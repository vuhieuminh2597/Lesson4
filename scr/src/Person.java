public class Person {
    String name;
    String birthDay;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public void doWork() {
        System.out.println("Làm việc");
    }

    public void sleep() {
        System.out.println("Nghỉ ngơi");
    }

    public void eat(String food) {
        System.out.println("Ăn");
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        String[] word = this.name.split("\\s+");
        return word[2];
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
