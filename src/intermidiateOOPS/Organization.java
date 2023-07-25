package intermidiateOOPS;

public class Organization {

	public static void main(String[] args) {

		Employee e1 = new Manager("Saurabh", 40000, 400);
		Employee e2 = new Labour("John", 30000, 3000);

		Employee e3 = new Manager("Rehan", 50000, 5000);
		Employee e4 = new Labour("Cena", 40000, 4000);

		Employee[] employee = { e1, e2, e3, e4 };
		
		System.out.println(calculateTotalSalary(employee));

	}
	
	static double calculateTotalSalary(Employee[] employee) {
		double totalSalary = 0;
		
		for(Employee e : employee) {
			totalSalary += e.calculateSalary();
		}
		return totalSalary;
	}

}
