

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 void main() {
	 ApplicationContext cont = new ClassPathXmlApplicationContext("context.xml");
 }
}
