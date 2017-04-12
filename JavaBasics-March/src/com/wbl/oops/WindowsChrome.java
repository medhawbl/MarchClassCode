package com.wbl.oops;

public class WindowsChrome implements IGoogleChrome{

	@Override
	public void searchBox() {
		System.out.println("windows chrome - searchBox");
	}

	@Override
	public String getBrowserDetails(String version) {
		return version;
	}

	@Override
	public void browserSettings() {
		System.out.println("windows chrome - settings");
	}

	@Override
	public void developerTools(String console, String netwrok, String toggleDevice) {
		
	}

}
