package compositeDesignPattern;

public class Student implements UniversityUnit {
    private String name;
    private String studentID;
    private double tuitionFee;

    public Student(String name, String studentID, double tuitionFee) {
        this.name = name;
        this.studentID = studentID;
        this.tuitionFee = tuitionFee;
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
        System.out.println("Student: " + name + ", ID: " + studentID + ", Tuition Fee: " + tuitionFee);
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee;
    }
}
