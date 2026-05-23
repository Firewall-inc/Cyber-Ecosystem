package base;

public abstract class DataCell extends NetworkNode{

    protected boolean corrupted;
    protected int corruptionLevel;
    protected boolean beingRepaired;
    protected int repairProgress;

    public DataCell(int row, int col) {
        super(row, col);
        this.corrupted = false;
        this.corruptionLevel = 0;
        this.beingRepaired = false;
        this.repairProgress = 0;
    }
}
