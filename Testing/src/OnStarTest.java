import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OnStarTest {

	@Test
	public void calculateMileageTest() {
		OnStar myOnStar = new OnStar();
		//.01 is the range within which the answer is still good
		//10.0 is the answer we expect
		//the message you want to send if a wrong answer 
		assertEquals(10.0, myOnStar.calculateMileage(100., 10), .01, "Incorrect mileage returned travelling 100 miles on 10 gallons");
	}
	
	@Test
	public void calculateAverageSpeedTest() {
		OnStar myOnStar = new OnStar();
		double[] speedHistory = {10.,11.,12.};
		assertEquals(11, myOnStar.calculateAverageSpeed(speedHistory), .01);
		
	}

}
