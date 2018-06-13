package basictestngtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertExample2Test {

@Test
public void test3() {
	String expected = "A";
	String actual = "B";
	Assert.assertFalse(actual.equals(expected));	
	System.out.println("TestNGAssertExample2Test");
}	
}
