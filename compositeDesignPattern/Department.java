package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Department implements UniversityUnit {
    private String name;
    private List<UniversityUnit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(UniversityUnit unit) {
        units.add(unit);
    }

    public void remove(UniversityUnit unit) {
        units.remove(unit);
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        for (UniversityUnit unit : units) {
            unit.displayDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int total = 0;
        for (UniversityUnit unit : units) {
            total += unit.getStudentCount();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (UniversityUnit unit : units) {
            total += unit.getBudget();
        }
        return total;
    }
}
