package character;

public class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(int x, int y) {
        return new Archer(x, y);
    }
}
