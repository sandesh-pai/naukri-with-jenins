package com.naukri.testcases;

import org.testng.annotations.Test;

import com.naukri.Driver.DriverManager;
import com.naukri.pom.MyNaukriPage;
import com.naukri.pom.jobseekerPage;
import com.naukri.pom.loginpage;
import com.naukri.utils.readproperty;

import config.config;

public class loginpagetest extends BasePage{
	
	
	
	
	
	@Test
	public void login()
	{
		loginpage lp = new loginpage();
		  lp.hoverOnForEmployer().employerlogin().switchDriver().clickJonseeker().pause(3000);;
		  
		  jobseekerPage jp = new jobseekerPage();
		  jp.username(readproperty.getvalue(config.username)).pwd(readproperty.getvalue(config.password)).login();
		  
		  MyNaukriPage mnp = new MyNaukriPage();
		  mnp.searchbtn().updateProfile();
		  
		  mnp.scrollto().pause(2000);
		  mnp.resumeupload(config.fileupload);
		  
	       System.out.println(DriverManager.getDriver().getTitle());
	}
	

	

}
