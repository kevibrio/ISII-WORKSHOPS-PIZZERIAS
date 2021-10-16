package ec.edu.espol.workshops;

public class CarInsurance {
	public static void main(String []args){
		//Crear menu
		System.out.println("\t\t\tCAR INSURANCE PREMIUM\n");
		System.out.println("Bienvenidos a nuestra aseguradora:\n");
		//Ingreso de datos del cliente
		Cliente cliente = new Cliente(10,Sexo.Femenino,EstadoCivil.Soltero);
		System.out.println("Bienvenido cliente" + cliente + "\n");
		Prima prima = new Prima(cliente);
		System.out.println("Usted puede tener una prima de $" + prima.calcularPrima(true) + " dólares.");
		
		 
		
		
		
     }
}

