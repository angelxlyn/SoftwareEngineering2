public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character("Knight", new SwingSword(), new Dodge());
        knight.performAttack();
        knight.performDefense();

        Character wizard = new Character("Wizard", new CastSpell(), new CreateMagic());
        wizard.performAttack();
        wizard.performDefense();

        Character archer = new Character("Archer", new ShootArrow(), new Shield());
        archer.performAttack();
        archer.performDefense();
    }
}