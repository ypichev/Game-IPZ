package arena;

import character.Character;
import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<PlayerObserver> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers();
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
        notifyObservers();
    }

    public void attack(Character attacker, Character target) {
        attacker.attack(target);
    }

    public void moveCharacter(Character character, int x, int y) {
        character.move(x, y);
    }

    public void addObserver(PlayerObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PlayerObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (PlayerObserver observer : observers) {
            observer.update(characters);
        }
    }
}
