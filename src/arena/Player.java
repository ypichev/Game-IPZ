package arena;

import character.Character;
import java.util.List; // Додаємо імпорт для List

public class Player implements PlayerObserver {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(List<Character> characters) {
        System.out.println("Гравець " + name + " отримав оновлення:");
        for (Character character : characters) {
            character.showStatus();
        }
    }
}
