public class Cow implements Animal {
    private Integer legs;
    private String sound;
    private String food;

    public Cow() {
    }

    public Cow(Integer legs, String sound, String food) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }

    @Override
    public Animal clone() {
        return new Cow(legs, sound, food);
    }

    @Override
    public void makesound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Cow";
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
}