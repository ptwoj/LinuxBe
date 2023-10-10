package com.example.linuxbe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LinuxBeApplicationTests {

	@Test
	void test() {
		Assertions.assertEquals(1+2, 3);
	}

}
