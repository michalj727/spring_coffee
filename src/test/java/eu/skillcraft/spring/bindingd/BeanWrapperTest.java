package eu.skillcraft.spring.bindingd;

import com.google.common.base.MoreObjects;
import org.junit.Test;


public class BeanWrapperTest {

	class User {
		String name;
		int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return MoreObjects.toStringHelper(this)
					.add("name", name)
					.add("age", age)
					.toString();
		}
	}


	@Test
	public void should_set_properties() throws Exception {

	}

}
