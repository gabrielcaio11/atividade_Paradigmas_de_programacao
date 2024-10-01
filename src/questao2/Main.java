package questao2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();
        
        Character character1 = new Character();
        Character character2 = new Character();
        Monster monster1 = new Monster();
        Monster monster2 = new Monster();
        
        entities.add(character1);
        entities.add(character2);
        entities.add(monster1);
        entities.add(monster2);
        
        for (Entity entity : entities) {
            entity.fazerSom();
        }
    }
}
