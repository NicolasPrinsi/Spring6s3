package Manibela.Daedrico.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import Manibela.Daedrico.Services.GreetingService;

@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;
	
	@Qualifier("JetStreamSam")
	@Autowired
	public void setGreetingService(GreetingService greetingservice) {
		System.out.println("Seteador");
		this.greetingService=greetingservice;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
