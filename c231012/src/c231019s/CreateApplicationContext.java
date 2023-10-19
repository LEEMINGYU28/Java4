package c231019s;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

@Configuration
public class CreateApplicationContext {
	public static void main(String[]args) {
		new GenericXmlApplicationContext("applicationContext.xml");
	}
}
