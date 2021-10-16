package ec.edu.espol.workshops;


public class Cliente {
	
	private int edad;
	private Sexo sexo;
	private EstadoCivil estadoCivil;
	public Cliente(int edad , Sexo sexo , EstadoCivil estado)
	{
		this.edad=edad;
		this.sexo=sexo;
		this.estadoCivil=estado;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public Sexo getSexo() {
		return this.sexo;
	}
	public EstadoCivil getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void setSexo(Sexo sexo) {
		this.sexo=sexo;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil=estadoCivil;
	}

	@Override
	public String toString() {
		return  " con edad de " + edad + " años, sexo " + sexo + " y estado civil " + estadoCivil + ".";
	}
}
