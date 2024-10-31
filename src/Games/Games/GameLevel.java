package Games;
public interface GameLevel extends Cloneable {
    GameLevel clone();
    void customize();
    void setTerrain(String terrain);
    void addObstacle(String obstacle);
    void setEnemyPlacement(String enemyType, String position);
}