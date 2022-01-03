package ec.edu.espol.workshops;

public class Prima {
	private Cliente cliente; 
	private int prima = 500;
	
	public Prima(Cliente cliente) {
		this.cliente= new Cliente(cliente);
	}
	
	
	public int  calcularPrima(boolean driverLicense){
		//Correccion PMD
			if(!driverLicense) {
				this.prima = -1;
				return this.prima;
			}
			if(this.cliente.getEdad() >= 80) {
				this.prima = -1;
				return this.prima;
			}
			if(this.cliente.getEstadoCivil().equals(EstadoCivil.Casado) 
					|| this.cliente.getSexo().equals(Sexo.Femenino)) {
				this.prima -= 200;
			}
			if(this.cliente.getEdad() >= 45 
					&& this.cliente.getEdad() < 65) {
				this.prima -= 100;
			}
			if(this.cliente.getSexo().equals(Sexo.Masculino) 
					&& this.cliente.getEstadoCivil().equals(EstadoCivil.Soltero) 
					&& this.cliente.getEdad() < 25) {
				this.prima += 1500; 
			}
			return this.prima;
	
	}
	
}
