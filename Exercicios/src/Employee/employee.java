package Employee;

public class employee {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		double res = GrossSalary - Tax;
		return res;
	}
	public double IncreaseSalary(double percentage) {
		return (GrossSalary + (GrossSalary *  0.10)) - Tax;
	}
}
