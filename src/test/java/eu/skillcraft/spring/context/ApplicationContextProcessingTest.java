package eu.skillcraft.spring.context;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;


public class ApplicationContextProcessingTest {

	public interface Dependency {
		void doSomething();
	}

	public static class DependencyImpl1 implements Dependency {

		@Override
		public void doSomething() {
			System.out.println("do 1");
		}
	}

	public static class SomeService {


		private final Dependency dependency;

		public SomeService(Dependency dependency) {
			this.dependency = dependency;
		}
	}

	@Configuration
	@ComponentScan
	public static class SimpleJavaConfig {

	}

	@Test
	public void should_create_application_context() throws Exception {

	}

}
