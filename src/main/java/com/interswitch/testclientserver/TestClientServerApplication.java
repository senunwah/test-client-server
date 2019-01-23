package com.interswitch.testclientserver;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TestClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestClientServerApplication.class, args);
	}

}

