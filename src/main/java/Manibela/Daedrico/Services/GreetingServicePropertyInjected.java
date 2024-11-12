package Manibela.Daedrico.Services;

import org.springframework.stereotype.Service;

@Service("Armstrong")
public class GreetingServicePropertyInjected implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Nanomachines son";
	}

}
