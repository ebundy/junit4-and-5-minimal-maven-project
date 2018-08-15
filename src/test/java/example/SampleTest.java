package example;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SampleTest {

	List<String> list;

	@BeforeEach
	void beforeEach() {
		list = new ArrayList<>();
	}

	@Test
	public void join() {
		list.add("foo");
		list.add("bar");
		Assertions.assertEquals("fooXbar", String.join("X", list));
	}

	@Test
	public void unjoin() {
		String joinedString = "fooXbar";
		String[] values = joinedString.split("X");
		Assertions.assertArrayEquals(new String[] { "foo", "bar" }, values);
	}
}
