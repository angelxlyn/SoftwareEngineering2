package SRP;

public class Eat {
    private Pet pet;
    private String food;

    public Eat(Pet pet, String food) {
        this.pet = pet;
        this.food = food;
    }

    public String eat() {
        return pet.getPetName() + " eats " + food;
    }
}