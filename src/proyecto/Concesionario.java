package proyecto;

import java.util.HashMap;
import java.util.Iterator;

public class Concesionario {

	//Atributos de Concesionario
	private HashMap <String, Vehiculo> listaVehiculos = new HashMap<String, Vehiculo>();

	//Constructor vacio
	public Concesionario() {
		
	}
	//Constructor con un vehiculo
	public Concesionario(HashMap <String, Vehiculo> lv) {
		this.listaVehiculos=lv;
	}
	
	//Metodos
	//Añade un vehiculo a la lista
	public void añadir(Vehiculo vehi) {
		this.listaVehiculos.put(vehi.getMatricula(), vehi);
	}
	//Borra un vehiculo a la lista
	public void eliminar(String matri) {
		this.listaVehiculos.remove(matri);
	}
	//Muestra todos los vehiculos de la lista
	public void mostrarVehiculos() {
		
		//Creamos el iterator
		Iterator<String> it = listaVehiculos.keySet().iterator();
		int cont = 1;
		while(it.hasNext()) {
			System.out.println("Vehiculo: " + cont + " Con matricula " + it.next());
			cont++;
		}	
	}
	//Modificar los datos de un coche
	public void modificarAtributosVehiculo(String matricula) {
		
		System.out.println("// CAMBIOS DISPONIBLES \\");
		System.out.println(" 1 - PARA CAMBIO DEL NUMERO DE BASTIDOR");
		System.out.println(" 2 - PARA CAMBIO DEL NUMERO DE ASIENTOS");
		System.out.println(" 3 - PARA CAMBIO DEL NUMERO DE SERIE");
		
		int aux;
		
		do {
			
			aux=Console.readInt();
			
		}while(aux>3 && aux<1);
		
		if(aux==1) {
			System.out.println("Introduzca nuevo numero de bastidor...");
			this.listaVehiculos.get(matricula).setNumBastidor(Console.readString());
		}else if(aux==2) {
			System.out.println("Introduzca nuevo numero de asientos...");
			this.listaVehiculos.get(matricula).setNumAsientos(Console.readInt());
		}else if(aux==3) {
			System.out.println("Introduzca nuevo numero de serie...");
			System.out.println("Introduzca nueva marca:");
			String marca=Console.readString();
			System.out.println("Introduzca nuevo modelo:");
			String modelo=Console.readString();
			System.out.println("Introduzca anio de fabricacion");
			int anio=Console.readInt();
			Serie se = new Serie(marca,modelo,anio);
			this.listaVehiculos.get(matricula).setSerie(se);
		}
	}
	//Mostrar datos del vehiculo
	public void mostrarVehiculo(String matri) {
		
		System.out.println("Matricula:" + this.listaVehiculos.get(matri).getMatricula() );
		System.out.println("Numero del bastidor: " + this.listaVehiculos.get(matri).getNumBastidor() );
		System.out.println("Color: " + this.listaVehiculos.get(matri).getColor() );
		System.out.println("Numero de asientos: " + this.listaVehiculos.get(matri).getNumAsientos() );
		System.out.println("Marca: " + this.listaVehiculos.get(matri).getSerie().getMarca() );
		System.out.println("Modelo: " + this.listaVehiculos.get(matri).getSerie().getModelo() );
		System.out.println("Anio: " + this.listaVehiculos.get(matri).getSerie().getAnio() );
		System.out.println("Reepintado: " + this.listaVehiculos.get(matri).getReepintado() );
		
	}
	//Cambiar color del vehiculo
	public void cambioColor(String matri) {
		System.out.println("Color deseado:");
		this.listaVehiculos.get(matri).setColor(Console.readString());
		this.listaVehiculos.get(matri).setReepintado(true);
	}
}
