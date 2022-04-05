package proyecto;

public class Coche extends Vehiculo{

	//Atributos del Coche
	private int numPuertas;
	private int capacidadMaletero;
	
	//Constructor
	public Coche(String mat, String numBas, String color, int numAsi, Serie nSer, int nPuertas, int capacidadMaletero) {
		
		//Le pasa los atributos al super
		super(mat,numBas,color,numAsi,nSer);
		this.numPuertas=nPuertas;
		this.capacidadMaletero=capacidadMaletero;
		
	}
	//Constructor vacio
	public Coche() {
		
	}
	
	//Getters
	public int getNumPuertas() {
		return this.numPuertas;
	}
	public int getCapacidadMaletero() {
		return this.capacidadMaletero;
	}
	//Setters
	public void setNumPuertas(int np) {
		this.numPuertas=np;
	}
	public void setCapacidadMaletero(int cm) {
		this.capacidadMaletero=cm;
	}
	
}
