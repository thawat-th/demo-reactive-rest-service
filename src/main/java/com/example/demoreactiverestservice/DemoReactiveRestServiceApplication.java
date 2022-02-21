package com.example.demoreactiverestservice;

import com.example.demoreactiverestservice.hello.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoReactiveRestServiceApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoReactiveRestServiceApplication.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(DemoReactiveRestServiceApplication.class, args);

		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		// We need to block for the content here or the JVM might exit before the message is logged
		System.out.println(">> message = " + greetingClient.getMessage().block());
	}

}
