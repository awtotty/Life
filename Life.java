// Model of a game of Conway's Game of Life.

public class Life {
    private int generation = 1 ; // track generation
    private final int HASH_SIZE = (int) Math.pow(2, 14);
    // TODO
    // Fields representing the world of Cells and number of living neighbors for each cell in the world


    /**
     * Creates a random world
     * @param size
     */
    public Life(int size) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                Cell c = new Cell(x, y);
                // randomly decide if the given cell is alive
                if ( Math.random() > 0.9 ) { // chance of living = 10%
                    addCell(c);
                }
            }
        }
    }


    /**
     * Adds a given cell to the world and increments the count
     * of living neighbors for each of the cell's neighbors.
     * @param c
     */
    private void addCell(Cell c) {
        // TODO

    }

    /**
     * Removes a given cell from the world and decrements the count
     * of living neighbors for each of the cell's neighbors.
     * @param c
     */
    private void removeCell(Cell c) {
        // TODO

    }


    /**
     * Advance the world by one generation. Uses rules of the Game to determine if a cell lives or dies
     * Be careful not to remove or add cells until all calculations have been made!
     */
    public void step() {
        // TODO

    }

    /**
     * Getter
     * @return generation
     */
    public int getGeneration() {
        return generation;
    }

    /**
     * Returns true iff the cell at the given location is alive.
     * @param x
     * @param y
     * @return true if cell is alive
     */
    public boolean isAlive(int x, int y) {
        // TODO

        return false;
    }

    // Helper class to store cell information
    private class Cell {
        int x, y;

        Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object other) {
            // TODO

            return false;
        }

        @Override
        public int hashCode() {
            // TODO

            return super.hashCode();
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ')';
        }

        public Cell[] getNeighbors() {
            return new Cell[]   {
                    new Cell(x - 1, y - 1),
                    new Cell(x - 1, y),
                    new Cell(x - 1, y + 1),
                    new Cell(x, y - 1),
                    new Cell(x, y + 1),
                    new Cell(x + 1, y - 1),
                    new Cell(x + 1, y),
                    new Cell(x + 1, y + 1),
            };
        }
    }

}
