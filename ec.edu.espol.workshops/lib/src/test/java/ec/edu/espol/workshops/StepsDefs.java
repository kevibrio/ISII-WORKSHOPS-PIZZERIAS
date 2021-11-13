package ec.edu.espol.workshops;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefs {
	private int actualAnswer;
	public CarInsurance carInsurance = new CarInsurance();
	public Cliente cliente = new Cliente();
	public Prima prima = new Prima();
	private boolean isLicensed = false;
		

	@Given("the client is {int} years old, {string}, {string} and {string}")
	public void the_client_is_years_old(int edad, String estadoCivil, String sexo, String licensed) {
		cliente.setEdad(edad);
		if (estadoCivil.contentEquals("Soltero")) {
			cliente.setEstadoCivil(EstadoCivil.Soltero);
		}
		else if (estadoCivil.contentEquals("Casado")) {
			cliente.setEstadoCivil(EstadoCivil.Casado);
		}
		if(sexo.contentEquals("F")) {
			cliente.setSexo(Sexo.Femenino);
		}
		else if (sexo.contentEquals("M")) {
			cliente.setSexo(Sexo.Masculino);
		}
		if(licensed.contentEquals("S")) {
			isLicensed = true;	
		}
		prima.setCliente(cliente);
	}

	@When("I ask whether can calculate the premium")
	public void calculate_the_premium(){
		actualAnswer = prima.calcularPrima(isLicensed);
	}

	@Then("I should show {int}")
	public void i_should_show(int answer) {
		assertEquals(answer,actualAnswer);
	}

}