package Manibela.Daedrico;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import Manibela.Daedrico.Controller.MyController;

@SpringBootTest
class MyControllerTest {

	@Test
	void sayHello() {
		MyController myController = new MyController();
		
		System.out.println(myController.sayHello());
	}

}
