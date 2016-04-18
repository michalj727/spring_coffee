package eu.skillcraft.spring.events;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



public class ApplicationContextEventsTest {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationContextEventsTest.class);






	@Configuration
	@ComponentScan
	public static class SimpleJavaConfig {}

	@Test
	public void should_create_application_context() throws Exception {

	}
}
