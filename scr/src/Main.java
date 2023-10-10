public class Main {

    public static void main(String[] args) {
        Person[] peopleTest = new Person[3];
        peopleTest[0] = new Person("Vũ Minh Hiếu","25/09/1997");
        peopleTest[1] = new Employee("Phạm Văn Minh","24/06/1993",17000);
        peopleTest[2] = new Manager(new Employee("Ngô Minh Hiếu","13/02/1998",14000));

        for (Object read:
             peopleTest) {
            System.out.println(read.toString());
        }
        System.out.println("<================================>");
        peopleTest[0].doWork();
        peopleTest[1].sleep();
        peopleTest[2].doWork();
    }
}
