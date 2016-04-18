package eu.skillcraft.spring.context;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ApplicationContextTest {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationContextTest.class);


	public static class SomeService {

		public SomeService() {
		}

		void doSomething() {
			LOG.info("getting pump");
		}
	}


	public static class SimpleJavaConfig {}

	@Test
	public void should_create_application_context() throws Exception {

	}
}
