package character;

public class Mage implements Character {
    private String name = "Маг";
    private int health = 100;
    private int attackPower = 40;
    private int x, y;

    public Mage(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void attack(Character target) {
        target.receiveDamage(attackPower);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void showStatus() {
        System.out.println(name + ": Здоров'я = " + health + ", Потужність атаки = " + attackPower);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void receiveDamage(int damage) {
        health -= damage;
    }
}
