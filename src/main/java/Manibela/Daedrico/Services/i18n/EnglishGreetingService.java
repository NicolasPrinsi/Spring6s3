package Manibela.Daedrico.Services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import Manibela.Daedrico.Services.GreetingService;

@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "the only metric i know is 9mm";
	}

}
