package Manibela.Daedrico.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hero EveryNya de Servicio Pasta Base";
	}

}
