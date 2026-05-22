import java.awt.*;

public class RepairBot extends ActiveAgent{

    private static final Color BASE_COLOR = new Color(170, 221, 255);

    private int repairPower;
    private DataCell currentTarget;

    public RepairBot(int row, int col, int repairPower) {
        super(row, col, 1, 1);
        this.repairPower = repairPower;
        this.currentTarget = null;
    }

    @Override
    public Color getColor() {
        return BASE_COLOR;
    }

    @Override
    public String getTypeName() {
        return "RepairBot";
    }
}
