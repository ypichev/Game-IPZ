package arena;

import character.Character;
import java.util.List;

public interface PlayerObserver {
    void update(List<Character> characters);
}
