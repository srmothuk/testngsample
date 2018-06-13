package basictestngtests;

import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;

public class TestNGAssertExample1Test {
	TestNGExample1 example1 = new TestNGExample1();
	
	@Test
	public void TruncateInFirst2PositionsTest_StartingWithNonAA_Test1() {
		Assert.assertEquals("CDAA", example1.TruncateInFirst2Positions("CDAA"));		
		Assert.assertEquals("CDAA", example1.TruncateInFirst2Positions("ACDAA"));
		System.out.println("in TruncateInFirst2PositionsTest_StartingWithNonAA_1");
	}
	
	@Test
	public void TruncateInFirst2PositionsTest_StartingWithAA_Test2() {
		Assert.assertEquals("C",example1.TruncateInFirst2Positions("AAC"));
		Assert.assertEquals("CD",example1.TruncateInFirst2Positions("AACD"));		
		System.out.println("in TruncateInFirst2PositionsTest_StartingWithNonAA_2");
	}
	@Test
	public void FirstAndLast2CharsTheSameTest_BasicPositiveScenario_Test3() {
		Assert.assertTrue(example1.areFirstAndLast2CharsTheSame("ABAB"));
		System.out.println("in TruncateInFirst2PositionsTest_StartingWithNonAA_3");
	}

	@Test
	public void FirstAndLast2CharsTheSameTest_BasicNegativeScenario_Test4() {
		Assert.assertFalse(example1.areFirstAndLast2CharsTheSame("ABCD"));
		System.out.println("in TruncateInFirst2PositionsTest_StartingWithNonAA_4");
	}

}
