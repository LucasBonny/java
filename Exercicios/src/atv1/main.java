package atv1;

import java.util.Locale;
import java.util.Scanner;
import Employee.employee;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		employee employee;
		employee = new employee();
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println("\nEmployee: "+ employee.Name + ", $ " + employee.NetSalary()+ "0");
		System.out.print("\nWhich percentage to increase salary? ");
		double loss = sc.nextDouble();
		double teste = employee.IncreaseSalary(loss);
		System.out.println("\nUpdated data: " + employee.Name + ", $ " + teste + "0");
		sc.close();
	}

}
