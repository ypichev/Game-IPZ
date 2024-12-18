package character;

public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(int x, int y) {
        return new Warrior(x, y);
    }
}
