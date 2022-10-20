package salaryCalculation;

public class Employee {

	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	
	
	void Employee(String name, double salary, int workHours, int hireYear){
		
		
	
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		
		
		
	}
		
	
	
	public double tax() {
		
		if(this.salary >= 1000) {
			
		return salary*3/100; 

		}
		
		return 0.0;
	}
	
	
	public double bonus() {
		
		int extra = this.workHours-40;
		
		if(extra>0) {
			return (30 * extra)*4; 
		}
		return 0.0;
	}
	
	
	public double raiseSalary() {
		
		//vergi ve bonus dikkate alındığında maaş = vbSalary
		double vbSalary = salary + bonus() - tax();
		
		int year = 2021 - this.hireYear;
		if(year < 10) {
			double raisedSalary = vbSalary + vbSalary*5/100;
			return raisedSalary - salary;
			
		}else if(year <= 10 && year <20) {
			double raisedSalary = vbSalary + vbSalary*10/100;
			return raisedSalary - salary;
			
			
		}else {
			double raisedSalary = vbSalary + vbSalary*15/100;
			return raisedSalary - salary;
			
		}
	}
	
	

	
	void ToString(){
		
		
		System.out.println("Çalışanın adı: " + name);
		
		System.out.println("Çalışanın maaşı: " + salary);
		
		System.out.println("Çalışma saati: " + workHours);
		
		System.out.println("Başlangıç yılı: " + hireYear);
		
	
		System.out.println("Vergi: " + tax());
		
		System.out.println("Bonus: " + bonus());
		
		System.out.println("Maaş artışı: " + raiseSalary());
		
		
		double vbSalary = salary - tax() + bonus();
		System.out.println("Vergi ve bonuslarla birlikte maaş: " + vbSalary);
		
		
		double total= salary + raiseSalary();
		System.out.println("Toplam maaş: " + total);
	}
}
