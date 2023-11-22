package VtigerPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsPractice {
@Test
public void practice()
{
	
	System.out.println("step 1");
	System.out.println("step 2");
	Assert.assertEquals(1, 1);
	System.out.println("pass");
}
	
	@Test
	public void practice2()
	{
		SoftAssert sa=new SoftAssert();
		System.out.println("step 3");
		System.out.println("step 4");
		sa.assertEquals("b", "a");
	System.out.println("step 5");
	sa.assertAll();
}
}
