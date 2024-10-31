package Games;

public class LevelDesignTool {
    public static void main(String[] args) {
        GameLevel prototype = new BasicGameLevel();

        GameLevel easyLevel = prototype.clone();
        easyLevel.setTerrain("Plains");
        easyLevel.addObstacle("Small Rock");
        easyLevel.setEnemyPlacement("Slime", "Start Area");
        easyLevel.customize();

        GameLevel hardLevel = prototype.clone();
        hardLevel.setTerrain("Mountain");
        hardLevel.addObstacle("Large Boulder");
        hardLevel.setEnemyPlacement("Dragon", "Peak");
        hardLevel.customize();
    }
}