package ec.edu.espol.workshops;


public class Cliente {
	
	private int edad;
	private char sexo;
	private String estadoCivil;
	
	public Cliente(int edad , char sexo , String estado)
	{
		this.edad=edad;
		this.sexo=sexo;
		this.estadoCivil=estado;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public char getSexo() {
		return this.sexo;
	}
	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setSexo(char sexo) {
		this.sexo=sexo;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil=estadoCivil;
	}
}
