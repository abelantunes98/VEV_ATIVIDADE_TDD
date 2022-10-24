package test;

import org.junit.jupiter.api.Test;

import src.Funcionario;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

	/* Teste de Gets e Sets */

	Funcionario funcionario = new Funcionario("Abel", "abel@email.com", 500, "DESENVOLVEDOR");

	@Test
	public void getNomeTest() {
		assertEquals("Abel", funcionario.getNome());
	}

	@Test
	public void getEmailTest() {
		assertEquals("abel@email.com", funcionario.getEmail());
	}

	@Test
	public void getSalarioTest() {
		assertEquals(500, funcionario.getSalario());
	}

	@Test
	public void getCargoTest() {
		assertEquals("DESENVOLVEDOR", funcionario.getCargo());
	}

	@Test
	public void setNomeTest() {
		funcionario.setNome("Joao");
		assertEquals("Joao", funcionario.getNome());
	}

	@Test
	public void setEmailTest() {
		funcionario.setEmail("joao@email.com");
		assertEquals("joao@email.com", funcionario.getEmail());
	}

	@Test
	public void setSalarioTest() {
		funcionario.setSalario(1000);
		assertEquals(1000, funcionario.getSalario());
	}

	@Test
	public void setJobTest() {
		funcionario.setCargo("DBA");
		assertEquals("DBA", funcionario.getCargo());
	}
}
