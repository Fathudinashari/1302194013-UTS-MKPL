package lib;

public class EmployeeSalary {

	private String employeeId;
	
	private boolean isForeigner;
	
	public void Employee(String employeeId, boolean isForeigner) {
		this.employeeId = employeeId;
		this.isForeigner = isForeigner;
		
	}

	
	public void setMonthlySalary(int grade) {	
		int monthlySalary;
        if (grade == 1) {
			monthlySalary = 3000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
	}

    
}
