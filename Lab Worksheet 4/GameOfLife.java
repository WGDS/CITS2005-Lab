public class GameOfLife {
    private boolean[][] grid;

    public GameOfLife(boolean[][] initialGrid) {
        grid = initialGrid;
    }

    public void printGrid() {
        // TODO
        for(int i = 0; i < grid.length; i ++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == true){
                    System.out.print("o");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.print("\n");
        }
    }

    public void simulateStep() {
        // TODO
    }

    public static void main(String[] args) {
        boolean[][] initialGrid = new boolean[10][10];
        initialGrid[4][5] = true;
        initialGrid[4][6] = true;
        initialGrid[5][4] = true;
        initialGrid[5][5] = true;
        initialGrid[6][5] = true;
        GameOfLife game = new GameOfLife(initialGrid);
        for (int i = 0; i < 10; i++) {
            System.out.println("Before Step " + (i+1));
            game.printGrid();
            System.out.println();
            game.simulateStep();
        }
    }
}
