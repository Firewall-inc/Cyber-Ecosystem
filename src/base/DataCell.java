package base;

public abstract class DataCell extends NetworkNode{

    public DataCell(int row, int col, int maxHP, int repairThreshold) {
        super(row, col, maxHP, repairThreshold);
    }
}
