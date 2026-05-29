package base;

public abstract class ActiveAgent extends NetworkNode {

    private final int actionRange;

    public ActiveAgent(int row, int col, int maxHP, int repairThreshold, int actionRange) {
        super(row, col, maxHP, repairThreshold);
        this.actionRange = actionRange;
    }


}
