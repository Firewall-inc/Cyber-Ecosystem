import java.awt.*;

public abstract class NetworkNode {
    int health;
    int row;
    int col;
    boolean isAlive;


    public NetworkNode(int row, int col){
        this.health = health;
        this.row = row;
        this.col = col;
        this.isAlive = true;
    }

    public int getHealth() {
        return health;
    }

    public abstract Color getColor();

    public abstract String getTypeName();

    public int getRow() { return row; }
    public int getCol() { return col; }

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isAlive() { return isAlive; }

    public void kill() { this.isAlive = false; }
}