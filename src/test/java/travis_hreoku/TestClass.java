package travis_hreoku;

import static org.junit.Assert.assertEquals;
import myapp.MyController;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void returnValidJSON(){
		assertEquals("{\"id\":123}", new MyController().test(""));
	}
}
