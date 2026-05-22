import java.awt.*;

public class SystemCore extends DataCell{

    private boolean compromised;

    public SystemCore(int row, int col) {
        super(row, col);
        this.compromised = false;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public String getTypeName() {
        return "System Core";
    }
}
