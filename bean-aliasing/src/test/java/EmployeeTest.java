import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		Employee e1 = (Employee)container.getBean("name1");
		Employee e2 = (Employee)container.getBean("name2");
		Employee e3 = (Employee)container.getBean("name3");
		Employee e4 = (Employee)container.getBean("name4");
		Employee e5= (Employee)container.getBean("namex1");
		Employee e6= (Employee)container.getBean("namex2");
		System.out.println("hash code e1:"+e1.hashCode());
		System.out.println("hash code e2:"+e2.hashCode());
		System.out.println("hash code e3:"+e3.hashCode());
		System.out.println("hash code e4:"+e4.hashCode());
		System.out.println("hash code e5:"+e5.hashCode());
		System.out.println("hash code e6:"+e6.hashCode());
	}

}
