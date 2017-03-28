package chess.game;

public class Place {
	private int row;
	private char column;
	
	public Place(char c, int r) {
		column = c;
		row = r;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}
	
	public String toString() {
		return "" + column + row;
	}
}
