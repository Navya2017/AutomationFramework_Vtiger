package VtigerPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {
@Test(priority=0)
	public void createCustomer()//if failed  depends on method will fail
	{
	Assert.fail();
		System.out.println("create");
	}
//@Test(invocationCount=0)
@Test(dependsOnMethods="createCustomer")
public void modifyCustomer()
{
	System.out.println("modify");
}
@Test(enabled=false)
public void deleteCustomer()
{
	System.out.println("delete");
}

}
