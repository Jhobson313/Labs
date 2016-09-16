import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BatterTest {

	@Test
	public void whenBaseEarned0_1ExpectedBattingAverageIs_500(){
		Batter b = new Batter();
		Assert.assertEquals(.500, b.calculateBattingAverage(0,1));
	}

	private boolean Equals(double d, double calculateBattingAverage) {
		
		return false;
	}
}
