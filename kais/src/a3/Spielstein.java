package a3;

public class Spielstein {
	
	int currentRow;
	int currentCol;
	Spielbrett brett;
	
	
	
	
	public Spielstein(Spielbrett brett, int indexRow, int indexCol) {
		this.currentRow = indexRow;
		this.currentCol = indexCol;
		this.brett = brett;
	}
	
	
	private boolean movesOut() {
		Feld[][] a = brett.getBrett(); 
		int dim = brett.getDim();
		if (currentCol ==0 || currentCol == dim || currentRow ==0 || currentRow ==dim){
			
			if( a[currentRow][currentCol].getDirection() == 'L' && currentCol ==0) {
				return true;
			}else if(a[currentRow][currentCol].getDirection() == 'U' && currentRow ==0){
				return true;
			}else if(a[currentRow][currentCol].getDirection() == 'D' && currentRow ==dim){
				return true;
			}else if(a[currentRow][currentCol].getDirection() == 'R' && currentCol ==dim){
				return true;
			}else {
				return false;	
			}
		}
		return false;
		
	}
	
	public void go(int n) {
		
			Feld[][]a = brett.getBrett();  
			while (a[currentRow][currentCol].isBoese() == false && movesOut() == false && n>1) {
				if (a[currentRow][currentCol].getDirection()== 'U') {
					currentRow--;
					n--;
				}else if (a[currentRow][currentCol].getDirection()== 'D') {
					currentRow++;
					n--;
				}else if (a[currentRow][currentCol].getDirection()== 'L') {
					currentCol--;
					n--;
				}else {
					currentCol++;
					n--;
				}
			}
		}

	
	public int getCurrentRow() {
		return currentRow;
	}
	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}
	public int getCurrentCol() {
		return currentCol;
	}
	public void setCurrentCol(int currentCol) {
		this.currentCol = currentCol;
	}
	public Spielbrett getBrett() {
		return brett;
	}
	public void setBrett(Spielbrett brett) {
		this.brett = brett;
	}
	
	
	
}
