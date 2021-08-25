package com.superigno.logging;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.superigno.logging.stackwalker.StackWalkerTraversalExample;

@SpringBootTest
class AllAboutLoggingApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void giveStalkWalker_whenInvokingFindCaller_thenFindCallingClass() {
		new StackWalkerTraversalExample().findCaller();
	}

}
