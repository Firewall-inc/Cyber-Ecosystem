package base;

public abstract class ActiveAgent extends NetworkNode {

    private final int actionRange;

    public ActiveAgent(int row, int col, int speed, int actionRange) {
        super(row, col);
        this.actionRange = actionRange;
    }


}
