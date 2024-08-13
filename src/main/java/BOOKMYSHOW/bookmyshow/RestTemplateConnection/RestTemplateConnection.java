package BOOKMYSHOW.bookmyshow.RestTemplateConnection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConnection {

	@Bean
	public RestTemplate makeConnection()
	{
		return new RestTemplate();
	}
}
