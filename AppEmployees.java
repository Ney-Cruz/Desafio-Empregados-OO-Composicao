package package10_EnumeracoesComposicao.challenge;

import java.util.Locale;
import java.util.Scanner;

import package10_EnumeracoesComposicao.challenge.entities.Adress;
import package10_EnumeracoesComposicao.challenge.entities.Department;
import package10_EnumeracoesComposicao.challenge.entities.Employee;

public class AppEmployees {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Nome do departamento: ");
		String deptName = scan.nextLine();
		
		System.out.print("Dia do pagamento: ");
		int payDay = scan.nextInt();
		
		
		System.out.print("Email: ");
		String email = scan.next();
		
		System.out.print("Telefone: ");
		String phone = scan.next();
		
	
		Adress adress = new Adress(email, phone);
		
		Department dept = new Department(deptName, payDay, adress);
		
		Employee employee = new Employee();
		
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = scan.nextInt();

		scan.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário " + i + ":");

			System.out.print("Nome: ");
			String employeeName = scan.nextLine(); 
			
			System.out.print("Salário: ");
			double salary = scan.nextDouble();
			
			scan.nextLine();

			employee = new Employee(employeeName, salary);
			
			dept.addEmployee(employee);
		}
		
		
		System.out.println(showRerport(dept, adress, employee));
		
		scan.close();
	}

	public static String showRerport(Department dept, Adress adress, Employee employee) {
		StringBuilder strBldReport = new StringBuilder();
		strBldReport.append("\nFOLHA DE PAGAMENTO:");
		strBldReport.append("\nDepartamento " + dept.getName() + " = R$ " + dept.payRoll() );
		strBldReport.append("\nPagamento realizado no dia " + dept.getPayDay());
		strBldReport.append("\nFuncionários:\n");
		strBldReport.append(dept.toString());
		strBldReport.append("Para dúvidas favor entrar em contato: " + adress.getEmail());
		
		return strBldReport.toString();
	}
	
}
