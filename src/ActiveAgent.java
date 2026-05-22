public abstract class ActiveAgent extends NetworkNode{

    int speed;
    int actionRange;

    public ActiveAgent(int row, int col, int speed, int actionRange) {
        super(row, col);
        this.speed = speed;
        this.actionRange = actionRange;
    }
}
