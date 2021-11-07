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
	
	@Given("the client is over 80 years old")
	public void client_over_80_years_old(){
		cliente.setEdad(80);
		cliente.setEstadoCivil(EstadoCivil.Casado);
		cliente.setSexo(Sexo.Masculino);
		prima.setCliente(cliente);
	}
	@Given("the client is {string} years old")
	public void the_client_is_years_old(String string) {
		cliente.setEdad(Integer.parseInt(string));
		cliente.setEstadoCivil(EstadoCivil.Casado);
		cliente.setSexo(Sexo.Masculino);
		prima.setCliente(cliente);
	}
	
	@When("I ask whether can calculate the premium")
	public void calculate_the_premium(){
		actualAnswer = prima.calcularPrima(true);
	}
	
	
	@Then(" I should show -1")
	public void should_show(){
		assertEquals(-1,actualAnswer);
	}
	
	@Then("I should show {string}")
	public void i_should_show(String string) {
		assertEquals(-1,actualAnswer);
	}

}