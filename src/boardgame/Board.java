package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int row) {
		this.rows = row;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int column) {
		this.columns = column;
	}
	
	public Piece piece (int row, int column) {
		return pieces [row] [column];	
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()]= piece;
		piece.position = position;
	}
}
