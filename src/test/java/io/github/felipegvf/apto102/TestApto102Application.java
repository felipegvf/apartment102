package io.github.felipegvf.apto102;

import org.springframework.boot.SpringApplication;

public class TestApto102Application {

	public static void main(String[] args) {
		SpringApplication.from(Apto102Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
