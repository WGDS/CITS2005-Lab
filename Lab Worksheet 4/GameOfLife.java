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
            System.out.println();
        }
    }

    public void simulateStep() {
        // TODO
        int[] row_offset = {-1,-1,-1,0,0,1,1,1};
        int[] column_offset = {-1,0,1,-1,1,-1,0,1};
        boolean[][] gridnext = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j ++){
                int liveCount = 0;
                for(int k = 0; k<8; k++){
                    int newRow = (i + row_offset[k] + grid.length) % grid.length;
                    int newCol = (j + column_offset[k] + grid.length) % grid.length;
                    if(grid[newRow][newCol]){
                        liveCount ++;
                    }
                }
                if((liveCount == 2 || liveCount == 3)&& grid[i][j] == true){
                    gridnext[i][j] = true;
                }
                else if(liveCount == 3 && grid[i][j] == false){
                    gridnext[i][j] = true;
                }
                else{
                    gridnext[i][j] = false;
                }

            }
        }
        grid = gridnext;
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
