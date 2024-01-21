package package10_EnumeracoesComposicao.challenge.entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int payDay;
	
	private Adress adress;
	
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
	}

	public Department(String name, int payDay, Adress adress) {
		this.name = name;
		this.payDay = payDay;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}


	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}

	public double payRoll() {
		
		double totalPayRoll = 0.00;
		for(Employee employee : employees) {
			totalPayRoll += employee.getSalary();
		}
		
		return totalPayRoll;
	}
	
	@Override
	public String toString() {
		StringBuilder strBdrEmployee = new StringBuilder();
		for(Employee employee : employees) {
			strBdrEmployee.append( employee.getName() + "\n" );
		}
		return strBdrEmployee.toString();
	}


}
