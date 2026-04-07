public class Sheep implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String name;

    public Sheep() {
    }

    public Sheep(String name, Integer legs, String sound, String food) {
        this.name = name;
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }

    @Override
    public Animal clone() {
        return new Sheep(name, legs, sound, food);
    }

    @Override
    public void makesound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}