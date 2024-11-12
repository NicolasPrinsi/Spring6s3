package Manibela.Daedrico;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import Manibela.Daedrico.Controller.MyController;

@SpringBootApplication
public class DaedricoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DaedricoApplication.class, args);
		
		MyController controller = ctx.getBean(MyController.class);
		
		System.out.println("In Main Method");
		
		System.out.println(controller.sayHello());
	}

}
