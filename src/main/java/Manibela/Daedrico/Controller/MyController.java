package Manibela.Daedrico.Controller;

import org.springframework.stereotype.Controller;

import Manibela.Daedrico.Services.GreetingService;
import Manibela.Daedrico.Services.GreetingServiceImpl;

@Controller
public class MyController {

	private final GreetingService greetingService;
	
	public MyController() {
		this.greetingService = new GreetingServiceImpl();
	}

	public String sayHello() {
		System.out.println("In Enemy Controller");
		return greetingService.sayGreeting();
	}
}
