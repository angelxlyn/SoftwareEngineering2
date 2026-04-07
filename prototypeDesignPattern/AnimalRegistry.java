public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep("Dolly", 4, "Baa", "Grass");
        cowPrototype = new Cow(4, "Moo", "Hay");
        horsePrototype = new Horse(4, "Neigh", "Oats", "Brown");
    }

    public Animal createSheep() {
        return sheepPrototype.clone();
    }

    public Animal createSheep(String name) {
        Sheep clone = (Sheep) sheepPrototype.clone();
        clone.setName(name);
        return clone;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}