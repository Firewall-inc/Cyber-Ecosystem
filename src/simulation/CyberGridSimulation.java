package simulation;

import base.NetworkNode;
import models.StandardFile;

public class CyberGridSimulation {
    protected NetworkNode[][] grid;
    protected int rows;
    protected int cols;

    public CyberGridSimulation(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        grid = new NetworkNode[rows][cols];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                grid[row][col] = new StandardFile(row, col);
            }
        }
    }

    public NetworkNode[][] getGrid(){ return grid; }

}
