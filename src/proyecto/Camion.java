package proyecto;

public class Camion extends Vehiculo{

	//Atributos del Camion
	private int carga;
	private char tipoMercancia;
	
	//Constructor
	public Camion(String mat, String numBas, String color, int numAsi, Serie nSer, int carga, char tM) {
		
		//Le pasa los atributos al super
		super(mat,numBas,color,numAsi,nSer);
		this.carga=carga;
		//Si el tipo de carga no es un tipo valido trata el error
		try{
			
			this.tipoMercancia=tM;
			
		}catch(Exception e) {
			
			System.err.println("Tipo de mercancia no valido...");
			do {
				
				System.out.println("Introduzca caracter valido ('G' = GENERAL | 'A' = ARIDO | 'P' = PELIGROSA)");
				this.tipoMercancia=Console.readChar();
				
			}while(this.tipoMercancia == 'G' || this.tipoMercancia == 'A' || this.tipoMercancia == 'P' );
		}
	}
	//Constructor vacio
	public Camion() {
		
	}
	//Getters
	public int getCarga() {
		return this.carga;
	}
	public char getTipoMercancia() {
		return this.tipoMercancia;
	}
	//Setters
	public void setCarga(int ca) {
		this.carga=ca;
	}
	public void setTipoMercancia(char tM) {

		try{
			
			this.tipoMercancia=tM;
			
		}catch(Exception e) {
			
			System.err.println("Tipo de mercancia no valido...");
			do {
				
				System.out.println("Introduzca caracter valido ('G' = GENERAL | 'A' = ARIDO | 'P' = PELIGROSA)");
				this.tipoMercancia=Console.readChar();
				
			}while(this.tipoMercancia == 'G' || this.tipoMercancia == 'A' || this.tipoMercancia == 'P' );
		}
		
	}
}
