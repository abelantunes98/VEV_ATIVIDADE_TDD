package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import src.Calculadora;
import src.Funcionario;

public class CalculadoraTest {

	Calculadora calculadora = new Calculadora();

	Funcionario funcionario1 = new Funcionario("Abel", "abel@email.com", 10000, "DESENVOLVEDOR");
	Funcionario funcionario2 = new Funcionario("Joao", "joao@email.com", 10000, "DBA");
	Funcionario funcionario3 = new Funcionario("Arthur", "arthur@email.com", 10000, "TESTADOR");
	Funcionario funcionario4 = new Funcionario("Arthur", "arthur@email.com", 20000, "GERENTE");

	// Verificando salario de desenvolvedor.
	@Test
	public void calculaSalarioDevTest() {
		assertEquals(8000, calculadora.calculaSalario(funcionario1.getSalario(), funcionario1.getCargo()));
	}

	// Verificando salario de DBA.
	@Test
	public void calculaSalarioDbaTest() {
		assertEquals(7500, calculadora.calculaSalario(funcionario2.getSalario(), funcionario2.getCargo()));
	}

	// Verificando salario de Testador.
	@Test
	public void calculaSalarioTestadorTest() {
		assertEquals(7500, calculadora.calculaSalario(funcionario3.getSalario(), funcionario3.getCargo()));
	}

	// Verificando salario de Gerente.
	@Test
	public void calculaSalarioGerenteTest() {
		assertEquals(14000, calculadora.calculaSalario(funcionario4.getSalario(), funcionario4.getCargo()));
	}

	// Verificando salario de desenvolvedor que se tornou gerente
	@Test
	public void calculaSalarioAlteraCargoTest() {
		Funcionario funcionario5 = new Funcionario("Pedro", "pedro@email.com", 15000, "DESENVOLVEDOR");
		assertEquals(12000, calculadora.calculaSalario(funcionario5.getSalario(), funcionario5.getCargo()));

		funcionario5.setCargo("GERENTE");
		assertEquals(10500, calculadora.calculaSalario(funcionario5.getSalario(), funcionario5.getCargo()));
	}
}
