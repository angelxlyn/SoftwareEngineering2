package SRP;

public class Sound {
    private Pet pet;
    private String sound;

    public Sound(Pet pet, String sound) {
        this.pet = pet;
        this.sound = sound;
    }

    public String makeSound() {
        return pet.getPetName() + " says " + sound;
    }
}