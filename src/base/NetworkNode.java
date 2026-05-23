package base;

import java.awt.*;

public abstract class NetworkNode {

    protected int row;
    protected int col;
    protected boolean isAlive;


    public NetworkNode(int row, int col){
        this.row = row;
        this.col = col;
        this.isAlive = true;
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