import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bean.inheritance.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = context.getBean(Employee.class);
		
		System.out.println("id:"+e.getId());
		System.out.println("Name:"+e.getName());
		System.out.println("Designation:"+e.getDesignation());
		System.out.println("Street name:"+e.getStreetName());
		System.out.println("city:"+e.getCity());
		System.out.println("zip:"+e.getZip());
		System.out.println("state:"+e.getState());
	}

}
