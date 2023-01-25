package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class hierarchy {
	@Test(dataProvider = "dp",dataProviderClass = hierarchy.class)
	public void faat(String[][] data){
		for (int k = 0; k < data.length; k++) {
			for (int l = 0; l < data.length; k++) {
				System.out.println(data[l][k]);
			} 
		}
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");

	}


	@DataProvider
	public Object[][] dp() {
		String[][] object=new String[3][2];
		object[0][0]="Demosalesmanager";
		object[0][1]="crmsfa";
		object[1][0]="dinseh";
		object[1][1]="pooja";
		object[2][0]="riya";
		object[2][1]="savit";
		return object;

	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("beforeMethod");

	}

}
