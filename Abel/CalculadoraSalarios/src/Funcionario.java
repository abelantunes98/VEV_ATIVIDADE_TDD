package src;

public class Funcionario {

	private String name;
	private String email;
	private float salary;
	private String job;

	public Funcionario(String name, String email, float salary , String job) {
		
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
