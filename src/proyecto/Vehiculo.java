package proyecto;

public abstract class Vehiculo {

	//Atributos del vehiculo
	private String matricula;
	private String numBastidor;
	private String color;
	private int numAsientos;
	private Serie nSerie;
	private Boolean reepintado=false;
	
	//Constructor
	public Vehiculo(String mat, String numBas, String color, int numAsi, Serie nSer) {
		
		this.matricula=mat;
		this.numBastidor=numBas;
		this.color=color;
		this.numAsientos=numAsi;
		this.nSerie=nSer;
		
	}
	//Constructor vacio
	public Vehiculo() {
		
	}
	
	//Getters
	public String getMatricula() {
		return this.matricula;
	}
	public String getNumBastidor() {
		return this.numBastidor;
	}
	public String getColor() {
		return this.color;
	}
	public int getNumAsientos() {
		return this.numAsientos;
	}
	public Serie getSerie() {
		return this.nSerie;
	}
	public boolean getReepintado() {
		return this.reepintado;
	}
	//Setters
	public void setMatricula(String ma) {
		this.matricula=ma;
	}
	public void setNumBastidor(String nm) {
		this.numBastidor=nm;
	}
	public void setColor(String co) {
		this.color=co;
	}
	public void setNumAsientos(int na) {
		this.numAsientos=na;
	}
	public void setSerie(Serie se) {
		this.nSerie=se;
	}
	public void setReepintado(Boolean bo) {
		this.reepintado=bo;
	}
	
}
