package test;

import org.junit.jupiter.api.Test;

import src.Funcionario;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {
	
	
	/* Teste de Gets e Sets */
	
	Funcionario funcionario = new Funcionario("Abel", "abel@email.com", 500, "DESENVOLVEDOR");
	@Test
    public void getNameTest(){
        assertEquals("Abel", funcionario.getName());
    }
	
	@Test
    public void getEmailTest(){
        assertEquals("abel@email.com", funcionario.getEmail());
    }
	
	@Test
    public void getSalaryTest(){
        assertEquals(500, funcionario.getSalary());
    }
	
	@Test
    public void getJobTest(){
        assertEquals("DESENVOLVEDOR", funcionario.getJob());
    }
	
	@Test
    public void setNameTest(){
		funcionario.setName("Joao");
        assertEquals("Joao", funcionario.getName());
    }
	
	@Test
    public void setEmailTest(){
		funcionario.setEmail("joao@email.com");
        assertEquals("joao@email.com", funcionario.getEmail());
    }
	
	@Test
    public void setSalaryTest(){
		funcionario.setSalary(1000);
        assertEquals(1000, funcionario.getSalary());
    }
	
	@Test
    public void setJobTest(){
		funcionario.setJob("DBA");
        assertEquals("DBA", funcionario.getJob());
    }
}
