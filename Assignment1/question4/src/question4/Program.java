package question4;

//4. Create array of employees and search employee by i. empid ii. name iii. salary

public class Program {
	
public static Employee linearSearch(Employee arr[], Employee key) {
		
		for(Employee emp : arr) {
			if(emp.getEid() == key.getEid()) return emp;
			else if(emp.getName() == key.getName()) return emp;
			else if(emp.getSalary() == key.getSalary()) return emp;
		}
		return null;
	}
	
	public static Employee binarySearch(Employee arr[], Employee key) {
		
		int start = 0, end = arr.length -1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(arr[mid].getEid() == key.getEid()) return arr[mid];
			else if(arr[mid].getEid() > key.getEid()) end = mid -1;
			else start = mid + 1;		
		}
		return null;
	}


	public static void main(String[] args) {

		Employee[] empArr = new Employee[6];
		
		empArr[0] = new Employee(101, "Ram", 50000.00);
		empArr[1] = new Employee(102, "Sham", 60000.00);
		empArr[2] = new Employee(103, "Radha", 45000.00);
		empArr[3] = new Employee(104, "Sachin", 50700.00);
		empArr[4] = new Employee(105, "Rohit", 90000.00);
		empArr[5] = new Employee(106, "Hardik", 25000.00);
		
		//Test for search employee by Id		
		Employee searchById = new Employee();
		searchById.setEid(101);
		Employee result1 = linearSearch(empArr, searchById);
		Employee result2 = binarySearch(empArr, searchById);
		System.out.println(result1 == null ? "Employee Not Found" : result1.toString());
		System.out.println(result2 == null ? "Employee Not Found" : result2.toString());
		
		//Test for search employee by Name		
		Employee searchByName = new Employee();
		searchByName.setName("Sham");
		Employee result3 = linearSearch(empArr, searchByName);
		System.out.println(result3 == null ? "Employee Not Found" : result3.toString());
		
		//Test for search employee by Salary		
		Employee searchBySalary = new Employee();
		searchBySalary.setSalary(25000.00);
		Employee result4 = linearSearch(empArr, searchBySalary);
		System.out.println(result4 == null ? "Employee Not Found" : result4.toString());
				
	}

}
