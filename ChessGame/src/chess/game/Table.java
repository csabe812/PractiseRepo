package chess.game;

public class Table {
	private Place[][] place;
	
	public Table() {
		place = new Place[8][8];
		
		for(int i = 0; i<8; i++) {
			char c = 'a';
			for(int j = 0; j<8; j++) {
				place[i][j] = new Place(c++, 8-i);
			} 
		}
		kiir();
	}

	public void kiir() {
		for(int i = 0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				System.out.print(place[i][j] + " ");
			}System.out.println();
		}
	}
	
}
