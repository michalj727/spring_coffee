package eu.skillcraft.spring.resources;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



public class ApplicationContextResourceTest {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationContextResourceTest.class);




	@Configuration
	@ComponentScan(resourcePattern = "**/ApplicationContextResourceTest*.class")

	public static class SimpleJavaConfig {}

	@Test
	public void should_create_application_context() throws Exception {



	}
}
