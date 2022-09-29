package patikaSalaryCalculator;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("Memduh Firat Sahin", 5300.50, 50, 2018);

		System.out.println(employee.toString());

		System.out.println("Vergi : " + employee.tax());
		System.out.println("Bonus : " + employee.bonus());
		System.out.println("Maa� art��� : " + employee.raiseSalary());

		System.out.println("Vergi ve bonuslarla beraber toplam maa� : " + (employee.getSalary() - employee.tax() + employee.bonus()));
		System.out.println("Toplam maa� : " + (employee.getSalary() - employee.tax() + employee.bonus() + employee.raiseSalary()));

	}

}
