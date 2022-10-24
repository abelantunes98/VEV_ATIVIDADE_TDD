package src;

public class Calculadora {

	public Calculadora() {

	}

	public float calculaSalario(float salario, String cargo) {

		float taxa = 0;
		float salarioLiquido = 0;

		if (cargo.equals("DESENVOLVEDOR")) {
			
			if (salario >= 3000) {
				taxa = 20;
			} 
			else {
				taxa = 10;
			}
		}

		else if (cargo.equals("DBA")) {
			
			if (salario >= 2000) {
				taxa = 25;
			} 
			else {
				taxa = 15;
			}
		}

		else if (cargo.equals("TESTADOR")) {
			
			if (salario >= 2000) {
				taxa = 25;
			} 
			else {
				taxa = 15;
			}
		}

		else if (cargo.equals("GERENTE")) {
			
			if (salario >= 5000) {
				taxa = 30;
			} 
			else {
				taxa = 20;
			}
		}

		salarioLiquido = (salario - (salario * (taxa / 100)));

		return salarioLiquido;

	}

}
