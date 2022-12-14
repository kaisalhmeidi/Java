package a3;

public class Spielbrett {
	

	Feld[][] brett; 
	int dim;
	
	
	
	public Spielbrett(int dim) {
		this.dim = dim;
		Feld[][] feld = new Feld[dim][dim];    
		this.brett = feld;
	}
	
	
	

	public Feld[][] getBrett() {
		return brett;
	}

	public void setBrett(Feld[][] brett) {
		this.brett = brett;
	}

	public int getDim() {
		return dim;
	}
	public void setDim(int dim) {
		this.dim = dim;
	}
	
	

}
