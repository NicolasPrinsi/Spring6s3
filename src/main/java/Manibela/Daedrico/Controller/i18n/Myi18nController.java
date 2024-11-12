package Manibela.Daedrico.Controller.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import Manibela.Daedrico.Services.GreetingService;
@Controller
public class Myi18nController {

	private final GreetingService greetingService;

	public Myi18nController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
