package Manibela.Daedrico.i18n;

import static org.junit.jupiter.api.Assertions.*; 

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import Manibela.Daedrico.Controller.i18n.Myi18nController;

@ActiveProfiles("EN")
@SpringBootTest
class Myi18nControllerENTest {
	
	@Autowired
	Myi18nController myi18nController;
	
	@Test
	void sayHello() {
		System.out.println(myi18nController.sayHello());
	}

}
