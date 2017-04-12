package com.wbl.oops;

import java.io.IOException;

public interface IGoogleChrome {
	
	//interface is used to declare a contract/rules which sib classes should follow
	public void searchBox();
	
	public String getBrowserDetails(String version) throws IOException;
	
	public void browserSettings();
	
	public void developerTools(String console, String netwrok, String toggleDevice);
	
	

}
