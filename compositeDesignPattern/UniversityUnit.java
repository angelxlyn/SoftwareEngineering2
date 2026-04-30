package compositeDesignPattern;

public interface UniversityUnit {
    void add(UniversityUnit unit);
    void remove(UniversityUnit unit);
    void displayDetails();
    int getStudentCount();
    double getBudget();
}
