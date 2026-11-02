package TestCase;

import org.testng.annotations.Test;

//open the app
//login 
//logout


public class MyFirstTestCaseDemo {
	@Test(priority=1)
	void Login()
	{
		System.out.println("Loging to the appalication ");
		
	}
	@Test(priority=0)
	void oepnapp()
	{
		System.out.println("Opening the appliactaion ");
	}
	@Test(priority=-1)
	
	void Logout()
	{
		System.out.println("Logout to the applaication ");
	}

}
