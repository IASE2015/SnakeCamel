package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamel() {
		//fail("Not yet implemented");
		String expected = "NewYork";
		String actual = SnakeCamelUtil.snakeToCamelcase("new_yoke");
		assertThat(actual,is(expected));
	}
	@Test
	public void camelToSnake(){
		String expected = "an_doughnut";
		String actual = SnakeCamelUtil.camelToSnakecase("AnDoughnut");
		assertThat(actual,is(expected));
	}
	@Test(expected=IllegalArgumentException.class)
	public void ExceptionInSnake(){
		String test = "aiueo";
		SnakeCamelUtil.snakeToCamelcase(test);
	}
	@Test(expected=IllegalArgumentException.class)
	public void ExceptionInCamel(){
		String test = "bookforest";
		SnakeCamelUtil.camelToSnakecase(test);
	}
}
