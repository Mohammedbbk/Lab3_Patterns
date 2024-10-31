package Games;

public class LevelDesignTool {
    public static void main(String[] args) {
        // Create prototype level
        GameLevel prototype = new BasicGameLevel();

        // Clone and customize easy level
        GameLevel easyLevel = prototype.clone();
        easyLevel.setTerrain("Plains");
        easyLevel.addObstacle("Small Rock");
        easyLevel.setEnemyPlacement("Slime", "Start Area");
        easyLevel.customize();

        // Clone and customize hard level
        GameLevel hardLevel = prototype.clone();
        hardLevel.setTerrain("Mountain");
        hardLevel.addObstacle("Large Boulder");
        hardLevel.setEnemyPlacement("Dragon", "Peak");
        hardLevel.customize();
    }
}