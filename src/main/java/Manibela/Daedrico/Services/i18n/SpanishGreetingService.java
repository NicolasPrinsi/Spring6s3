package Manibela.Daedrico.Services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import Manibela.Daedrico.Services.GreetingService;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Poder Sombrero";
	}

}
