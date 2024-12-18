package character;

public class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(int x, int y) {
        return new Mage(x, y);
    }
}
