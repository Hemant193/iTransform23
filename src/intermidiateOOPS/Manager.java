package intermidiateOOPS;

public class Manager extends Employee {

	double incentive;
	
	public Manager(String name, double baseSalary, double incentive) {
		super(name, baseSalary);
		this.incentive = incentive;
	}
	
	public double calculateSalary() {
		return super.calculateSalary() + incentive;
	}
}
