package character;

public interface Character {
    void attack(Character target);
    void move(int x, int y);
    void showStatus();
    String getName();
    int getHealth();
    int getAttackPower();
    void receiveDamage(int damage);
}
