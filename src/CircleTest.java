import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

	@Test
	public void whenRaduis1ExpectCircumference6_28() {
		Circle circle = new Circle(1);
		String myCircumference = circle.getFormattedCircumference();
		Assert.assertEquals("6.28", myCircumference);

	}

	@Test
	public void whenRaduis0ExpectCircumference0() {
		Circle circle = new Circle(0);
		String myCircumference = circle.getFormattedCircumference();
		Assert.assertEquals("0", myCircumference);
	}
	@Test(expected = IllegalArgumentException.class)
	public void whenRaduisNegativeExpectThrowIllegalArguementExeception() {
		Circle circle = new Circle(-1);
		String myCircumference = circle.getFormattedCircumference();
		Assert.assertEquals("-1", myCircumference);
	}
	
}
