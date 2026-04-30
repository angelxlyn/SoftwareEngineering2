package compositeDesignPattern;

public class Teacher implements UniversityUnit {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void add(UniversityUnit unit) {
        throw new UnsupportedOperationException("Leaf node cannot add units.");
    }

    @Override
    public void remove(UniversityUnit unit) {
        throw new UnsupportedOperationException("Leaf node cannot remove units.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher: " + name + ", Subject: " + subject + ", Salary: " + salary);
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public double getBudget() {
        return salary;
    }
}
