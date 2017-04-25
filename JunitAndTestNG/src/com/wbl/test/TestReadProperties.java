package com.wbl.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.wbl.src.ReadProperties;

public class TestReadProperties {
	@Test(expected=FileNotFoundException.class)
	public void getCityTest() throws IOException{
		ReadProperties rp = new ReadProperties();
		rp.propertiesExample("City");
		Assert.assertEquals("Fremont", rp.propertiesExample("City"));
	}
}
