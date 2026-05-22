import java.awt.*;

public class AntivirusSentinel extends ActiveAgent {

    private static final Color BASE_COLOR = new Color(0, 170, 255);

    private int scanRadius;
    private boolean justDeletedTarget;

    public AntivirusSentinel(int row, int col, int scanRadius) {
        super(row, col, 1, 1);  // speed=1, range=1
        this.scanRadius = scanRadius;
        this.justDeletedTarget = false;
    }

    @Override
    public Color getColor() {
        return BASE_COLOR;
    }

    @Override
    public String getTypeName() {
        return "AntivirusSentinel";
    }
}
