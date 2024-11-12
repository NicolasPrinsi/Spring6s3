package Manibela.Daedrico.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import Manibela.Daedrico.Services.GreetingService;

@Controller 
public class PropertyInjectedController {
	
	@Qualifier("Armstrong")
	@Autowired
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
