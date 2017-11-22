import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.hands.on.java.dto.Address;
import org.hands.on.java.dto.Employee;

public class EmployeeManipulatorImpl extends EmployeeManipulator{

	private static List<Employee> employeeList;
	
	public EmployeeManipulatorImpl() {
		
	}
	
	static {
		employeeList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			//create address instance
			Address address = new Address();
			address.setCity(RandomStringUtils.random(5));
			address.setLandmark(RandomStringUtils.random(5));
			address.setStreet(RandomStringUtils.random(5));
			
			//create employee instance and add address to it
			Employee employee = new Employee();
			employee.setId(RandomUtils.nextInt());
			employee.setAge(RandomUtils.nextInt(18, 36));
			employee.setName(RandomStringUtils.randomAlphabetic(5));
			employee.setAddress(address);
			employeeList.add(employee);
		}
		
	}
	
	/**
	 * @returns employee list initially filled
	 */
	public List<Employee> getEmployeeList(){
		return employeeList;
	}
}
