package base;

public abstract class ActiveAgent extends NetworkNode {

    private final int scanRange;

    public ActiveAgent(int row, int col, int maxHP, int repairThreshold, int actionRange) {
        super(row, col, maxHP, repairThreshold);
        this.scanRange = actionRange;
    }

    public void move(){

    }

    public int getScanRange() {
        return scanRange;
    }
}
