package Manibela.Daedrico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import Manibela.Daedrico.Controller.PropertyInjectedController;
import Manibela.Daedrico.Services.GreetingServiceImpl;

@SpringBootTest
class PropertyInjectedControllerTest {

	@Autowired
	PropertyInjectedController propertyInjectedController;
	
	/*
	 * @BeforeEach void setUp() { propertyInjectedController = new
	 * PropertyInjectedController(); propertyInjectedController.greetingService =
	 * new GreetingServiceImpl(); }
	 */
	
	@Test
	void sayHello() {
		System.out.println(propertyInjectedController.sayHello());
	}

}
