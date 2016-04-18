package eu.skillcraft.spring.context;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import static org.assertj.core.api.Assertions.assertThat;


public class ApplicationContextQualifierTest {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationContextQualifierTest.class);


	public interface Dependency {
		void doSomething();
	}


	public static class DependencyImpl1 implements Dependency {

		@Override
		public void doSomething() {
			LOG.info("do 1");
		}
	}

	public static class DependencyImpl2 implements Dependency {

		@Override
		public void doSomething() {
			LOG.info("do 2");
		}
	}

	public static class SomeService {


		public SomeService(Dependency dependency) {
			dependency.doSomething();
		}
	}

	@Configuration
	@ComponentScan
	public static class SimpleJavaConfig {}

	@Test
	public void should_use_qualifier_for_resolving_dependency() throws Exception {


	}
}
