package chess.figures;

public class Figure {

	private boolean available;
	private int row;
	private char column;
	
	public Figure(boolean a, int r, char c) {
		available = a;
		row = r;
		column = c;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
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
	
	public boolean isValidStep(char fromColumn, int fromRow, char toColum, int toRow) {
		if(fromRow == toRow && fromColumn == toColum) return false;
		if(fromColumn < 'a' || fromColumn > 'h' || toColum < 'a' || toColum > 'h' || fromRow < 1 || fromRow > 8 || toRow < 1 || toRow > 8) return false;
		return true;
	}
}
