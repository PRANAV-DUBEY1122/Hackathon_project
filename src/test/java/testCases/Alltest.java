package testCases;


import java.io.IOException;

import org.testng.annotations.Test;



import pages.upcomingBikes;
import pages.usedCars;
import pages.googleSignIn;
import testBase.Base;

public class Alltest extends Base
{

	
	@Test(priority =0)
	public void testGoogleSignIn() throws InterruptedException, IOException
	{
		googleSignIn signin = new googleSignIn(driver);
		
		
		signin.clickSignIn();
		signin.googleLogIn(driver);
		
		signin.getErrorMessage(driver);
		captureScreen("ErrorMessage");
		
		signin.navigation(driver);
		logger.info("Login page execution completed Successfully");
		
	}
	
	@Test(priority = 1)
	public void upComingBikes() throws Exception
	{
		upcomingBikes up = new upcomingBikes(driver);
		
		captureScreen("NewBikesMenu");
		up.newBikesMenu(driver);
	    
		captureScreen("UpcomingNewBikesMenu");
		up.selectUpcomingBike();
		
		captureScreen("ManufacturerDropdown");
		up.selectManufacturer();
		
		captureScreen("ViewMoreBikes");
		up.viewMoreBikes(driver);
		
		captureScreen("BikeModels");
		up.bikeModels();
		
		logger.info("Honda bike models in upcoming bikes executed successfully");
	}
	
	
	
	@Test(priority = 3)
	public void usedCars() throws InterruptedException, IOException {
		usedCars usedCars = new usedCars(driver);
		
		captureScreen("UsedCarsMenu");
		usedCars.usedCarsMenu(driver);
		
		captureScreen("UsedCarsInChennai");
		usedCars.selectChennaiUsedCars(driver);
		
		usedCars.modelList(driver);
		
		logger.info("Popular modals of used cars executed successfully");
	}
   
	
	
	
	
	
		
		
}