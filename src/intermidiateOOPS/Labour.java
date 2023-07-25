package intermidiateOOPS;

public class Labour extends Employee {

	double overTime;

	public Labour(String name, double baseSalary, double overTime) {
		super(name, baseSalary);
		this.overTime = overTime;
	}
	
	public double calculateSalary() {
		return super.calculateSalary() + overTime;
	}

}
