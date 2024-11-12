package Manibela.Daedrico;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import Manibela.Daedrico.Controller.MyController;

@SpringBootTest
class DaedricoApplicationTests {
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Autowired
	MyController myController;
	
	@Test
	void testAutowiredController() {
		System.out.println(myController.sayHello());
	}
	
	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);
		
		System.out.println(myController.sayHello());
	}
	@Test
	void contextLoads() {
	}

}
