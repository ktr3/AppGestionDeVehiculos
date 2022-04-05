package proyecto;

public class Menu {

	//Atributos del menu
	private String selectOpc;
	
	Concesionario concesi = new Concesionario();
	Serie serie = new Serie();
	Camion camion = new Camion();
	Coche coche = new Coche();
	
	//Constructor del menu
	boolean finish=true;
	
	public Menu() {
		while(finish) {
		try {	
		do {
			//Opciones del menu
			System.out.println();
			System.out.println("// BIENVENIDO AL MENU \\");
			
			System.out.println("Pulse 0 para salir del menu.");
			System.out.println("Pulse 1 para | Añadir vehiculo |");	
			System.out.println("Pulse 2 para | Eliminar vehiculo |");
			System.out.println("Pulse 3 para | Mostrar lista de vehiculos |");
			System.out.println("Pulse 4 para | Modificar vehiculo |");
			System.out.println("Pulse 5 para | Pintar vehiculo |");
			System.out.println("Pulse 6 para | Mostrar vehiculo |");
			
				this.selectOpc=Console.readString();
	
			switch (this.selectOpc) {
			//Salirse del menu
			case "0": {
				System.out.println("Saliendo del menu...");
				finish=false;
				break;
			}
			//Añadir vehiculo
			case "1":{
				System.out.println("| Añadir vehiculo |");
				System.out.println("¿Que tipo de vehiculo quieres añadir?");
				System.out.println("1- Para añadir un coche || 2- Para añadir un camion");
				int aux;
				do {
					aux=Console.readInt();
				}while(aux>2 && aux<1);
				//Añadir coche
				if(aux==1) {
					
					System.out.println("Matricula:");
					coche.setMatricula(Console.readString());
					System.out.println("Numero de bastidor");
					coche.setNumBastidor(Console.readString());
					System.out.println("Color");
					coche.setColor(Console.readString());
					System.out.println("Numero de asientos");
					coche.setNumAsientos(Console.readInt());
					System.out.println("Marca");
					serie.setMarca(Console.readString());
					System.out.println("Modelo");
					serie.setModelo(Console.readString());
					System.out.println("Anio de fabricacion");
					serie.setAnio(Console.readInt());
					coche.setSerie(serie);
					System.out.println("Numero de puertas");
					coche.setNumPuertas(Console.readInt());
					System.out.println("Capacidad del maletero");
					coche.setCapacidadMaletero(Console.readInt());
					concesi.añadir(coche);
				//Añadir camion	
				}else if(aux==2) {
					
					System.out.println("Matricula:");
					camion.setMatricula(Console.readString());
					System.out.println("Numero de bastidor");
					camion.setNumBastidor(Console.readString());
					System.out.println("Color");
					camion.setColor(Console.readString());
					System.out.println("Numero de asientos");
					camion.setNumAsientos(Console.readInt());
					System.out.println("Marca");
					serie.setMarca(Console.readString());
					System.out.println("Modelo");
					serie.setModelo(Console.readString());
					System.out.println("Anio de fabricacion");
					serie.setAnio(Console.readInt());
					camion.setSerie(serie);
					System.out.println("Carga");
					camion.setCarga(Console.readInt());
					System.out.println("Tipo de mercancia");
					camion.setTipoMercancia(Console.readChar());
					concesi.añadir(camion);
				}
				
				break;
			}
			//Eliminar vehiculo
			case "2":{
				
				System.out.println("| Eliminar vehiculo |");			
				System.out.println("¿Cual es la matricula del vehiculo?");
				String matri=Console.readString();

					concesi.eliminar(matri);		
				
				break;
			}
			//Lista de vehiculos
			case "3":{
				
				System.out.println("Lista de vehiculos");
				concesi.mostrarVehiculos();
				
				break;
			}
			//Modificar vehiculo
			case "4":{
				
				System.out.println("| Modificar vehiculo |");
				System.out.println("¿Cual es la matricula del vehiculo?");
				String matri=Console.readString();
				
				concesi.modificarAtributosVehiculo(matri);
				
				break;
			}
			//Pintar vehiculo
			case "5":{
				
				System.out.println("| Pintar vehiculo |");
				System.out.println("¿Cual es la matricula del vehiculo?");
				String matri=Console.readString();
				
				concesi.cambioColor(matri);
				
				break;
			}
			//Mostrar vehiculo
			case "6":{
				
				System.out.println("| Mostrar vehiculo |");
				System.out.println("¿Cual es la matricula del vehiculo?");
				String matri=Console.readString();
				
				concesi.mostrarVehiculo(matri);
				
				break;
			}
			//Default
			default:
				System.err.println("Opcion no valida.");
				break;
			}
			
		 
		}while (Integer.parseInt(this.selectOpc) != 0);	
	}catch(NumberFormatException e) {
		System.err.println("Introduzca un numero");
		this.selectOpc="999";
	}
	}
	}
	//Getters
	public String getSelectOpc() {
		return this.selectOpc;
	}
	//Setters
	public void setSelectOpc(String op) {
		this.selectOpc=op;
	}
}

