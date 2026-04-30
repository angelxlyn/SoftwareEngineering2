package compositeDesignPattern;

public class Demo {
    public static void main(String[] args) {
        College cics = new College("College of Informatics and Computing Studies ");
        Department cs = new Department("Department of Computer Science");

        Teacher t1 = new Teacher("Mr. Smith", "DSA", 50000);
        Teacher t2 = new Teacher("Ms. Johnson", "DAA", 45000);
        Student s1 = new Student("Seraphine", "21-13045-117", 30000);
        Student s2 = new Student("Johann Mikayel", "23-56421-261", 30000);

        cs.add(t1);
        cs.add(t2);
        cs.add(s1);
        cs.add(s2);

        cics.add(cs);

        System.out.println("Details of:");
        cics.displayDetails();
        System.out.println("Total Students: " + cics.getStudentCount());
        System.out.println("Total Budget: " + cics.getBudget());
    }
}
