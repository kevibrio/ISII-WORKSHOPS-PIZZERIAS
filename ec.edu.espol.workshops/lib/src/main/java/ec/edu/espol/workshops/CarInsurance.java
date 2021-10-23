package ec.edu.espol.workshops;
import java.util.logging.Logger;
import java.util.Scanner;

public class CarInsurance {
    private static final Logger LOGGER = Logger.getLogger(CarInsurance.class.getName());
	public static boolean tieneLicencia(char entrada) {
		if(entrada == 'S') return true; // NOPMD by Asus on 22/10/21 21:21
		return false;
	}
	
	public static boolean tieneEntradaValida(char entrada) {
		return entrada == 'S' || entrada == 'N';
	}
	
	public static boolean tieneEntradaValidaSexo(char entrada) {
		return entrada == 'F' || entrada == 'M';
	}
	
	public static boolean tieneEntradaValidaEstadoCivil(String entrada) {
		return entrada.contentEquals("Soltero") || entrada.contentEquals("Casado");	 // NOPMD by Asus on 22/10/21 21:22
	}
	
	public static boolean esNumeroPositivo(String str) {
		return  str.matches("\\d*(\\.\\d+)?");
	}
	
	public static void main(String []args){
		Scanner entrada= new Scanner(System.in);
		boolean salir = false;
		char licencia, sexo;
		String estadoCivil, edadStr;
	    Cliente cliente = new Cliente();

		int edad = 0;
		System.out.println("\t\t\tCAR INSURANCE PREMIUM\n");
		System.out.println("Bienvenidos a nuestra aseguradora:\n");
		System.out.println("Posee licencia de conducir(S/N): \n");
		licencia = entrada.next().charAt(0);
		while (!salir) {
			if(tieneEntradaValida(licencia)) {
				salir = true;	
			}
			else {
				LOGGER.warning("Entrada inválida\n");	
				System.out.println("Posee licencia de conducir(S/N): \n");
				
				licencia = entrada.next().charAt(0);
			}
		}
		if (!tieneLicencia(licencia)) {
			LOGGER.warning("No puede solicitar un prima sin licencia \n");
		}
		else {
			System.out.println("Ingrese la edad: \n");
			edad = entrada.nextInt();
			salir = false;
			while (!salir) {
				if(edad>0) {
					salir = true;	
				}
				else {
					LOGGER.warning("Entrada inválida\n");	
					System.out.println("Ingrese la edad: \n");
					edad = entrada.nextInt();
				}
			}	
			//edad = Integer.parseInt(edadStr);  
			cliente.setEdad(edad);
			entrada.nextLine();
			System.out.println("Ingrese el estado civil (Soltero/Casado): \n");
			estadoCivil = entrada.nextLine();	
			salir = false;
			while (!salir) {
				if(tieneEntradaValidaEstadoCivil(estadoCivil)) {
					salir = true;	
				}
				else {
					LOGGER.warning("Entrada inválida\n");	
					System.out.println("Ingrese el estado civil (Soltero/Casado): \n");
					estadoCivil = entrada.nextLine();
				}
			}
			if(estadoCivil.contentEquals("Soltero")) cliente.setEstadoCivil(EstadoCivil.Soltero);
			else if (estadoCivil.contentEquals("Casado"))  cliente.setEstadoCivil(EstadoCivil.Casado);
			System.out.println("Ingrese el sexo(F/M): \n");
			sexo = entrada.next().charAt(0);
			salir = false;
			while (!salir) {
				if(tieneEntradaValidaSexo(sexo)) {
					salir = true;	
				}
				else {
					LOGGER.warning("Entrada inválida\n");	
					System.out.println("Ingrese el sexo(F/M): \n");
					sexo = entrada.next().charAt(0);
				}
			}
			if(sexo == 'F') cliente.setSexo(Sexo.Femenino);
			else if (sexo == 'M')  cliente.setSexo(Sexo.Masculino);
			
		    Prima prima = new Prima(cliente);
		    System.out.println("Usted puede tener una prima de $" + prima.calcularPrima(true) + " dólares.");
			
		}
	}	
}

