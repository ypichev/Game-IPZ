import character.*;
import arena.*;

public class Game {
    public static void main(String[] args) {
        // Створення фабрик для персонажів
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        // Створення арени
        Arena arena = new Arena();

        // Створення гравців-спостерігачів
        Player player1 = new Player("Гравець 1");
        Player player2 = new Player("Гравець 2");

        // Додавання спостерігачів до арени
        arena.addObserver(player1);
        arena.addObserver(player2);

        // Створення персонажів через фабричний метод
        character.Character warrior = warriorFactory.createCharacter(0, 0);
        character.Character mage = mageFactory.createCharacter(1, 1);
        character.Character archer = archerFactory.createCharacter(2, 2);

        // Додавання персонажів на арену
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        // Атаки та рухи персонажів
        arena.attack(warrior, mage);
        arena.moveCharacter(archer, 3, 3);
    }
}
