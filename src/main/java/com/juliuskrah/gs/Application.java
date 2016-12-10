package com.juliuskrah.gs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

	@Bean
	public MessageService messageService() {
		return () -> "Hello World!";
	}

	public static void main(String... args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
		MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);

		messagePrinter.printMessage();

		((AnnotationConfigApplicationContext) applicationContext).close();
	}
}
