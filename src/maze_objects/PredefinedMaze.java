package maze_objects;

public class PredefinedMaze extends MazeBuilder {
	private final int DEFAULT_ROW_SIZE = 10;
	private final int DEFAULT_COLUMN_SIZE = 10;

	public void buildMaze(int rows, int cols){ //Starts the predefined maze
		createNewMaze(DEFAULT_ROW_SIZE, DEFAULT_COLUMN_SIZE);

		for (int row = 0; row < DEFAULT_ROW_SIZE; row++) {
			for (int column = 0; column < DEFAULT_COLUMN_SIZE; column++) {
				if ( row == 0 || row == DEFAULT_ROW_SIZE-1 || column == 0 || column == DEFAULT_COLUMN_SIZE-1){
					maze.positions[row][column] = new WallTile();
				}
				else if((row == 2 || row == 3 || row == 4 || row == 6 || row == 7 || row == 8) &&
						(column == 2 || column == 3 || column == 5 || column == 7)){
					maze.positions[row][column] = new WallTile();
				}
				else {
					maze.positions[row][column] = new EmptyTile();
				}
			}
		}

		maze.positions[1][2] = new EmptyTile();
		maze.positions[1][3] = new EmptyTile();
		maze.positions[1][5] = new EmptyTile();
		maze.positions[1][7] = new EmptyTile();
		maze.positions[5][2] = new EmptyTile();
		maze.positions[5][3] = new EmptyTile();
		maze.positions[5][5] = new EmptyTile();
		maze.positions[5][7] = new WallTile();
		maze.positions[8][5] = new EmptyTile();
		maze.positions[8][7] = new EmptyTile();
		maze.positions[5][9] = new ExitTile();

	}
}
