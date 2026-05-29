package base;

import java.awt.*;

public abstract class NetworkNode {

    protected int row;
    protected int col;
    protected boolean isCorrupted;
    protected int maxHP;
    protected int currentHP;
    protected int repairThreshold;
    protected boolean beingRepaired;
    protected int repairProgress;

    public NetworkNode(int row, int col, int maxHP, int repairThreshold){
        this.row = row;
        this.col = col;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.repairThreshold = repairThreshold;
    }

    public abstract Color getColor();
    public abstract String getTypeName();
    public abstract String toString();

    // Getters and setters for position and status
    public int getRow() { return row; }
    public int getCol() { return col; }

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isCorrupted() { return isCorrupted; }
    public boolean isBeingRepaired() { return beingRepaired; }
    public void setBeingRepaired(boolean status) { this.beingRepaired = status; }

    protected Color getHealthColor(Color baseColor, Color deadColor) {
        int r = deadColor.getRed() + (baseColor.getRed() - deadColor.getRed()) * currentHP / maxHP;
        int g = deadColor.getGreen() + (baseColor.getGreen() - deadColor.getGreen()) * currentHP / maxHP;
        int b = deadColor.getBlue() + (baseColor.getBlue() - deadColor.getBlue()) * currentHP / maxHP;
        return new Color(r, g, b);
    }

    public void infect(int damage) {
        this.currentHP -= damage;
        if (this.currentHP <= 0) {
            this.currentHP = 0;
            this.isCorrupted = true;
            this.repairProgress = 0;
        }
    }

    public boolean repair(int repairSpeed) {
        this.repairProgress += repairSpeed;
        if (this.repairProgress >= this.repairThreshold) {
            this.isCorrupted = false;
            this.currentHP = maxHP;
            this.repairProgress = 0;
            return true;
        }
        return false;
    }
}