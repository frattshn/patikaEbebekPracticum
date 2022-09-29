package patikaSalaryCalculator;

public class Employee {

	private String name;
	private Double salary;
	private Integer workHours;
	private Integer hireYear;

	public Employee(String name, Double salary, Integer workHours, Integer hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public Double tax() {
		if (this.getSalary() > 1000) {
			return this.getSalary() * 0.03;
		}
		return this.getSalary();
	}

	public Double bonus() {
		if (this.getWorkHours() > 40) {
			return (this.getWorkHours() - 40) * 30.0;
		}
		return Double.valueOf(0);
	}

	public Double raiseSalary() {
		Integer workYears = 2021 - this.getHireYear();
		if (workYears < 10) {
			return this.getSalary() * 0.05;
		} else if (workYears > 9 && workYears < 20) {
			return this.getSalary() * 0.10;
		} else if (workYears > 19) {
			return this.getSalary() * 0.15;
		} else {
			return Double.valueOf(0);
		}
	}
	

	@Override
	public String toString() {
		return String.format(
				"Adý ve soyadý : %s \nMaaþý : %f \nHaftalýk çalýþma saati : %d \nÝþe giriþ yýlý : %d \n\n",
				this.getName(), this.getSalary(), this.getWorkHours(), this.getHireYear());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getWorkHours() {
		return workHours;
	}

	public void setWorkHours(Integer workHours) {
		this.workHours = workHours;
	}

	public Integer getHireYear() {
		return hireYear;
	}

	public void setHireYear(Integer hireYear) {
		this.hireYear = hireYear;
	}

}
