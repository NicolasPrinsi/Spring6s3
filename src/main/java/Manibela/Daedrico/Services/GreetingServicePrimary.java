package Manibela.Daedrico.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

	
	public String sayGreeting() {
		return "Herro from puraimari beanu";
	}

}
