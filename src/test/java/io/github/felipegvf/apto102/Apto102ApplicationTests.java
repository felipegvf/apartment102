package io.github.felipegvf.apto102;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class Apto102ApplicationTests {

	@Test
	void contextLoads() {
	}

}
