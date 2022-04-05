package proyecto;

public class Serie {

	//Atributos de la Serie
	private String marca;
	private String modelo;
	private int anioFabricacion;
	
	//Constructor
	public Serie(String mar, String mod, int anio) {
		
		this.marca=mar;
		this.modelo=mod;
		this.anioFabricacion=anio;
		
	}
	//Constructor vacio
	public Serie() {
		
	}
	
	//Getters
	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public int getAnio() {
		return this.anioFabricacion;
	}
	//Setters
	public void setMarca(String m) {
		this.marca=m;
	}
	public void setModelo(String m) {
		this.modelo=m;
	}
	public void setAnio(int anio) {
		this.anioFabricacion=anio;
	}
	
}
