package models;

import base.ActiveAgent;
import base.NetworkNode;

import java.awt.*;

public class RepairBot extends ActiveAgent {

    private static final Color BASE_COLOR = new Color(170, 221, 255);

    private int repairPower;
    private NetworkNode currentTarget;

    public RepairBot(int row, int col, int repairPower) {
        super(row, col, 100, 5, 1);
        this.repairPower = repairPower;
        this.currentTarget = null;
    }

    public int getRepairPower() { return repairPower; }
    public void setRepairPower(int repairPower) { this.repairPower = repairPower; }

    @Override
    public Color getColor() {
        return BASE_COLOR;
    }

    @Override
    public String getTypeName() {
        return "models.RepairBot";
    }

    @Override
    public String toString() {
        return "R";
    }
}
