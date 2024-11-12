package Manibela.Daedrico;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import Manibela.Daedrico.Controller.SetterInjectedController;
import Manibela.Daedrico.Services.GreetingServiceImpl;

@SpringBootTest
class SetterInjectedControllerTest {
	
	@Autowired
	SetterInjectedController setterInjectedController;

	@Test
	void sayHello() {
		System.out.println(setterInjectedController.sayHello());
	}

}
