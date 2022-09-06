package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;


import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	/**
	 * @author Neriyarasan
	 * @param
	 * Hooks class
	 * Before and After Class
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	
	@Before
	public void before() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browser"));
		getUrl(getPropertyFileValue("url"));

	}
   @After
   public void after() {
	   
	   driver.quit();

}
}
