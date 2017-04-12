package com.wbl.oops;

import java.io.FileNotFoundException;

public class MacChrome implements IGoogleChrome,IChromeNewFeatures{
	
	@Override
	public void searchBox() {
		System.out.println("Mac chrome - searchBox");
	}

	@Override
	public String getBrowserDetails(String version) throws FileNotFoundException{
		return version;
	}

	@Override
	public void browserSettings() {
		System.out.println("Mac chrome - settings");
	}

	@Override
	public void developerTools(String console, String netwrok, String toggleDevice) {
		
	}

	@Override
	public void voiceSearch() {
		System.out.println("Mac - New voice search option for google");
	}

	@Override
	public void searchUsingDifferentLanguages() {
		// TODO Auto-generated method stub
		
	}

}
