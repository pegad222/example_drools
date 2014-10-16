package springaop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SimpleService simpleService = (SimpleService) context.getBean("simpleServiceBean");
		simpleService.payCommisionRule1();
		simpleService.payCommisionRule2();
		context.close();

	}

}
