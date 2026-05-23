import models.DataCell;

import java.awt.*;

public class StandardFile extends DataCell {

    // This is the base color of a standard file when it is alive
    private static final Color BASE_COLOR = new Color(0, 255, 204);
    // This is the dead color of a standard file when it is dead
    private static final Color DEAD_COLOR = new Color(26, 10, 10);

    public StandardFile(int row, int col) {
        super(row, col);
    }

    @Override
    public Color getColor() {
        return BASE_COLOR;
    }

    @Override
    public String getTypeName() {
        return "StandardFile";
    }

}
