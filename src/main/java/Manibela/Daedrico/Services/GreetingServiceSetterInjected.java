package Manibela.Daedrico.Services;

import org.springframework.stereotype.Service;

@Service("JetStreamSam")
public class GreetingServiceSetterInjected implements GreetingService{

	public String sayGreeting() {
		return "There will be blood shed";
	}

}
