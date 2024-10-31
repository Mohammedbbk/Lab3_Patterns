package Games;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicGameLevel implements GameLevel {
    private String terrain;
    private List<String> obstacles;
    private Map<String, String> enemyPlacements;

    public BasicGameLevel() {
        this.obstacles = new ArrayList<>();
        this.enemyPlacements = new HashMap<>();
    }

    @Override
    public GameLevel clone() {
        BasicGameLevel cloned = new BasicGameLevel();
        cloned.terrain = this.terrain;
        cloned.obstacles = new ArrayList<>(this.obstacles);
        cloned.enemyPlacements = new HashMap<>(this.enemyPlacements);
        return cloned;
    }

    @Override
    public void customize() {
        System.out.println("Customizing game level...");
    }

    @Override
    public void setTerrain(String terrain) {
        this.terrain = terrain;
        System.out.println("Setting terrain: " + terrain);
    }

    @Override
    public void addObstacle(String obstacle) {
        this.obstacles.add(obstacle);
        System.out.println("Adding obstacle: " + obstacle);
    }

    @Override
    public void setEnemyPlacement(String enemyType, String position) {
        this.enemyPlacements.put(enemyType, position);
        System.out.println("Placing " + enemyType + " at " + position);
    }
}
