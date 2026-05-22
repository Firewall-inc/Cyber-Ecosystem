import java.awt.*;

public class EncryptedVault extends DataCell{

    private int maxHP;
    private int currentHP;

    public EncryptedVault(int row, int col, int maxHP) {
        super(row, col);
        this.maxHP = maxHP;
        this.currentHP = maxHP;
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public String getTypeName() {
        return "EncryptedVault";
    }

    public int getCurrentHP() { return currentHP; }

    public int getMaxHP() { return maxHP; }
}
