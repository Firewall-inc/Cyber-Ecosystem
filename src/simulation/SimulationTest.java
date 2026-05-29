package simulation;

import base.NetworkNode;

public class SimulationTest {
    public static void main(String[] args) {
        CyberGridSimulation simulation = new CyberGridSimulation(20, 20);
        NetworkNode[][] grid = simulation.getGrid();

        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[row].length; col++){
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
}
