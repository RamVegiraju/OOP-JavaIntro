import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PancakeMakerTest {
	
	PancakeMaker pancakeMaker;
	

	@Test
	public void determineWholeFoodsOrder() {
		String[] requiredIngredients = { "flour","salt","soda","powder","buttermilk","egg" };
		String[] ingredientsIHave = null;
		//ArrayList<String> ingredientsIHave = new ArrayList<>();
		assertEquals(requiredIngredients, pancakeMaker.determineWholeFoodsOrder(ingredientsIHave));
	}

}
